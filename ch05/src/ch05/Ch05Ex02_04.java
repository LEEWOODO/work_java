package ch05;

import java.util.Scanner;

public class Ch05Ex02_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers=new int[100];
		Scanner scanner=new Scanner(System.in);
		String[] input=scanner.nextLine().split(" ");
		int checkCount=0;
		int sum=0;
		for(int i=0;i<input.length;i++) {
			int num=Integer.parseInt(input[i]);
			if(num!=-1) {
				numbers[i]=num;
			}else {
				checkCount=i-1;	// 30 20 10 60 80  checkCount=4
			//	System.out.println("checkCount : "+checkCount);
				break;
			}
			
		}
		
		if(checkCount<2) {
			// 모든 숫자의 합을 구한다.
			for(int i=0;i<=checkCount;i++) {
				System.out.print(numbers[i]+" ");
			}
		}
		else {
			for(int i=checkCount-2;i<=checkCount;i++) {
				System.out.print(numbers[i]+" ");
			}
		}
	}

}
