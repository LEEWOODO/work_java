package ch05;

import java.util.Scanner;

public class Ch05Ex01_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("10개의 정수를 입력하세요.");
		String[] input=scanner.nextLine().split(" ");
		int[] numArr=new int[input.length];
		for(int i=0;i<numArr.length;i++) {
			numArr[i]=Integer.parseInt(input[i]);
		}
		// 최솟값 찾기
		int min=numArr[0];
		for(int i=0;i<numArr.length;i++) {
			for(int j=0;j<numArr.length;j++) {
				if(numArr[i]>numArr[j]) {
					min=numArr[j];
				}
			}
		}
		System.out.println("최솟값: "+min);
		
		
	/*	for(int i:numArr) {
			System.out.print(i+" ");
		}*/
	}

}
