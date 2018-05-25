package ch02;

import java.util.Scanner;

public class Ch02Ex02_06 {
	/*
	 * 야드 인치 프로그램
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double yd=91.44; //1야드(yd)는 91.44cm이고 
		final double inch=2.54; //1인치(in)는 2.54cm이다.
		
		double inputYd=0.0;
		double inputInch=0.0;
		double resultYd=0.0;
		double resultInch=0.0;
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("야드(yd)를 입력해주세요.>> ");
		inputYd=Double.parseDouble(scanner.nextLine());
		System.out.print("인치(Inch)를 입력해주세요.>> ");
		inputInch=Double.parseDouble(scanner.nextLine());
		
		resultYd=inputYd*yd;
		resultInch=inputInch*inch;
//		System.out.println("resultYd : "+resultYd);
//		System.out.println("resultInch : "+resultInch);
//		
		System.out.printf("%4.1f yd = %5.1f cm \n",inputYd,resultYd);
		System.out.printf("%4.1f in = %5.1f cm \n",inputInch,resultInch);
		
	}

}
