package ch04;

import java.util.Scanner;

public class Ch04Ex02_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("자연수 n을 입력받아 \"출력 예\"와 같이 출력되는 프로그램을 작성하시오.");
		System.out.print("자연수를 입력해주세요: >");
		Scanner scanner=new Scanner(System.in);
		int num=scanner.nextInt();
		int endNum=num*2-1;
		int centerNum=endNum/2+1;
		for(int i=1;i<=endNum;i++) {
			if(i<=centerNum) {
				for(int j=1;j<=i;j++) {
					System.out.printf("*");
				}
			}// 증가 별
			else {
				// i는 4,5
				for(int j=i;j<=endNum;j++) {
					System.out.printf("*");
				}
			}// 감소 별
			System.out.println();
		}
	
	
	}

}
