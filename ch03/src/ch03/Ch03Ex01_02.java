package ch03;

import java.util.Scanner;

public class Ch03Ex01_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.print("첫번째 정수를 입력하여주세요.> ");
		int num1=Integer.parseInt(scanner.nextLine());
		System.out.println(num1++);
		System.out.println(++num1);
		
	}

}
