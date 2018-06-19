package ch03;

import java.util.Scanner;

public class Ch03Adv01 {
	/*
	 * 
	 * 강아지와 병아리의 합과 다리의 수를 입력받아 강아지와 병아리가 각각 몇 마리씩인지 구하는 프로그램을 작성하시오 입력형식: 강아지와 병아리의
	 * 합 1000 이하 다리의 합 4000 이하의 음이 아닌 정수가 공백으로 구분하여 입력된다. 하나의 결과가 나온 후에도 계속 새로운 입력을
	 * 받다가 0 0 이 입력되면 프로그램을 종료한다. 출력형식: 강아지와 병아리가 각각 몇 마리씩인지 공백으로 구분하여 출력한다. 주어진
	 * 데이터로 마리수를 정할 수 없을 때는 "0" 을 출력한다. 데이터의 크기가 주어진 범위를 벗어날 경우는 "INPUT ERROR!"를
	 * 출력한다.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 강아지:x 다리 4개, 병아리:y 다리2개
		Scanner scanner = new Scanner(System.in);

		int x = 0, y = 0;

		// for(String s:str) {
		// System.out.print(s+" ");
		// }
		// System.out.println();

		while (true) {
			System.out.print("동물 수 합 입력,  동물 다리수 합 입력:(0 0: 입력시 프로그램 종료.) ");
			String str[] = scanner.nextLine().split(" ");
			if (str[0].equals("0") && str[1].equals("0")) {
				System.out.println("프로그램을 종료합니다. ^^");
				break;
			}
			// 범위 내의 값
			if ((Integer.parseInt(str[0]) <= 1000 && Integer.parseInt(str[0]) >= 0)
					&& (Integer.parseInt(str[1]) <= 4000 && Integer.parseInt(str[1]) >= 0)) {
				
				int dog_cnt = Integer.parseInt(str[0]);
				int leg = Integer.parseInt(str[1]);
				int chicken_cnt = 0;
			
				while ((dog_cnt * 4) + (chicken_cnt * 2) != leg) {
					dog_cnt--;
					chicken_cnt++;

				}
				if (dog_cnt < 0 || chicken_cnt < 0) {
					System.out.println("0(구할 수 없음)");
				} else {
					System.out.print("개 :" + dog_cnt + " ");
					System.out.println("병아리 :" + chicken_cnt);
				}

			}
			// 범위 이외의 값 error
			else {
				System.out.println("INPUT ERROR.");

			}
		}

	}

}
