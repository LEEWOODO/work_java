package ch04;

import java.util.Scanner;

public class Ch04Ex02_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("2부터 9까지의 수 중 2개를 입력받아 입력받은 수 사이의 구구단을 출력하는 프로그램을 작성하시오.\r\n"
				+ "단, 반드시 먼저 입력된 수의 구구단부터 아래의 형식에 맞게 출력하여야 한다.");
		System.out.print("입력(5 3) > ");
		Scanner scanner = new Scanner(System.in);

		// 1. 두개의 정수 입력
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();

		// 2.1 첫번째 입력 수가 작고 두번째 수가 클 경우
		if (num1 <num2) {
			for(int i=1;i<=9;i++) {
				for(int j=num1;j<=num2;j++) {
					System.out.printf("%d*%d=%d\t", j, i, j * i);
				}
				System.out.println();
			}
		}
		else if(num1>num2) {
			for (int i = 1; i <= 9; i++) {
				for (int j = num1; j >= num2; j--) {
					System.out.printf("%d*%d=%d\t", j, i, j * i);
				}
				System.out.println();
			}
		}
	}

}
