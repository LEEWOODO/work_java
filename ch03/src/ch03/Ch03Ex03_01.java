package ch03;

import java.util.Scanner;

public class Ch03Ex03_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.print("첫번째 실수를 입력해주세요 :");
		double num1=Double.parseDouble(scanner.nextLine());
		System.out.print("두번째 실수를 입력해주세요 :");
		double num2=Double.parseDouble(scanner.nextLine());
		
		
		double mul=1.0; // 두 수의 곱
		mul=num1*num2;
		System.out.printf("%d     %d",(int)mul, (int)num1*(int)num2);
		// 3.4 * 5.65 = 19.21    --->(int)19.21 = 19 
		// (int)3.4= 3;, (int)5.65= 5;   --->3 * 5 =15
		
	}

}
