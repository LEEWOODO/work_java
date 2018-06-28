package ch06;

public class TvTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv t1=new Tv();
		Tv t2=new Tv();
		System.out.println("t1의 channel값은 "+t1.channel+" 입니다.");
		System.out.println("t1의 channel값은 "+t2.channel+" 입니다.");
		
		t2=t1;		// t1이 저장하고 있는 값(주소)를 t2에 저장한다. 객체 이름은 다르지만 같은 객체의 주소를 가르키고있다.
		t1.channel=7;
		
		System.out.println("t1의 channel값을 7로 변경하였습니다.");
		
		System.out.println("t1의 channel값은 "+t1.channel+" 입니다.");
		System.out.println("t1의 channel값은 "+t2.channel+" 입니다.");
	}

}
