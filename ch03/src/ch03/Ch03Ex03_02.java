package ch03;

import java.util.Scanner;

public class Ch03Ex03_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.print("첫번째 수를 입력하여주세요.> ");
		int num1=Integer.parseInt(scanner.nextLine());
		System.out.print("두번째 수를 입력하여주세요.>> ");
		int num2=Integer.parseInt(scanner.nextLine());
		
		System.out.printf("몫: %d     ,   %.2f",num1/num2,(double)num1/num2 );
	
		// 11/3 = 3
		// 정수 11을 실수로 변환하면 11.00000/3 =3.672541321 ->2째자리까지 3.67
	
	}

}
