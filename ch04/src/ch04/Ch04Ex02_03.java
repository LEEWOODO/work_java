package ch04;

import java.util.Scanner;

public class Ch04Ex02_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner scanner=new Scanner(System.in);

		while (true) {
			System.out.print("한개의 정수를 입력하세요: (0: 종료)>");
			int num=scanner.nextInt();
			if(num>0) {
				System.out.println("positive integer");
			}else if(num<0) {
				System.out.println("negative integer");
			}else { // 0이면
				break;
			}
		}
	}

}
