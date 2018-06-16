package ch04;

import java.util.Scanner;

public class Ch04Ex01_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("영문 대문자를 입력하여 주세요:> ");
		Scanner scanner = new Scanner(System.in);
		char ch = scanner.nextLine().charAt(0);
		/*
		 * String을 문자로 바꾸기
		 * char ch=
		 */
		
		switch (ch) {
		case 'A':
			System.out.println("Excellent");
			break;
		case 'B':
			System.out.println("Good");
			break;
		case 'C':
			System.out.println("Usually");
			break;
		case 'D':
			System.out.println("Effort");
			break;
		case 'F':
			System.out.println("Failure");
			break;

		default:
			System.out.println("Error");
			break;
		}
	}

}
