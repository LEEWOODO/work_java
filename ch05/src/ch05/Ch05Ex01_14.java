package ch05;

import java.util.Arrays;
import java.util.Scanner;

public class Ch05Ex01_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. 입력받아 저장할 배열 2개 생성
		int[][] a1 = new int[2][4];
		int[][] a2 = new int[2][4];

		// 2. a1배열에 입력받은 값을 저장
		System.out.println("first array");
		for (int j = 0; j < a1.length; j++) {
			Scanner scanner = new Scanner(System.in);
			String[] numbers = scanner.nextLine().split(" ");

			// 3. 입력받은 정수를 a? 배열에 저장하기
			for (int i = 0; i < numbers.length; i++) {
				a1[j][i] = Integer.parseInt(numbers[i]);
			}
		}

		// 3. a2배열에 입력받은 값을 저장
		System.out.println("second array");
		for (int j = 0; j < a2.length; j++) {
			Scanner scanner = new Scanner(System.in);
			String[] numbers = scanner.nextLine().split(" ");

			// 3. 입력받은 정수를 a? 배열에 저장하기
			for (int i = 0; i < numbers.length; i++) {
				a2[j][i] = Integer.parseInt(numbers[i]);
			}
		}
		
		// 4. 출력하기
		for(int i=0;i<a1.length;i++) {
			for(int j=0;j<a1[i].length;j++) {
				System.out.printf("%2d  ",a1[i][j]*a2[i][j]);
			}
			System.out.println();
		}
		

	}

}
