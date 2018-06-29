package ch06;

import java.util.Scanner;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 사람 3명(객체 3개)만들기
		Scanner scanner = new Scanner(System.in);
		Person[] personArr = new Person[3];

		/*
		 * for(int i=0;i<personArr.length;i++) { personArr[i]=new Person();// 3명의 객체를
		 * 생성한다. }
		 */

		// 2. 각 사람(객체)마다 이름, 나이, 주소를 설정하세요.
		// (자기 자신 포함해서 옆사람 정보 작성하기)
		int i = 0;

		// [2-2] 아래 방법은 객체를 생성 후 각 인스턴스 변수에 접근하여
		// 값을 초기화 한 부분인다.
		// 아래 부분을 2-1에서 작성한 생성자를 이용하여 변경하시오.
		personArr[0] = new Person("우도", 25, "부천");
		personArr[1] = new Person("명권", 24, "광명");
		personArr[2] = new Person("치헌", 23, "이수");

		System.out.println("----------------------정보 출력----------------------");

		// 3. Person 클래스에서 만든 메소드를 각 사람(객체)마다 호출하세요.
		// for문 이용해도 좋고, 각각 3줄로 호출해도 됩니다.
		for (int j = 0; j < personArr.length; j++) {
			personArr[j].selfIntroduce();
			System.out.println();
		}
		
		// [2-4] 2-3 Person 에서 생성한 생성자를 이용하여 "흥민" 이라는 이름으로 사람 객체 하나를 생성하세요.
		Person person3=new Person("흥민");
		// [2-5] 2-4 객체를 이용하여 introduce() 메소드를 호출하세요.
		person3.selfIntroduce();
	}

}
