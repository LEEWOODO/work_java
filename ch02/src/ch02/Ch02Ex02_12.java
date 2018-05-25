package ch02;

import java.util.Scanner;

public class Ch02Ex02_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstNum=0;
		double secondNum=0.0;
		double result=0.0;
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("한개의 정수를 입력하여주세요.> ");
		firstNum=Integer.parseInt(scanner.nextLine());
		System.out.print("한개의 실수를 입력하여주세요.>> ");
		secondNum=Double.parseDouble(scanner.nextLine());
		result=firstNum*secondNum;
		
		System.out.printf(" %.2f * %d = %.0f",secondNum,firstNum,result);
		
		
	}

}
