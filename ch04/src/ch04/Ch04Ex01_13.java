package ch04;

import java.util.Scanner;

public class Ch04Ex01_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("1번은 개, 2번은 고양이, 3번은 병아리로 정하고 번호를 입력하면 번호에 해당하는 동물을\r\n" + "영어로 출력하는 프로그램을 작성하시오.> (1,2,3)");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		switch (num) {
		case 1:
			System.out.println("DOG");
			break;
		case 2:
			System.out.println("CAT");
			break;
		case 3:
			System.out.println("Chicken");
			break;
		default:
			System.out.println("I DON'T NO]");
			break;
		}
	}

}
