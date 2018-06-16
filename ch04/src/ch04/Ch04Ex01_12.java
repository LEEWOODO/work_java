package ch04;

import java.util.Scanner;

public class Ch04Ex01_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("년도를 입렵하세요: (윤년찾기 2018) >");
		Scanner scanner = new Scanner(System.in);
		int year = scanner.nextInt();
		String result = "";

		// 윤년인지 조건문으로 검사
		boolean case01 = year % 400 == 0;
		boolean case02 = year % 4 == 0 && year % 100 != 0;

		if (case01 || case02) {
			result = "leap year"; // 윤년
		} else {
			result = "common year";
		}
		System.out.println(result);

	}

}
