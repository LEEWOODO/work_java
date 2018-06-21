package ch05;

import java.util.Scanner;

public class Ch05Ex02_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] ch= {'A','P','P','L','E','!'};
		Scanner scanner=new Scanner(System.in);
		char input=scanner.nextLine().charAt(0);
		boolean check=false;
		
		
		for(int i=0;i<ch.length;i++) {
			if(input==ch[i]) {
				check=true;
				System.out.println(i);
			}
		}
		if(check==false) {
			System.out.println("None");
		}
	}	

}
