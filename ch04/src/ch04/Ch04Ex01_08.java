package ch04;

import java.util.Scanner;

public class Ch04Ex01_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("4.5이하 학점을 입력하여 주세요:> ");
		Scanner scanner = new Scanner(System.in);
		double grade = scanner.nextDouble();
		String semester="";
		switch ((int)grade) {
		case 4:
			semester="seasonal semester";
			break;
		case 3:
			semester="next semester";
			break;
		case 2:
			semester="scholarship semester";
			break;
		default:
			semester="retake";
			break;
		}
		System.out.println("semester : "+semester);
	}

}
