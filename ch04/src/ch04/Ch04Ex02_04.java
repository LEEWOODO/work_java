package ch04;

import java.util.Scanner;

public class Ch04Ex02_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int num=0;
		int count=0;
		double sum=0.0;
		while (num<100) {
			
			num=scanner.nextInt();
			sum+=num;
			count++;
			
		}
		System.out.println("합계: "+sum);
		System.out.printf("평균 %.1f",sum/count);
		
	}

}
