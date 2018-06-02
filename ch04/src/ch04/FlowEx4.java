package ch04;

import java.util.Scanner;

public class FlowEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 0;
		char grade = ' ';

		System.out.print("점수를 입력하세요.> ");
		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt();

		if (score >= 90) { // 조건1 참일때 문장 실행
			grade = 'A';
		} else if (score >= 80) {// 조건1 거짓일때 실행 조건2가 만족할때
			grade = 'B';
		} else if (score >= 70) {// 조건1 거짓일때 실행 조건2가 만족할때
			grade = 'C';
		} else { // 조건1, 조건2가 만족안될때 실행
			grade = 'D';
		}

/*		 if(score>=60) { // 조건1 참일때 문장 실행
		 grade='D';
		 }else if (score>=70) {// 조건1 거짓일때 실행 조건2가 만족할때
		 grade='C';
		 }else if (score>=80) {// 조건1 거짓일때 실행 조건2가 만족할때
		 grade='B';
		 }else { // 조건1, 조건2가 만족안될때 실행
		 grade='A';
		 }*/
		
		System.out.println("당신의 학점은 : " + grade + " 입니다. ");
	}

}
