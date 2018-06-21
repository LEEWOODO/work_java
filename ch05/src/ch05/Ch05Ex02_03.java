package ch05;

import java.util.Scanner;

public class Ch05Ex02_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int oddSum=0;
		int evenSum=0;
		String[] numbers=new String[10];
		Scanner scanner=new Scanner(System.in);
		numbers=scanner.nextLine().split(" ");
		for(int i=0;i<numbers.length;i++) {
			if(i%2==0) {
				// 홀수의 합
				oddSum+=Integer.parseInt(numbers[i]);
			}
			else {
				// 짝수의 합
				evenSum+=Integer.parseInt(numbers[i]);
			}
		}
		System.out.printf("odd : %d%neven : %d",oddSum,evenSum);
		
	}

}
