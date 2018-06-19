package ch05;

import java.util.Scanner;

public class Ch05Ex01_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String[] input = scanner.nextLine().split(" ");
		int[] num = new int[input.length];
		int evenSum=0;
		int oddSum=0;
		double count=0.0;
		double avg=0.0;
		
		for (int i = 0; i < input.length; i++) {
			num[i] = Integer.parseInt(input[i]);
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
