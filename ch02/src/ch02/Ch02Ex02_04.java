package ch02;

import java.util.Scanner;

public class Ch02Ex02_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2=0;
		int result=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("빼기 프로그램 !");
		System.out.print("두개의 정수를 입력하여 주세요.>> ");
		num1=Integer.parseInt(scanner.nextLine());
		num2=Integer.parseInt(scanner.nextLine());
		result=num1-num2;
		System.out.printf("%d - %d = %d %n",num1,num2,result);
		
	
	}

}
