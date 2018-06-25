package ch05;

import java.util.Arrays;

public class Exercise5_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ballArr= {1,2,3,4,5,6,7,8,9};
		int[] ball3=new int[3];
		// 배열 ballArr의 임의의 요소를 골라서 위치를 바꾼다.
		for(int i=0;i<ballArr.length;i++) {
			int j=(int)(Math.random()*ballArr.length);// j는 0~8: 인덱스 번호
			int tmp=0;
			
			tmp=ballArr[j];
			ballArr[j]=ballArr[i];		
			ballArr[i]=tmp;

		}
		// 배열 ballArr의 맨 앞에서 3개의  수를 배열 ball3로 복사한다.
		// (2) 강시님 코드
		System.arraycopy(ballArr, 0, ball3, 0, 3);
		// (2)
		// 내가한 코드
		//		for(int i=0;i<ball3.length;i++) {
		//			ball3[i]=ballArr[i];
		//		}
		System.out.println(Arrays.toString(ballArr));
		System.out.println(Arrays.toString(ball3));
	}

}
