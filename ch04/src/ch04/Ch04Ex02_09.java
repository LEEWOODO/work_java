package ch04;

import java.util.Scanner;

public class Ch04Ex02_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int num=0;
		int sum=0;
		double avg=0.0;
		int count=0;
		while (true) {
			System.out.print("정수를 입력하여 주세요:(0~100)");
			num=scanner.nextInt();
			if(num>100 || num<0) {
				break;
			}else {
				count++;
				sum+=num;
				
			}
		
			
			
		}
		avg=sum/(float)count;
		System.out.println(count);
		System.out.printf("sum : %d%navg: %.1f",sum,avg);
	}

}
