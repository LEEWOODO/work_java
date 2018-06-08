package ch04;

import java.util.Scanner;

public class Ch04Ex02_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=0;
		Scanner scanner=new Scanner(System.in);
		
		while (num!=-1) {
			System.out.print("숫자 입력:(종료:-1) ");
			num=scanner.nextInt();
			if(num%3!=0) {
				continue;
			}else {
				num/=3;
				System.out.println("3으로 나눈 몫은: "+num);
			}
			
		}
		System.out.println("BYE");
	}

}
