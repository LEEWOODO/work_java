package ch04;

import java.util.Scanner;

public class Ch04Ex01_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("정수를 입력하여주세요. > ");
		Scanner scanner=new Scanner(System.in);
		int number=scanner.nextInt();
		if(number>0) {
			System.out.println("PLUS");
		}else if(number<0) {
			System.out.println("MINUS");
		}else {
			System.out.println("ZERO");
		}
	}

}
