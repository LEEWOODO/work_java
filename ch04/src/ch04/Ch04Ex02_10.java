package ch04;

import java.util.Scanner;

public class Ch04Ex02_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scanner=new Scanner(System.in);
		int num=0;
		int count=0;
		int i=0;
		while (true) {
			System.out.print("0이 입력될 때 까지 정수를 계속 입력하세요: (종료 0) > ");
			num=scanner.nextInt();
			if(num==0) {
				break;
			}else {
				if(num%3==0 || num%5==0) {// 3, 5의 배수이면 제외시킨다
					continue;
				}else {
					count++;
				}
				
			}
			
		}
		System.out.println("3, 5의 배수를 제외한 수들의 개수는? "+count);
		
	}

}
