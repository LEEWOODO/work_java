package ch05;

import java.util.Scanner;

public class Ch05Ex01_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String[] numbers = scanner.nextLine().split(" ");
		int[] num = new int[numbers.length];
		int evenSum=0;
		int oddSum=0;
		double count=0.0;
		double avg=0.0;
		
		for (int i = 0; i < numbers.length; i++) {
			num[i] = Integer.parseInt(numbers[i]);
		}
		for(int i=0;i<num.length;i++) {
			if(i%2==0) {
			// oddSum
				oddSum+= num[i];
				count++;
			}else {
				// evenSum
				evenSum+= num[i];
		
			}
		}
		
		avg=oddSum/count;
		System.out.printf("evenSum : %d  avg : %.1f ",evenSum,avg);
		
	}

}
