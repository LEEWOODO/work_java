package ch05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayEx07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numArr=new int[10];
		
		for(int i=0;i<numArr.length;i++) {
			numArr[i]=i;
			System.out.print(numArr[i]);
		}
		System.out.println();
		
		for(int i=0;i<100;i++) {
			int n=(int)(Math.random()*10);	// 0~9중의 한 값을 임의로 얻는다. 배열이 0~9까지니깐. 배열의 인덱스 번호를 랜덤으로 얻는다.
			int temp=numArr[0];
			numArr[0]=numArr[n];
			numArr[n]=temp;
		}
		System.out.println(Arrays.toString(numArr));
		
		ArrayList<Integer> arrayList=new ArrayList<Integer>();
		for(int i=0;i<10;i++) {
			arrayList.add(i);
		}
		System.out.println(arrayList);
		Collections.shuffle(arrayList);
		
		
	}

}
