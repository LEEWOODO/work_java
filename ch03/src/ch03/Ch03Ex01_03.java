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
	
	
		int a= num1++; // a에는 num1이 1증가하기 전 값이 저장됨
		int b= --num2; // b에는 num2이 1감소후 값이 저장됨
		int mul=a*b;   // 증가하기 전 값과 감소 후 값을 곱한 값 저장
		

		
		System.out.printf("%d    %d    %d",num1,num2,mul);
	
	}

}
