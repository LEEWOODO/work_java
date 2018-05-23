package ch02;

public class VarEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * -------8진수는 맨앞에 0을 붙인다. octopus
		 * -------16진수는 0x를 붙인다.	     octopus * 2= 16
		 * -------2진수는 0b를 붙인다.
		 */
		// 리터럴의 타입과 접미사
		int octNum=010;		// 8진수 10, 10진수로 8    
		int hexNum=0x10;	// 16진수 10, 10진수로 16
		int bunNum=0b10;	// 2진수 10, 10진수로 2 (JDK 1.7버전부터 사용가능)
		
		// 숫자 중간에 _(underBar)는 JDK 1.7버전부터 사용가능
		// long 타입은 맨 뒤에 타입을 맞춰주기 위해 L를 붙여야한다. 
		// 정수는 기본적으로 int형으로 인식되기 때문에 L을 붙여준다. 
		// 실수는 기본적으로 double형으로 인식되기 때문에 D를 붙여준다.
		long big=100_000_000_000L;	// 1.7버전 이전에는 long big= 100000000000L; 이렇게 썻다. 실무에선 이것 사용
		long hex=0xFFFF_FFFF_FFFF_FFFFL;	// long hex= 0xFFFFFFFFFFFFL;
		
		float pi=3.14f;		// 접미사 f 대신 F를 사용해도 된다.
		double rate=1.618d;	// 접미사 d 대신 D를 사용해도 되고, 생략해도 된다.
		// float pi= 3.14;		// 에러. float타입 변수에 double타입 리터럴 저장불가
		// double rate= 1.618;	// OK. 접미사 d, D는 생략할 수 있다.
		
		System.out.println("octNum: "+octNum);
		System.out.println("hexNum: "+hexNum);
		System.out.println("bunNum: "+bunNum);
		System.out.println("big: "+big);
		System.out.println("hex: "+hex);
		System.out.println("pi: "+pi);
		System.out.println("rate: "+rate);
		
		// 타입의 불일치
		int i='A';		// OK. 문자'A'의 유니코드인 65가 변수 i에 저장된다.
		long l=123;		// OK. int보다 long타입이 더 범위가 넓다.
		double d=3.14f;	// OK. float 보다 double타입이 더 범위가 넓다.
	//	int ii=0x123456789;	// error. int 타입의 범위를 넘는 값을 저장
	//	float ff=3.14;		// error. float 타입보다 double 타입의 범위가 넓다
		byte bb=65;			// OK. byte타입에 저장 가능한 범위의 int 타입 리터럴. 바이트는 -128   ~   127
		short ss=0x1234;	// OK. short타입에 저장 가능한 범위의 int 타입 리터럴.
		
		System.out.println("i: "+i);
		System.out.println("l: "+l);
		System.out.println("d: "+d);
	//	System.out.println("ii: "+ii);
	//	System.out.println("ff: "+ff);
		System.out.println("bb: "+bb);
		System.out.println("ss: "+ss);
	}

}
