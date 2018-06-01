package ch03;

import java.util.Scanner;

public class Ch03Ex01_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.print("첫번째 정수를 입력하여주세요.> ");
		int num1=Integer.parseInt(scanner.nextLine());
		System.out.print("두번째 정수를 입력하여주세요.>> ");
		int num2=Integer.parseInt(scanner.nextLine());
		

	//	System.out.printf("논리곱: %b , 논리합: %b",(num1!=0?true:false) && (num2!=0?true:false), (num1!=0?true:false) || (num2!=0?true:false));
		
		System.out.printf("논리곱: %b , 논리합: %b",(num1!=0) && (num2!=0), (num1!=0) || (num2!=0));
		
	}

}
