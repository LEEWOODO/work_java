package ch02;

import java.util.Scanner;

public class Ch02Ex02_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		double firstDouble=0.0;
		double secondDouble=0.0;
		double result=0.0;
		System.out.print("첫번째 실수를 입력하시오.> ");
		firstDouble=Double.parseDouble(scanner.nextLine());
		System.out.print("두번째 실수를 입력하시오.> ");
		secondDouble=Double.parseDouble(scanner.nextLine());
		result=firstDouble+secondDouble;
		
		System.out.printf("%10.2f %10.2f %10.2f",firstDouble,secondDouble,result);
	}

}
