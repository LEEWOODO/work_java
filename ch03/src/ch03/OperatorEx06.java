package ch03;

public class OperatorEx06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte a=10;
		byte b=20;
		// byte c=a+b; // 컴파일 에러가 발생한다. 명시적으로 형변환이 필요하다.
		// 자바에서 덧셈을 할때는 기본형인 int a, b 로 바뀐다음에 그 결과가 int형으로 나오기때문에
		// 다시 byte c 라는 곳에 저장하기 위해 명시적으로 형변환을 시켜줘야한다.
		byte c = (byte) (a+b);
		System.out.println(c);
	}

}
