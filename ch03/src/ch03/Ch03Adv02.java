package ch03;

import java.util.Scanner;

public class Ch03Adv02 {
	/*
	 * 최대공약수, 최소공배수 문제
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
	
		int num1=0;
		int num2=0;
		int temp=1;
		 int 최대공약수=0;
		 int 최소공배수=0;
		System.out.print("두개의 수를 입력하시오: ");
		num1= scanner.nextInt();
		num2= scanner.nextInt();
			
		// 1. 두개의 수의 최대 공약수 구하기  OK
		// 2. 세개 이상의 수 --\NO
		최대공약수=goFindMax(num1,num2,최대공약수);
		System.out.println("최대공약수 : "+최대공약수);
		최소공배수=goFindMin(num1,num2,최대공약수);
		System.out.println("최소공배수는 : "+최소공배수);
		
				
/*
		// 입력 수들 중에서 내림차순으로 정렬 시킨다.
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arrayInt[i] < arrayInt[j]) {
					int temp = 0;
					temp = arrayInt[j];
					arrayInt[j] = arrayInt[i];
					arrayInt[i] = temp;
				}
			}
		}
		System.out.println("정렬 시킨 배열");
		for (int i = 0; i < n; i++) {
			System.out.print(arrayInt[i] + " ");
		}
		System.out.println();
*/

	}

	private static int goFindMin(int num1, int num2, int 최대공약수) {
		// TODO Auto-generated method stub
		// 두수의 곱에서 최대공약수 나누면 최소공배수다
		int 최소공배수 = (num1*num2)/최대공약수;
		return 최소공배수;
	}

	private static int goFindMax(int num1, int num2,int 최대공약수) {
		int temp=1;
		
		// TODO Auto-generated method stub
		while (temp > 0) {
			//
			temp = num1 % num2;
			num1 = num2;
			num2 = temp;
		}
		최대공약수=num1;
		return 최대공약수;
	}

}
