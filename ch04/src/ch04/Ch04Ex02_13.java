                      package ch04;

import java.util.Scanner;

public class Ch04Ex02_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.print("행을 입력하여주세요. : ");
		int row=Integer.parseInt(scanner.nextLine());
		System.out.print("열을 입력하여주세요. : ");
		int col=Integer.parseInt(scanner.nextLine());
		int num=1;
		for(int i=1;i<=row;i++) {
			//num=i;
			for(int j=1;j<=col;j++) {
				System.out.printf("%d ",i*j);
				
			}
			System.out.println();
		}
	}

}
