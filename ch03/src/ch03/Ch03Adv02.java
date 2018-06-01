package ch03;

import java.util.Scanner;

public class Ch03Adv02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int n=0;
		boolean check=false;
		int 최대공약수=0;
		System.out.print("한개의 수를 입력하시오: (2<= N <=10) ");
		n=Integer.parseInt(scanner.nextLine());
		int[] arrayInt=new int[n];
		
		for(int i=0;i<n;i++) {
			arrayInt[i]=scanner.nextInt();
		}
		System.out.println("입력 예-----------");
		for(int i=0;i<n;i++) {
			System.out.print(arrayInt[i]+" ");
		}
		System.out.println();System.out.println();
		System.out.println("출력 예-----------");
		for(int j=2;j<100;j++) {
			for(int z=0;z<arrayInt.length;z++) {
				if(arrayInt[z]%j==0 &&arrayInt[z+1]%j==0) {
					최대공약수=j;
					arrayInt[z]=arrayInt[z]/j;
					arrayInt[z+1]=arrayInt[z+1]/j;
					System.out.println(최대공약수);
				}
				
			}
		}
		
	}

}
