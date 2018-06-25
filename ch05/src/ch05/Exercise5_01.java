package ch05;

import java.util.Arrays;

public class Exercise5_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// a --> 오류x
		int[] arrA[];
		// System.out.println(Arrays.toString(arrA));
		// b --> 오류x
		int[] arrB = { 1, 2, 3, };
		System.out.println(Arrays.toString(arrB));

		// c --> 오류x
		int[] arrC = new int[5];
		System.out.println(Arrays.toString(arrC));

		// d	--> 오류 : 객체선언과 동시에 초기화를 할 수 없다.
		// 				, 두번째 대괄호 숫자 삭제
		//	int[] arrD = new int[5] {1,2,3,4,5};
		//	System.out.println(Arrays.toString(arrD));
		
		// e	--> 오류
		// 선언하는 부분에 배열의 크기를 지정할 수 없음
		// int arrE[5];
		
		//f
		int[] arrF[]=new int[3][];
		System.out.println(Arrays.toString(arrF));

	}

}
