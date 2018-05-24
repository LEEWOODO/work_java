package ch02;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("두 자리 정수를 하나 입력하여주세요  >> ");
		Scanner scanner=new Scanner(System.in);
		String inputString=scanner.nextLine();
		
		int inputNum=Integer.parseInt(inputString);
		
		System.out.println("inputString : "+ inputString);
		System.out.printf("inputNum=%d\n", inputNum );
		
	}

}
