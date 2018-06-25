package ch05;

import java.util.Arrays;
import java.util.Scanner;

public class Ch05Ex01_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String[] input = scanner.nextLine().split(" ");
		int[] num = new int[input.length];

		
		for (int i = 0; i < input.length; i++) {
			num[i] = Integer.parseInt(input[i]);
		}
		// 내림차순 정렬
	
		
		for(int i=0;i<num.length-1;i++) {
			boolean changed=false;
			for(int j=0;j<num.length-1-i;j++) {
				if(num[j]>num[j+1]) {
					int temp=num[j];
					num[j]=num[j+1];
					num[j+1]=temp;
					changed = true;
				}
			}
			if(!changed)break; 
		}

		
	
		for(int i=num.length-1;i>=0;i--) {
			System.out.print(num[i]+" ");
		}
	}

}
