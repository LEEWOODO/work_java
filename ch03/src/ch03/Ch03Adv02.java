package ch03;

import java.util.Arrays;
import java.util.Scanner;

public class Ch03Adv02 {
	/*
	 * 최대공약수, 최소공배수 문제
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int inputNumber=0;
		int[] arrayNum;
		int a;
		int b;
		int c;
		int GCD = 0;/// 두개수a,b의 최대공약수// 세개의수 최대공약수 d,c
		int LCM=0; // 최소공배수
		// gcd 최대공약수를 뜻
		System.out.print("몇개의 수에 대해서 최대공약수, 최소공배수를 구하시겠습니까? ");
		inputNumber=2;
		
		arrayNum=new int[inputNumber];
		
		String[] str=scanner.nextLine().split(" ");
		for(int i=0;i<str.length;i++) {
			arrayNum[i]=Integer.parseInt(str[i]);
		}
		
		/* 유클리드 호제법으로 구하기
		 *  두 정수 a와 b에 대하여 예를 들어봅시다. f(18, 12)의 경우 18 mod 12 = 6이므로,
		 *  f(18, 12) = f(12, 6)이 성립합니다. 이 때 12 mod 6 = 0이 성립하므로 
		 *  f(18, 12) = f(12, 6) = gcd(12, 6) = 6 이 성립합니다
		 */
		if(inputNumber==2) {
		// 최대공약수 구하기
		
			a= arrayNum[0];
			b= arrayNum[1];
			goGCD(a,b);// 최대공약수
			goLCM(a,b);// 최소공배수
			
		
		}else if (inputNumber>2 && inputNumber<=10) {
			
		}else {
			System.out.println();
		}
		
		
	}

	private static void goLCM(int a, int b) {
		// TODO Auto-generated method stub
		/*
		 * 최소공배수 구하기
		 * 두 정수가 가지는 배수 중 가장 작은 값
		 */
		int[] arrayA=new int[a/2+2];
		int j=0;
		for(int i=1;i<=a;i++) {
			// a의 약수들을 저장하는 배열
			if(a%i==0) {
				arrayA[j]=i;
			}
			j++;
		}
		System.out.println(Arrays.toString(arrayA));
		// b의 약수들
	}

	private static void goGCD(int a, int b) {
		// TODO Auto-generated method stub
		int mod=a%b;
		int GCD=0;	// 최대공약수
		while (mod>0) {
			a=b;
			b=mod;
			GCD=b;
			mod=a%b;
			
		}
		System.out.println("최대공약수는: "+GCD);
	}


}
