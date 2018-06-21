package ch05;

import java.util.Scanner;

public class Ch05Ex02_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		String[] numbers=scanner.nextLine().split(" ");
		double sum=0.0;
		for(int i=0;i<numbers.length;i++) {
			sum+=Double.parseDouble(numbers[i]);
		}
		System.out.printf("%.1f",sum/6);
		
	}

}
