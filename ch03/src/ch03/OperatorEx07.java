package ch03;

public class OperatorEx07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte a= 10;
		byte b= 30;
		byte c=(byte)(a*b); // 곱셈도 마찬가지로 자바에서 정수의 기본형인 int형으로 변경 후 곱셈을 수행한다. byte의 범위를 넘기때문에 44출력됨
		System.out.println(c);
	}

}
