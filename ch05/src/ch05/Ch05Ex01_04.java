package ch05;

import java.util.Scanner;

public class Ch05Ex01_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num=new int[100];
		int input=0;
		Scanner scanner=new Scanner(System.in);
		
		for(int i=0;i<num.length;i++) {
			input=Integer.parseInt(scanner.nextLine());
			if(input!=0) {
				num[i]=input;
			}else {	// 1. 입력받은 수가 0이면 그때의 i-1 까지 출력
					// 2. 1번을 i-1부터 0까지 출력하게 reverse 시킨다
				for(int j=i-1;j>=0;j--) {
					System.out.printf("%d ",num[j]);
				}
				break;
			}
		}
		
	}

}
