package ch04;

import java.util.Scanner;

public class Ch04Ex01_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("두개의 정수를 입력하여 주세요.(18 10) > ");
		Scanner scanner=new Scanner(System.in);
		String str[]=scanner.nextLine().split(" ");
		int num1=Integer.parseInt(str[0]);
		int num2=Integer.parseInt(str[1]);
		int result=0;
		result=Math.abs(num1-num2);
		System.out.println("result: "+result);
	}

}
