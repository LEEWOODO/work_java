package ch04;

import java.util.Scanner;

public class Ch04Ex01_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("나이를 입력해주세요.>");
		Scanner scanner=new Scanner(System.in);
		int age=scanner.nextInt();
	
		if(age>=20) {
			System.out.println("adult");
		}else {
			int laterYear=0;
			laterYear=20-age;
			System.out.println(laterYear+" years later you will be :)");
		}
	}

}
