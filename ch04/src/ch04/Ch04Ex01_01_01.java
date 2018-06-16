package ch04;

import java.util.Scanner;

public class Ch04Ex01_01_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int num=Integer.parseInt(scanner.nextLine());
		System.out.println(num);
		if(num<0) {
			System.out.println("minus");
		}
	}

}
