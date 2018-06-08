package ch04;

import java.util.Scanner;

public class Ch04Ex01_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("첫번째 실수를 입력: >");
		Scanner scanner=new Scanner(System.in);
		double num1=scanner.nextDouble();
		System.out.print("두번째 실수를 입력: >");
		double num2=scanner.nextDouble();
		
		if(num1>=4.0 && num2>=4.0) {
			System.out.println("A");
		}else if(num1>=3.0 && num2>=3.0) {
			System.out.println("B");
		}else {
			System.out.println("C");
		}
		
		
	}

}
