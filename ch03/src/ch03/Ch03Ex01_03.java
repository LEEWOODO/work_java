package ch03;

import java.util.Scanner;

public class Ch03Ex01_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.print("첫번째 정수를 입력하여주세요.> ");
		int num1=Integer.parseInt(scanner.nextLine());
		System.out.print("두번째 정수를 입력하여주세요.> ");
		int num2=Integer.parseInt(scanner.nextLine());
		int mul=1; // 두수의 곱
	
		num1=num1++;
		num2=--num2;
		mul=num1*num2;
//		num1++;
//		--num2;
//		mul=num1*num2
		
		System.out.printf("%d    %d    %d",num1,num2,mul);
	//	System.out.printf("%d  %d  %d",num1,num2,num1* num2);
	}

}
