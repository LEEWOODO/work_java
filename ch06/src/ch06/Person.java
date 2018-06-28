package ch06;

public class Person {
	// 속성(인스턴스 변수)
	// 1. 이름
	// 2. 나이
	// 3. 주소
	String name;
	int age;
	String address;
	

	// 행동(메소드)
	// 1. 자기소개	- "저는 [나이]살 [주소]에 사는 [이름]입니다."
	void selfIntroduce() {
		System.out.printf("저는 [%d]살 [%s]에 사는 [%s]입니다.",age,address,name);
	}
	
}
