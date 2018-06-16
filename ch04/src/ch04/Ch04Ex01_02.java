package ch04;

import java.util.Scanner;

public class Ch04Ex01_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("키와 몸무게를 입력하여주세요(160 60)> ");
		Scanner scanner=new Scanner(System.in);
		String str[]=scanner.nextLine().split(" ");

		int result=0;

		result=Integer.parseInt(str[1])+100-Integer.parseInt(str[0]);
		System.out.println(result);
		if(result>0) {
			System.out.println("obesity");
		}else {
			System.out.println("nomal");
		}
	}

}
