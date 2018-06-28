package ch06;
/*
 * 기본형(primitive type)일 때는 기본형 값이 복사되겠지만	- 기본형 매개변수: 변수의 값을 읽기만 할 수 있다. (read only)
 * 참조형(reference type)이면 인스턴스의 주소가 복사된다.	- 참조형 매개변수: 변수의 값을 읽고 변경할 수 있다.(read & write)
 */
public class ReferenceParamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data d=new Data();
		d.x=10;
		System.out.println("main() : x = " + d.x);
		
		change(d);
		System.out.println("After change(d) ");
		System.out.println("main() : x = " + d.x);
	}

	private static void change(Data d) {		// 참조형 매개변수가 파라미터로 왔다. 객체의 주소를 이용해서 값을 변경한다 call by reference
		// TODO Auto-generated method stub
		d.x=1000;
		System.out.println("change() : x = "+d.x);
	}

}
