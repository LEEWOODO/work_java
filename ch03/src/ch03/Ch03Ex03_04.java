package ch03;

import java.util.Scanner;

public class Ch03Ex03_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.print("첫번째 수를 입력하여주세요.> ");
		double num1=Double.parseDouble(scanner.nextLine());
		System.out.print("두번째 수를 입력하여주세요.>> ");
		double num2=Double.parseDouble(scanner.nextLine());
		System.out.print("세번째 수를 입력하여주세요.>>> ");
		double num3=Double.parseDouble(scanner.nextLine());
		
		System.out.printf("sum : %d%n",(int)num1+(int)num2+(int)num3);
		System.out.printf("avg : %d",(int)(num1+num2+num3)/3);
		
	
	}

}
