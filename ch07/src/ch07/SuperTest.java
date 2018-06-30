package ch07;

public class SuperTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c=new Child();
		c.x=200;
		c.method();
		
	}
	/*  --출력문--
	 *  Parent 기본 생성자 호출				// 이것이 먼저 출력이 되는 이유는 부모클래서가 먼저 생성이 되어야
		Child 기본 생성자 호출				// 자식 클래스를 생성할 수 있기 때문이다.
		x = 10
		this.x = 10
		super.x = 10

	 */
}

class Parent{
	int x=10;
	// 기본생성자
	Parent(){
		System.out.println("Parent 기본 생성자 호출");
	}
}
class Child extends Parent{
	public Child() {
		// TODO Auto-generated constructor stub
		System.out.println("Child 기본 생성자 호출");
	}
	void method() {
		System.out.println("x = "+x);
		System.out.println("this.x = "+this.x);
		System.out.println("super.x = "+super.x);
	}
}
