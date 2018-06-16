package ch04;

import java.util.Scanner;

public class Ch04Ex02_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("자연수 n을 입력받아 \"출력 예\"와 같이 공백으로 구분하여 출력되는 프로그램을\r\n" + 
				"작성하시오.");
		System.out.print("입력 (3 or 4...) > ");
		Scanner scanner=new Scanner(System.in);
		int num=scanner.nextInt();
		int num2=1;
		for(int i=1;i<=num;i++) {
			// 대각선 왼쪽: 공백 출력 0 1 2 3개
			for(int j=0;j<i-1;j++) {
				System.out.printf("\t");
			}
			
			// 대각선 오른쪽: 숫자 출력 4 3 2 1 개
			for(int j=num;j>=i;j--) {
				if(num2==10) {
					num2=0;
				}
				System.out.printf("%d\t",num2++);
			}
			
	
			System.out.println();
		}
		
		
		/*
		 * 강사님 코드 */
		num2=1;
		for(int i=0;i<num;i++) {
			for(int j=0;j<num;j++) {
				if(i<=j) {
					System.out.printf("%d\t",(num2%10));
					num2++;
				}else {
					System.out.printf("\t");
				}
				
			}
			System.out.println();
		}
		
	}

}
