package ch02;

import java.util.Scanner;

public class Ch02Ex02_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2,num3=0;
		int sum=0;
		int avg=1;
		Scanner scanner=new Scanner(System.in);
		System.out.print("첫번째 정수를 입력하여주세요.> ");
		num1=Integer.parseInt(scanner.nextLine());
		System.out.print("두번째 정수를 입력하여주세요.>> ");
		num2=Integer.parseInt(scanner.nextLine());
		System.out.print("세번째 정수를 입력하여주세요.>>> ");
		num3=Integer.parseInt(scanner.nextLine());
		
		sum=num1+num2+num3;
		avg=(int)sum/3; // (int)소수점 이하를 버림한다. page.81
		
		System.out.printf(" sum = %d\n avg = %d ",sum,avg);
		
	}

}
