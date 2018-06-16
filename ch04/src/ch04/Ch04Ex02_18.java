package ch04;

import java.util.Scanner;

public class Ch04Ex02_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("자연수 n을 입력받아 \"출력 예\"와 같이 공백으로 구분하여 출력되는 프로그램을\r\n" + "작성하시오.");
		Scanner scanner = new Scanner(System.in);
		System.out.print("자연수를 입력하여주세요 > ");
		int inputNum = scanner.nextInt(); // 3
		int endNum = inputNum * 2 - 1; // 5
		int centerNum = endNum / 2 + 1; // 3
		for (int i = 1; i <= endNum; i++) { // 5번 반복
			// 증가하는 # 출력 1, 2, 3개
			if (i <= centerNum) {
				for (int j = 1; j <= i; j++) {
					System.out.printf("#");
				}
			} else {
				// 왼쪽 대각선 : 공백 1,2개 출력
				for (int j = i; j > centerNum; j--) {
					System.out.printf(" ");
				}

				// 오른쪽 대각선: # 출력 2,1 개
				for (int j = i; j <= endNum; j++) {
					System.out.printf("#");
				}
			}
			System.out.println();
		}

		/* 강사님 코드 */

		for (int i = 0; i < endNum; i++) {
			if (i < centerNum) {
				for (int j = 0; j <= i; j++) {

					System.out.print("#");

				}
			}
			else {
				for (int j = 0; j < inputNum; j++) {
					int limit=i%inputNum+1;
					if(j<limit) {
						System.out.print(" ");
					}
					else {
						System.out.print("#");
					}

				}
			}

			System.out.println();
		}
	}

}
