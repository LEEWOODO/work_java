package ch05;

import java.util.Scanner;

public class Ch05Ex01_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 각 과목 점수와 평균을 저장할 배열 생성
		int[][] score=new int[5][5];
		
		// 한 학생의 총 합을 저장하는 변수
		int sum=0;
		for(int i=0;i<5;i++) {
			// 2. 한 학생의 성적 입력받기
			sum=0;
			Scanner scanner=new Scanner(System.in);
			String[] numbers=scanner.nextLine().split(" ");

			// 3. 입력받은 성적을 score 배열에 정수로 저장하기
			for(int j=0;j<numbers.length;j++) {
				score[i][j]=Integer.parseInt(numbers[j]);
				sum+=score[i][j];
			
			}
			
			// 4. 평균을 계산하여 배열에 저장
			score[i][4]=sum/4;	// 평균 저장
		}
		
		// 6. 합격한 사람의 수를 저장하는 변수
		int count=0;
		
		// 5. 결과 출력
		for(int i=0;i<score.length;i++) {
			if(score[i][4]>=80) {
				System.out.println("PASS");
				count++;
			}else {
				System.out.println("FAIL");
			}
		}
		
		System.out.println("Successful: "+count);
		
		
	}

}
