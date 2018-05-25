package ch02;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		int inputNum;
		int check=1;
		int length=0;
		while (check==1) {
			length=0;
			System.out.print("2자리 정수를 입력하세요. >> ");
			inputNum=scanner.nextInt();
			length=checkDigits(inputNum);
			if(length>2) {
				break;
			}
			System.out.println("입력하신 숫자는 : "+ inputNum+" 입니다");
			
			// 10진수 8진수 16진수로 출력하기
			System.out.printf("입력한 %d는 10진수로 %d 입니다. \n",inputNum,inputNum);
			System.out.printf("입력한 %d는 8진수로 %o 입니다. \n",inputNum,inputNum);
			System.out.printf("입력한 %d는 16진수로 %#X 입니다. \n",inputNum,inputNum);
			System.out.println("Enter the Number>> Continue : 1	,	Exit : 0");
			check=scanner.nextInt();
			if(check==0) {
				break;
			}else if (check==1) {
				continue;
			}else {
				System.out.println("0과 1만 입력할 수 있습니다. 다시 시작하세요.");
			
			}
			
		}
		System.out.println("---------------------------BYE---------------------------");
		
		
		
	
		
	}

	public static int checkDigits(int inputNum) {
		int a=0;
		a=inputNum;
		int length=0;
		while (a!=0) {
		
			a=a/10;
		
			length++;
		
//			System.out.println();
//			System.out.printf("a : "+a);	System.out.printf( "   length : "+length);
//		
//			System.out.println();
			
		}
		return length;
	}
	

}
