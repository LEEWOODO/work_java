package ch02;

import java.util.Scanner;

public class Ch02Ex02_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float firstFloat=0.0f;
		float secondFloat=0.0f;
		double inputDouble=0.0;
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("첫번째 float형 실수 하나를 입력해주세요.> ");
		firstFloat=Float.parseFloat(scanner.nextLine());
		System.out.print("두번째 float형 실수 하나를 입력해주세요.>> ");
		secondFloat=Float.parseFloat(scanner.nextLine());
		System.out.print("double형 실수 하나를 입력해주세요.>>> ");
		inputDouble=Double.parseDouble(scanner.nextLine());
		
		System.out.printf("%.3f\n",firstFloat);
		System.out.printf("%.3f\n",secondFloat);
		System.out.printf("%.3f\n",inputDouble);
	}

}
