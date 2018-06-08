package ch04;

import java.util.Scanner;

public class Ch04Ex01_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("3개의 수를 입력하여 주세요.(18 -5 10) > ");
		Scanner scanner=new Scanner(System.in);
		String str[]=scanner.nextLine().split(" ");
		int num1=Integer.parseInt(str[0]);
		int num2=Integer.parseInt(str[1]);
		int num3=Integer.parseInt(str[2]);
		int min=0;
		
		// 최솟값 만들기 조건연산자를 이용
		min=num1>num2?num2:num1;
		min=min>num3?num3:min;
		System.out.println("최솟값: "+min);
	}

}
