package ch05;

import java.util.Arrays;
import java.util.Scanner;

public class Ch05Ex01_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String[] input = scanner.nextLine().split(" ");
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
		
		System.out.printf("%3d %3d",maxResult,minResult);
		
	}

}
