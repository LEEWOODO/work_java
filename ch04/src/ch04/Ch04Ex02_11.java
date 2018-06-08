package ch04;

import java.util.Scanner;

public class Ch04Ex02_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int base = 0; // 밑변
		int height = 0; // 높이
		double triangleArea=0.0;
		char ch=' ';

		do {
			System.out.print("삼각형의 밑변의 길이 입력 >");
			base = scanner.nextInt();
			System.out.print("삼각형의 높이의 길이 입력 >");
			height = scanner.nextInt();
			triangleArea=base*height/2.0;
			System.out.printf("triangleArea=%.1f%n",triangleArea);
			System.out.print("Continue? ");
			ch=scanner.next().charAt(0);
			//System.out.println("ch : "+ch);
		} while (ch=='y'||ch=='Y');

	}

}
