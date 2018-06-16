package ch04;

import java.util.Scanner;

public class Ch04Ex02_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		while (true) {
			System.out.printf("1.Korea%n2.USA%n3.Japan%n4.China%nnumber? >");
			Scanner scanner = new Scanner(System.in);
			int number = scanner.nextInt();

			// 특정 조건을 만족할 경우 boolean 을 이용 하여 참 거짓을 저장하는 flag변수
			boolean flag = false;

			switch (number) {
			case 1:
				System.out.println("Seoul");
				break;
			case 2:
				System.out.println("Washington");
				break;
			case 3:
				System.out.println("Tokyo");
				break;
			case 4:
				System.out.println("Beijing");
				break;
			default:
				System.out.println("none");
				flag = true;
			}

			// 특정 조건 flag값이 true일때 while문 반복 끝내기
			if (flag == true) {
				break;
			}
		}
	}

}
