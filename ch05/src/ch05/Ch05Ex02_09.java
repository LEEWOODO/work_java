package ch05;

import java.util.Scanner;

public class Ch05Ex02_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num=new int[100];
		Scanner scanner=new Scanner(System.in);
		int inputNum=0;
		int count=0;
		
		while (true) {
			inputNum=Integer.parseInt(scanner.nextLine());
			if(inputNum==0) {
				break;
			}else {
				num[count]=inputNum;
				count++;
			}
			
		}
		
		// 짝 홀수 구분
		
		for(int i=0;i<count;i++) {
			if(num[i]%2==0) {
				// 요소가 짝수이면 2로 나눈 몫을 num[i]에 다시 저장
				num[i]=num[i]/2;
				
			}else {
				// 요소가 홀수이면 2로 곱한 값 을 num[i]에 다시 저장
				num[i]=num[i]*2;
			}
		}
		
		//출력
		
		for(int i =0;i<count;i++) {
			System.out.print(num[i]+" ");
			
		}
		
	}

}
