package ch05;

import java.util.Scanner;

public class Ch05Ex02_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] counter=new int[7];
		Scanner scanner=new Scanner(System.in);
		for(int i=0;i<10;i++) {
			int num=Integer.parseInt(scanner.nextLine());
			counter[num]++;
		}
		
		for(int i=1;i<counter.length;i++) {
			System.out.printf("%d : %d%n",i, counter[i]);
		}
		
	}

}
