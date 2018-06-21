package ch05;

import java.util.Scanner;

public class Ch05Ex02_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] numbers=new String[5];
		Scanner scanner=new Scanner(System.in);
		numbers=scanner.nextLine().split(" ");
		
		int sum=0;
		sum=Integer.parseInt(numbers[0])+Integer.parseInt(numbers[2])+Integer.parseInt(numbers[4]);
		
		System.out.println(sum);
	}

}
