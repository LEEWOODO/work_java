package ch02;

public class CastingEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float f = 1234;// 형변환 생략. 1234.0
		System.out.println("f "+f);
//		byte b= 1000; // 에러. byte의 범위 (-128~127)를 넘는 값을 저장
//		System.out.println("b "+b);
		char ch=(char)1000;	
		// char 범위 0~65535
		// 명시적으로 형변환 시켜서 오류는 발생하지않으나 정보의 손실이 발생하여 원하는 값을 얻을 수 없다.
		System.out.println("ch "+ch);	// Ϩ 출력
		int i=3;

		double d=1.0+i;// double d = 1.0+(double)i; 에서 형변환이 생략됨
		System.out.println("d "+d);	// 4.0출력
		/*
		 * 작은 타입에서는 큰 타입으로 형변환이 가능.
		 * 큰 타입에서 작은 타입으로 형변환 할 시 정보 손실
		 */
	}

}
