package ch05;

import java.util.Scanner;

public class Ch05Ex02_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int[][] classes=new int[4][4];
		int sum=0;
		// classes배열의 i행 3열에 각 반별 합계 저장.
		for(int i=0;i<classes.length;i++) {
			sum=0;
			System.out.printf("%dclass? ",i+1);
			// 제기차기 점수 3개 입력
			String[] score=scanner.nextLine().split(" ");
			for(int j=0;j<score.length;j++) {
				sum+=Integer.parseInt(score[j]);
			}
			classes[i][3]=sum;
		}
		for(int i=0;i<classes.length;i++) {
			System.out.printf("%d classes : %d%n ",i+1,classes[i][3]);
		}
	
	}

}
