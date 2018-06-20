package ch05;

import java.util.Arrays;
import java.util.Scanner;

public class Ch05Ex01_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
	/*	내가 한 코드
	 * 
	 * String[] input = scanner.nextLine().split(" ");
		int[] num = new int[input.length];
		int temp = 0;
		int[] max = new int[num.length];
		int[] min = new int[num.length];
		int maxResult = 0;
		int minResult = 0;
		int j = 0, k = 0; // j는 max용, k는 min용 증감수
		for (int i = 0; i < input.length; i++) {
			num[i] = Integer.parseInt(input[i]);
		}

		// 100기준으로 나누끼
		for (int i = 0; i < num.length; i++) {

			if (num[i] - 100 > 0) {
				// num의 요소가 100이상이면 배열에서 가장 작은 값(MIN)을 찾는다.
				// min배열에 값들을 저장한다.
				min[k] = num[i];

				k++;

			} else {
				// num의 요소가 100미만이면 배열에서 가장 큰 값(MAX)을 찾는다.
				// max배열에 값들을 저장한다.
				max[j] = num[i];

				j++;
			}

		}
		System.out.println("100이상의 수 min배열 : " + Arrays.toString(min));
		System.out.println("100미만의 수 max배열 :  " + Arrays.toString(max));
		minResult = min[0];
		maxResult = max[0];
		for (int i = 0; i < min.length; i++) {
			if (min[i] != 0) {
				if (minResult > min[i]) {
					minResult=min[i];
				}
			}
		}
		System.out.printf("100이상의 수중 최솟값은: %d%n",minResult);
		for (int i = 0; i < max.length; i++) {
			if (max[i] != 0) {
				if (maxResult < max[i]) {
					maxResult=max[i];
				}
			}
		}
		System.out.printf("100이하의 수중 최대값은: %d%n",maxResult);
		
		System.out.printf("%3d %3d",maxResult,minResult);*/
		
		/**
		 * 강사님 코드
		 */
		// 1. 10개의 정수를 입력받기
		String numbers[]=scanner.nextLine().split(" ");
		
		// 1.1 전체 배열을 검사해서 1이하 10000이상일때 발견되면 프로그램 종료
		for(int i=0;i<numbers.length;i++) {
			int num=Integer.parseInt(numbers[i]);
			// 만약 1000 이상의 정수가 발견되면
			if(!(1<=num&&num<10000)) {
				// main메소드를 return 시켜 프로그램 종료
				System.out.println("1이상 10,000 미만의 정수만 가능");
				return;
			}
		}

		
		
		// 2. 100미만의 수 중 가장 큰 수를 저장하는 변수 max 선언
		int max=100;
		
		// 3. 100이상의 수 중 가장 작은 수를 저장하는 변수 min 선언
		int min=100;
		
	
		// 4. numbers 배열의 수를 하나씩 꺼내면서 비교하기
		for(int i=0;i<numbers.length;i++) {
			int num=Integer.parseInt(numbers[i]);
		
			
			if(num<100) {
				if(max==100) {
					max=num;
				}else {
					max=max>num?max:num;
				}
				
			}else {
				if(min==100) {
					min=num;
				}else {
					min=min<num?min:num;
				}
				
			}
		}
		
		// 5. 출력하기
		System.out.printf("MAX: %d, MIN: %d", max,min);
		
		
		
	}

}
