package ch06;



public class TvTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv t;		// Tv 인스턴스(객체)를 참조하기 위한 변수 t를 선언			-> Tv클래스를 <사용자 정의 타입> 이라고 한다
		t=new Tv();	// Tv 인스턴스(객체)를 생성한다.
		t.channel=7;// Tv 인스턴스(객체)의 멤버변수 channel의 값을 7로 한다.
		t.channelDown();	// Tv 인스턴스(객체)의 메소드 channelDown()을 호출한다
		System.out.println("현재 채널은 "+t.channel+" 입니다.");
	}

}
