package ch05;

import java.util.Arrays;
import java.util.Scanner;

public class Ch05Ex02_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int count=0;
		int[] numbers=new int[2];
		int j=0;
		while (true) {
			int input=Integer.parseInt(scanner.nextLine());
			
			if(j==numbers.length) {
				int[] tmp=new int[numbers.length*2];
				System.arraycopy(numbers, 0, tmp, 0, numbers.length);
				numbers=tmp;
			}
			
			if(input==999) {
				break;
			}
			else {
				numbers[count]=input;
				count++;
			}
			j++;
		}
	//	System.out.println(Arrays.toString(numbers));
		
		int max=numbers[0];
		int min=numbers[0];
		// max값 찾기
		for(int i=0;i<count;i++) {
			 max=max>numbers[i+1]?max:numbers[i+1];
		}
		// min값 찾기
		for(int i=0;i<count;i++) {
			 min=min<numbers[i+1]?min:numbers[i+1];
		}
		System.out.println("max: "+max);
		System.out.println("min: "+min);
		
	}

}
