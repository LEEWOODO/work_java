package ch04;

import java.util.Scanner;

public class Ch04Ex01_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int input=Integer.parseInt(scanner.nextLine());
		System.out.println(input);
		if(input<0) {
			System.out.println("minus");
		}
	}

}
