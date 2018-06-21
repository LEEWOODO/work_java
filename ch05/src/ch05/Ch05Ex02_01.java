package ch05;

import java.util.Scanner;

public class Ch05Ex02_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] ch=new String[10];
		Scanner scanner=new Scanner(System.in);
		ch=scanner.nextLine().split(" ");
		for(int i=ch.length-1;i>=0;i--) {
			System.out.print(ch[i]+" ");
		}
		
	}

}
