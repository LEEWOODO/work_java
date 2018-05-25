package ch02;

import java.util.Scanner;

public class Ch02Ex02_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double yard=91.44;
		double inputYd=0.0;
		double result=0.0;
		Scanner scanner=new Scanner(System.in);
		System.out.print("yard? ");
		inputYd=Double.parseDouble(scanner.nextLine());
		result=inputYd*yard;
		System.out.printf("%.1f yard = %.1f cm",inputYd,result);
	}

}
