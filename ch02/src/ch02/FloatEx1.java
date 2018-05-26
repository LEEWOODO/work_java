package ch02;

public class FloatEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float f =  9.12345678901234567890f; // 소수점 20자리
		float f2 = 1.2345678901234567890f;	// 소수점 19자리
		double d = 9.12345678901234567890d;	// 소수점 20자리

		System.out.printf("         123456789012345678901234%n");
		System.out.printf("f   :    %f%n", f); // 소수점아래 7자리에서 반올림이 되었음.
		System.out.printf("f   :  %24.20f%n", f);	// 총 8자리까지가 신뢰할 수 있는 값이고, 그 뒤로는 오차발생
		System.out.printf("f   :  %24.20f%n", f2);
		System.out.printf("d   :  %24.20f%n", d);	// 총 15자리 까지가 신뢰할 수 있는 값이고, 그 뒤로는 오차발생

	}

}
