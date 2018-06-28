package ch06;
/*
 * 기본형(primitive type)일 때는 기본형 값이 복사되겠지만	- 기본형 매개변수: 변수의 값을 읽기만 할 수 있다. (read only)
 * 참조형(reference type)이면 인스턴스의 주소가 복사된다.	- 참조형 매개변수: 변수의 값을 읽고 변경할 수 있다.(read & write)
 * 참조형에는 객체도 있고, 배열도 된다. 배열도 참조형이다.
 */
public class ReferenceParamEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x= {10};
		System.out.println("main() : x = "+ x[0]);
		
		change(x);
		System.out.println("After change(x)");
		System.out.println("main() : x = "+x[0]);
	}

	private static void change(int[] x) {
		// TODO Auto-generated method stub
		x[0]=1000;
		System.out.println("change() : x = "+x[0]);
	}

}
