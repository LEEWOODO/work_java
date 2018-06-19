package ch05;

import java.util.Scanner;

public class Ch05Ex01_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		char alpha=' ';
		char[] alphabets=new char[50];
		int i=0;
		
		while (true) {
			alpha=scanner.nextLine().charAt(0);
			// A와 Z사이의 알파뱃이 입력되지않으면 break;
			if(alpha<'A' || alpha>'Z') {
				break;
			}
			alphabets[i]=alpha;
			
			
			i++;
			
		}
		char startAlpha='A';
		int j=0;
	
		
		// 이쪽 다시
		while (startAlpha>='A'&&startAlpha<='Z') {
			int count=0;
			for(j=0;j<=i;j++) {
				if(startAlpha==alphabets[j]) {
					count++;
				}
			}
			
		
			
			startAlpha++;
			
		}
		
		
		
		
	}

}
