package ch05;

import java.util.Arrays;
import java.util.Scanner;

public class Ch05Ex02_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=0,num2=0;
		int[] numbers=new int[10];
		Scanner scanner=new Scanner(System.in);
		String[] input=scanner.nextLine().split(" ");
		numbers[0]=Integer.parseInt(input[0]);
		numbers[1]=Integer.parseInt(input[1]);
		
		// num3=(num1+num2)%10
		for(int i=0;i<8;i++) {
			int num3=numbers[i]+numbers[i+1];
			numbers[i+2]=num3%10;
			
		}
		System.out.println(Arrays.toString(numbers));
	}	

}
