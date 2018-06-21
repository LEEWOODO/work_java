package ch05;

import java.util.Scanner;

public class Ch05Ex02_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] ch=new char[3][5];
		Scanner scanner =new Scanner(System.in);
		
		for(int i=0;i<ch.length;i++) {
			String[] alpha=scanner.nextLine().split(" ");
			
			for(int j=0;j<ch[i].length;j++) {
				ch[i][j]=alpha[j].charAt(0);
			}
		}
		System.out.printf("%c -> %d%n",'A',(int)'A');
		System.out.printf("%c -> %d%n%n",'a',(int)'a');
		for(int i=0;i<ch.length;i++) {
			for(int j=0;j<ch[i].length;j++) {
				char UpperCase=(char) (ch[i][j]+32);
				System.out.print(UpperCase+" ");
				
				
			}
			System.out.println();
		}
		
	}

}
