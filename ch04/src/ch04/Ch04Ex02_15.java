package ch04;

import java.util.Scanner;

public class Ch04Ex02_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("자연수 n을 입력받아 \"출력 예\"와 같이 출력되는 프로그램을 작성하시오.");
		System.out.print("자연수를 입력해주세요: >");
		Scanner scanner=new Scanner(System.in);
		int num=scanner.nextInt();
		int endNum=num*2-1;
		int centerNum=endNum/2+1;
		//내가한 코드
//  		for(int i=1;i<=endNum;i++) {
//			if(i<=centerNum) {
//				for(int j=1;j<=i;j++) {
//					System.out.printf("*");
//				}
//			}// 증가 별
//			else {
//				// i는 4,5
//				for(int j=i;j<=endNum;j++) {
//					System.out.printf("*");
//				}
//			}// 감소 별
//			System.out.println();
//		}
//		
		/*강사님 코드
		 * [방법1] for문 두개로 나누어서
		 * */
//		for(int i=1;i<=num;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		for(int i=1;i<=num-1;i++) {
//			for(int j=num-1;j>=i;j--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//	
		// 방법2
  		int i=1;
  		boolean isDec=false;
  		while (i!=0) {
  			for(int j=0;j<i;j++) {
  				System.out.print("*");
  			}
  			System.out.println();
  			if(i==num) {
  				isDec=true;
  			}
  			if(!isDec) {// i가 증가할때 isDec은 현재 false니깐 true가 된다.
  						// i가 감소할때 isDec는 현재 true이니깐 false가 되므로 이 if 문 실행 안한다.
  				i++;
  			}
  			else {
				i--;
			}
			
		}
	
	}

}
