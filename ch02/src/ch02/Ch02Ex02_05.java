package ch02;

import java.util.Scanner;

public class Ch02Ex02_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=0;
		float num2=0.0f;
		double result=0.0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("곱셈 프로그램.");
		System.out.print("두 수를 입력해 주세요.>>");
		num1=Integer.parseInt(scanner.nextLine());
		num2=Float.parseFloat(scanner.nextLine());
		result=num1*num2;
		System.out.printf("%d * %f = %f",num1,num2,result);
		
	}

}
