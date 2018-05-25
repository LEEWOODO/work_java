package ch02;

import java.util.Scanner;

public class Ch02Ex02_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int height=0;
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("\"height = \"");
		height=Integer.parseInt(scanner.nextLine());
		System.out.printf("Your height is %dcm",height);
	}

}
	