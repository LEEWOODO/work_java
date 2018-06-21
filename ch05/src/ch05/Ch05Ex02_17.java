package ch05;

import java.util.Scanner;

public class Ch05Ex02_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int[][] arr1 = new int[4][2];

		// arr1 배열 입력
		for (int i = 0; i < arr1.length; i++) {
			String[] numbers = scanner.nextLine().split(" ");
			for (int j = 0; j < arr1[i].length; j++) {
				arr1[i][j] = Integer.parseInt(numbers[j]);
			}
		}

		// 가로평균 출력
		int sum = 0;
		int avg = 0;
		System.out.print("가로 평균 : ");
		for (int i = 0; i < arr1.length; i++) {
			sum = 0;
			for (int j = 0; j < arr1[i].length; j++) {
				sum += arr1[i][j]; // i행의 평균.
			}
			avg = sum / arr1[i].length;
			System.out.printf("%d ", avg);
		}
		System.out.println();

		System.out.print("세로 평균 : ");
		for (int i = 0; i < arr1[i].length; i++) {
			sum = 0;
			for (int j = 0; j < arr1.length; j++) {
				sum += arr1[j][i]; // i행의 평균.
			}
			// 00 10 20 30
			// 01 11 21 31
			avg = sum / arr1.length;
			System.out.printf("%d ", avg);
		}

		System.out.println();

		System.out.print("전체 평균 : ");
		int length=0;
		sum = 0;
		for (int i = 0; i < arr1.length; i++) {
		
			for (int j = 0; j < arr1[i].length; j++) {
				sum += arr1[i][j]; // i행의 평균.
				length++;
			}
			
		
		}
		System.out.printf("%d ", sum/length);
		
	}

}
