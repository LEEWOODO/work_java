package ch03;

import java.util.Scanner;

public class Operator25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		char ch=' ';
		System.out.printf("문자를 하나 입력하세요.>");
		String input=scanner.nextLine();
		// 왜 배열은 0 부터 시작할까?
		/*
		 * String abc 에서   abc는 a0001 주소에 저장되었다 가정하고
		 * a는 a0001 + 0 ='a'; (문자열의 시작 !주소!가 0부터 이기때문)
		 * b는 a0001 + 1 ='b';
		 * b는 a0001 + 2 ='c';
		 */
		ch=input.charAt(0);
		
		if('0'<=ch && ch<='9') {
			System.out.println("입력하신 문자는 숫자입니다.");
		}
		else if(('a'<=ch && ch<='z') ||('A'<=ch && ch<='Z')) {
			System.out.println("입력하신 문자는 영문자 입니다.");
		}
		else {
			System.out.println("입력하신 문자는 숫자, 영문자 이외의 것입니다. ex) 한글, 특수문자");
		}
		
	}

}
