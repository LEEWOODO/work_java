package ch03;

import java.util.Scanner;

public class Ch03Ex02_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 민수
		int mHeight = 0;
		int mWeight = 0;

		// 기영
		int kHeight=0;
		int kWeight=0;

		Scanner scanner = new Scanner(System.in);
		System.out.print("민수 키를 입력하여주세요.> ");
		mHeight = Integer.parseInt(scanner.nextLine());
		System.out.print("민수 몸무게를 입력하여주세요.>> ");
		mWeight = Integer.parseInt(scanner.nextLine());
		System.out.print("기영 키를 입력하여주세요.> ");
		kHeight = Integer.parseInt(scanner.nextLine());
		System.out.print("기영 몸무게를 입력하여주세요.>> ");
		kWeight = Integer.parseInt(scanner.nextLine());
		
		System.out.printf("%b%n",mHeight>kHeight && mWeight>kWeight); 
		
	}

}
