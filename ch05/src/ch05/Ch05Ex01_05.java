package ch05;

import java.util.Arrays;
import java.util.Scanner;

public class Ch05Ex01_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double score[]= {85.6,79.5,83.1,80.0,78.2,75.0};
		double sum=0.0;
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("반 번호를 입력해주세요(1 3)");
		String[] input=scanner.nextLine().split(" ");	// 반번호 입력
		int[] ban=new int[input.length];
		int x=0,y=0;
		// 정수형 반 입력
		for(int i=0;i<ban.length;i++) {
			ban[i]=Integer.parseInt(input[i]);
		}
		x=ban[0];//1
		y=ban[1];//3
		for(int i=0;i<score.length;i++) {
			if(i==x-1 || i==y-1) {
				sum+=score[i];
				
			}
		}
		System.out.printf("평균: %.1f",sum);
	}

}
