package ch06;

public class Person {
	// 속성(인스턴스 변수)
	// 1. 이름
	// 2. 나이
	// 3. 주소
	String name;
	int age;
	String address;
	
	// [2-1] 이름, 나이, 주소 인스턴스 변수를 초기화하는 생성자를 작성하시오.
	Person(String name, int age, String address){
		this.name=name;
		this.age=age;
		this.address=address;
	}
	// [2-3] 이름만 입력받는 생성자를 작성하시오.
	// 단, 나이와 주소값은 각각 기본으로 19,"없음" 값으로 초기화하는 생성자를 작성하시오.
	// (힌트: 2-1에서 작성한 생성자를 이용하여 생성자를 작성하면 됩니다.)
	Person(String name) {
		// TODO Auto-generated constructor stub
		// Person(String name, int age, String address) 생성자로 이동 this의 name을 갖고
		this(name,19,"없음");	// 생성자 안에서 다른 생성자를 호출 할 때는 반드시 첫번째 줄에서 호출해야한다.
		System.out.println("생성자 호출!");
	}
	
	
	// 행동(메소드)
	// 1. 자기소개	- "저는 [나이]살 [주소]에 사는 [이름]입니다."
	void selfIntroduce() {
		System.out.printf("저는 [%d]살 [%s]에 사는 [%s]입니다.",age,address,name);
	}
	
}
