package ch04;

import java.util.Scanner;

public class Ch04Ex02_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0;
		int sum=0;
		int i=1;
		Scanner scanner=new Scanner(System.in);
		num=scanner.nextInt();
		while (i<=num) {
			sum+=i;
			System.out.print(i+" ");
			i++;
			
		}
		System.out.println("총합은: "+sum);
	}

}
