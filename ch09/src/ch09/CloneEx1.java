package ch09;

class Point implements Cloneable{
	int x,y;
	
	public Point(int i, int j) {
		// TODO Auto-generated constructor stub
		this.x=i;
		this.y=j;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	public Object clone() {
		Object obj=null;
		try {
			obj=super.clone();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return obj;
	}
	
}

public class CloneEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point original=new Point(3,5);
		Point copy=(Point)original.clone();
	
		System.out.println(original);
		System.out.println(copy);
		System.out.println(original.hashCode());
		System.out.println(copy.hashCode());

		
	}

}
