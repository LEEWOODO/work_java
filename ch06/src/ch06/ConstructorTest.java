package ch06;

class Data1{
	int value=3;
	/*
	 * 기본 생성자(constructor)
	 * 생성자를 작성하지 않으면 기본으로
	 * 컴파일러가 알아서 생성하는 생성자.
	 * 물론 아래와 같이 명시적으로 작성 후
	 * 바디부분(중괄호 안)에 코드를 작성하면 
	 * 생성자 호출 시 코드가 실행이 된다.
	 */
	Data1(){
		System.out.println("Data1 생성자 호출!");
	}
}
class Data2{
	int value;
	Data2(){
		value=10;
	}
	Data2(int x){
		value=x;
		System.out.println("Data2 생성자 호출");
	}
}
/*
 * 생성자
 * 인스턴스가 생성될 때 호출되는 인스턴스 초기화 메소드이다.
 * 
 * 1. 생성자의 이름은 클래스의 이름과 같아야한다.
 * 2. 생성자는 리턴 값이 없다.
 * 
 * 생성자는 객체가 생성되는 시점에 실행되고, 실행하고 싶은 코드를 작성하면 된다.
 * 예) 인스턴스 변수 값을 원하는 값으로 초기화 할 때 사용한다.
 */
class ConstructorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data1 data1=new Data1();
		Data2 data2=new Data2(30);
		System.out.println("data1 객체의 value "+data1.value);
		System.out.println("data2 객체의 value "+data2.value);
	}

}
