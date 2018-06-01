package ch03;

import java.util.Scanner;

public class Ch03Ex03_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.print("첫번째 수를 입력하여주세요.> ");
		int num1=Integer.parseInt(scanner.nextLine());
		System.out.print("두번째 수를 입력하여주세요.>> ");
		int num2=Integer.parseInt(scanner.nextLine());
		System.out.print("세번째 수를 입력하여주세요.>>> ");
		int num3=Integer.parseInt(scanner.nextLine());
		

		System.out.printf("%.1f",(num1+num2+num3)/3.0);
		//System.out.printf("평균: %.2f",sum);
	}

}
