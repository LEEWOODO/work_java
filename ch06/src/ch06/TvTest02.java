package ch06;

// 패키지 내부에 선언된 Tv 클래스를 이용한다.

public class TvTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv t1=new Tv();
		Tv t2=new Tv();
		System.out.println("t1의 channel값은 "+t1.channel+" 입니다.");
		System.out.println("t1의 channel값은 "+t2.channel+" 입니다.");
	
		t1.channel=7;	// channel 값을 7으로 한다.
		System.out.println("t1의 값을 7로 변경하였습니다.");
		
		System.out.println("t1의 channel값은 "+t1.channel+" 입니다.");
		System.out.println("t1의 channel값은 "+t2.channel+" 입니다.");
	
	}

}
