package ch06;

import java.util.Scanner;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 사람 3명(객체 3개)만들기
		Scanner scanner=new Scanner(System.in);
		Person[] personArr=new Person[3];
				
		for(int i=0;i<personArr.length;i++) {
			personArr[i]=new Person();// 3명의 객체를 생성한다.
		}
		
		// 2. 각 사람(객체)마다 이름, 나이, 주소를 설정하세요.
		// (자기 자신 포함해서 옆사람 정보 작성하기)
		int i=0;
		String[] names= {"이우도","최명권","조치헌"};
		
		
		while (i<names.length) {
		
			
			System.out.println("-----------"+i+" 번째 사람에 대한 정보 입력-----------");
			personArr[i].name=names[i];			// 순서대로 사람의 이름 설정.
			System.out.printf("%s의 나이를 입력해주세요.%n",personArr[i].name);
			int age=Integer.parseInt(scanner.nextLine());
			personArr[i].age=age;
			System.out.printf("%s의 주소를 입력해주세요.%n",personArr[i].name);
			String address=scanner.nextLine();
			personArr[i].address=address;
			
			i++;
			
		}
		System.out.println("----------------------정보 입력 끝----------------------");
	
		// 3. Person 클래스에서 만든 메소드를 각 사람(객체)마다 호출하세요.
		// for문 이용해도 좋고, 각각 3줄로 호출해도 됩니다.
		for(int j=0;j<personArr.length;j++) {
			personArr[j].selfIntroduce();
			System.out.println();
		}
		
		
	}

}
