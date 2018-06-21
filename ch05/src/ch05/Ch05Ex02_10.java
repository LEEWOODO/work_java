package ch05;

import java.util.Arrays;
import java.util.Scanner;

public class Ch05Ex02_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.print("사람의 수를 입력해주세요: ");
		int people=Integer.parseInt(scanner.nextLine());
		String[] score=new String[people];
		System.out.print(people+"명의 점수를 입력해주세요(띄워쓰기 구분)");
		score=scanner.nextLine().split(" ");
		
		// 높은 수 부터 정렬하기
		for(int i=0;i<score.length;i++) {
			for(int j=0;j<score.length;j++) {
				if(Integer.parseInt(score[i])>Integer.parseInt(score[j])) {
					int temp=Integer.parseInt(score[i]);
					score[i]=score[j];
					score[j]=temp+"";
				}
				
			}
			
		}

		// 출력
		for(int i=0;i<score.length;i++) {
			System.out.println(score[i]);
		}
		
		
	}

}
