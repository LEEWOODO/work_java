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
		if(num1>6) {
			System.out.println("INPUT ERROR!");
			return;// 특정 값을 리턴할 경우 사용하는 키워드
				   // 지금은 리턴 타입이 void 이므로 특정 값이 없는경우 main메소드를 리턴하면 프로그램종료와 같다.
			
		}
		// 내가 한것
//		for(int i=1;i<=num1;i++) {
//			// 알파벳 왼쪽 역삼각형 출력 4 3 2 1 씩 출력
//			for(int j=num1;j>=i;j--) {
//				System.out.printf("%c\t",ch++);
//			}
//			// 숫자 오른쪽 역삼각형 출력
//			// 0 1 2 3개 씩 출력
//			for(int j=0;j<i-1;j++) {
//				System.out.printf("%d\t",startNum++);
//			}
//			System.out.println();
//			
//			
//		}
		
		// 강사님 코드
		char alphabat='A';
		int count=0;
		for(int i=0;i<num1;i++) {
			for(int j=0;j<num1;j++) {
				int limit=num1-i;
				if(j<limit) {
					System.out.print(alphabat+" ");
					alphabat++;
				}else {
					System.out.print(count+" ");
					count++;
				}
			}
			System.out.println();
		}
	}

}
