package ch05;

import java.util.Arrays;
import java.util.Scanner;

public class Ch05Ex01_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] alpha=new char[10];
		
		Scanner scanner=new Scanner(System.in);
		for(int i=0;i<alpha.length;i++) {
			System.out.printf("%d번째 문자를 입력하세요: ",i+1);
			alpha[i]=scanner.nextLine().charAt(0);
		}
		System.out.println(Arrays.toString(alpha));
	}

}
