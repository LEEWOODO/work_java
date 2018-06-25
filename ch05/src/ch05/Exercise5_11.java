package ch05;

public class Exercise5_11 {
	// 내가 못푼 문제 공부하길~
	public static void main(String[] args) {
		int[][] score = { 
				{ 100, 100, 100 },
				{ 20, 20, 20 }, 
				{ 30, 30, 30 }, 
				{ 40, 40, 40 }, 
				{ 50, 50, 50 } 
		};
		int[][] result = new int[score.length + 1][score[0].length + 1];
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				// (1)
				// 기존의 score행렬 값들을 result에 저장한다.
				result[i][j]=score[i][j];
				
				// 한개의 행에 대한 합을 result[i][score[0].length]에 저장 (i, 3)
				result[i][score[0].length]+=result[i][j];
				
				// 한개의 열에 대한 합을 result[score.length][j]에 저장 (5, j)
				result[score.length][j]+=result[i][j];
				
				// 모든 행과 열의 값을 	result[score.length][score[0].length]에 저장 (5, 3)
				result[score.length][score[0].length]+=result[i][j];
				
				
				
				}
		}
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				System.out.printf("%4d", result[i][j]);
			}
			System.out.println();
		}
	} // main

}
