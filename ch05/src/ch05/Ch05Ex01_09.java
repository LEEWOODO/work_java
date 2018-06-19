package ch05;

import java.util.Arrays;
import java.util.Scanner;

public class Ch05Ex01_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String[] input = scanner.nextLine().split(" ");
		int[] num = new int[input.length];
		int temp=0;
		
		for (int i = 0; i < input.length; i++) {
			num[i] = Integer.parseInt(input[i]);
		}
		// 내림차순 정렬
		temp=num[0];
		for(int i=0;i<num.length;i++) {
			for(int j=0;j<num.length;j++) {
				if(num[i]>num[j]) {
					temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}
			System.out.println(Arrays.toString(num));
			
		}
	
		
	}

}
