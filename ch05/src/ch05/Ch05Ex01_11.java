package ch05;

import java.util.Arrays;
import java.util.Scanner;

public class Ch05Ex01_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] counter=new int[10];
		// 무한 반복
		while (true) {
			// 1. 십의 자리 숫자의 개수를 저장하는 배열 생성
			
			
			// 2. 한줄에 하나씩 입력받기
			Scanner scanner=new Scanner(System.in);
			int num=Integer.parseInt(scanner.nextLine());
			
			// 4. 0이 입력되면 반복문 종료
			if(num==0) {
				break;
			}
			
			
			// 3. 십의 자리 수 구하기
			// 인덱스의 번호가 10의 자리 수 이다.
			int tem=num/10;
			counter[tem]++;
			
		}
		
		// 5. 결과 출력하기
		for(int i=0;i<counter.length;i++) {
			if(counter[i]!=0) {
				System.out.printf("%d : %d%n",i,counter[i]);
			}
		}
		System.out.println(Arrays.toString(counter));
		
		
	}

}
