package ch03;

import java.util.Scanner;

public class Ch03Ex02_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 두 정수를 가로로 입력받기 (배열 필요)
		Scanner scanner=new Scanner(System.in);
		String[] numbers=scanner.nextLine().split(" "); // new를 하면 heap 메모리에 적재된다.
		for(String str: numbers) {
			System.out.print(str+" ");
		} 
		int num1=Integer.parseInt(numbers[0]);
		int num2=Integer.parseInt(numbers[1]);
		
		
		System.out.printf("%d / %d = %d...%d",num1,num2,num1/num2, num1%num2);
	
	
	}

}
