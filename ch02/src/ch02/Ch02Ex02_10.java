package ch02;

import java.util.Scanner;

public class Ch02Ex02_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int num1,num2=0;
		int result=0;
		
		System.out.print("첫번째 정수를 입력하세요.> ");
		num1=Integer.parseInt(scanner.nextLine());
		System.out.print("두번째 정수를 입력하세요.>> ");
		num2=Integer.parseInt(scanner.nextLine());
		result=num1+num2;
		
		System.out.printf("%d + %d = %d",num1,num2,result);
	}

}
