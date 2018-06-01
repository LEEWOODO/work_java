package ch03;

import java.util.Scanner;

public class Ch03Ex02_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.print("첫번째 정수를 입력하여주세요.> ");
		int num1=Integer.parseInt(scanner.nextLine());
		System.out.print("두번째 정수를 입력하여주세요.>> ");
		int num2=Integer.parseInt(scanner.nextLine());
		
		System.out.printf("%d / %d = %d...%d",num1,num2,num1/num2, num1%num2);
	
	
	}

}
