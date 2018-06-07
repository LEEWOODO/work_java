package ch04;

public class Exercise4_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=10;
		for(int x=0;x<=10;x++) {
			for(int y=0;y<=10;y++) {
				if(sum==2*x+4*y) {
					System.out.printf("x=%d,  y=%d%n",x,y);
				}
			}
		}
	}

}
