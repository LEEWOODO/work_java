package ch04;

import java.util.Scanner;

public class Ch04Ex02_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int base = 0; // 밑변
		int height = 0; // 높이
		double triangleArea=0.0;
		char ch=' ';

/*		do {
			System.out.print("삼각형의 밑변의 길이 입력 >");
			base = Integer.parseInt(scanner.nextLine());
			System.out.print("삼각형의 높이의 길이 입력 >");
			height = Integer.parseInt(scanner.nextLine());
			triangleArea=base*height/2.0;
			System.out.printf("triangleArea=%.1f%n",triangleArea);
			System.out.print("Continue? ");
			ch=scanner.nextLine().charAt(0);
			//System.out.println("ch : "+ch);
		} while (ch=='y'||ch=='Y');
*/
		
		while (true) {
			System.out.print("삼각형의 밑변의 길이 입력 >");
			base = Integer.parseInt(scanner.nextLine());
			System.out.print("삼각형의 높이의 길이 입력 >");
			height = Integer.parseInt(scanner.nextLine());
			triangleArea=base*height/2.0;
			System.out.printf("triangleArea=%.1f%n",triangleArea);

		
			
			// 계속 반복할 것인지를 물어보기
			System.out.print("Continue? ");
			
			String answer=scanner.nextLine();
			/*     유용하다 !!!         */
			// 특정조건("Y" 혹은 "y"가 아닐경우)일 경우 반복문 종료
			// equalsIgnoreCase(): 괄호 안의 문자열의 대소문자 구별없이
			// 변수와 값이 같다면 true, 아니면 false 리턴
			if(!answer.equalsIgnoreCase("Y")) {
				break;
			}
			
		}
	
		
		
		
		
	}

}
