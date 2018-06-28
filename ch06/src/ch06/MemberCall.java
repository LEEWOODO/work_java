package ch06;
/*
 * 인스턴스 변수는 클래스 변수를 사용할 수 있지만
 * 클래스변수 (static)은 인스턴스 변수를 사용할 수 없다. 
 * ---> 사용하려면 객체를 생성(new)하고 그 객체의 인스턴스를 클래스 변수에 넣어서 사용해야한다.
 */
public class MemberCall {
	int iv=10;	// MemberCall 클래스의 인스턴스 변수
	static int cv=20;	// static이 붙으면 class 변수 이다. --- MemberCall클래스의 클래스 변수
	
	int iv2=cv;
	// static int cv2=iv;	에러. 클래스변수는 인스턴스 변수를 사용할 수 없음.
	static int cv2=new MemberCall().iv;
	
	static void staticMethod1() {
		System.out.println(cv);
	//	System.out.println(iv); 에러. 클래스메소드에서 인스턴스 변수를 사용 불가
		MemberCall c=new MemberCall();
		System.out.println(c.iv);
	}

	void instanceMethod1() {
		System.out.println(cv);
		System.out.println(iv);	// 인스턴스 메소드에서는 인스턴스변수를 바로 사용가능
	}
	static void staticMethod2() {
		staticMethod1();
	//	instanceMethod1(); 에러. 클래스메서드에서는 인스턴스메소드를 호출 할 수 없음.
		MemberCall c=new MemberCall();
		c.instanceMethod1();
		
		new MemberCall().instanceMethod1();
		new MemberCall().instanceMethod2();	// 이와 같이 한 줄로도 사용가능한다. 대신 참조변수를 선언하지 않았기 때문에 생성된 MemberCall 인스턴스는 더 이상 사용 X
	}
	void instanceMethod2() {
		staticMethod1();
		instanceMethod1();
	}

}
