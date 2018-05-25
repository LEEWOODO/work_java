package ch02;

import java.util.Scanner;

public class Ch02Ex02_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2=0;
		System.out.println("두개의 수를 입력 하세요. >");
		Scanner scanner=new Scanner(System.in);
		num1=Integer.parseInt(scanner.nextLine());
		num2=Integer.parseInt(scanner.nextLine());
		
		System.out.println("num1: "+num1);
		System.out.println("num2: "+num2);
	}

}
