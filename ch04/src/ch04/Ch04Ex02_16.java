package ch04;

import java.util.Scanner;

public class Ch04Ex02_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("자연수 n(n≤6)을 입력받아 n * n 크기에 “출력 예”와 같이 출력되는 프로그램을\r\n" + 
				"작성하시오.");
		System.out.print("자연수를 입력해주세요.(3 or 4) > ");
		Scanner scanner=new Scanner(System.in);
		int num1=scanner.nextInt();
	
		char ch='A';
		int startNum=0;
		for(int i=1;i<=num1;i++) {
			// 알파벳 왼쪽 역삼각형 출력 4 3 2 1 씩 출력
			for(int j=num1;j>=i;j--) {
				System.out.printf("%c ",ch++);
			}
			// 숫자 오른쪽 역삼각형 출력
			// 0 1 2 3개 씩 출력
			for(int j=0;j<i-1;j++) {
				System.out.printf("%d ",startNum++);
			}
			System.out.println();
			
			
		}
	}

}
