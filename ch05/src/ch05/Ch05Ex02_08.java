package ch05;

import java.util.Scanner;

public class Ch05Ex02_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num=new int[2];
		Scanner scanner=new Scanner(System.in);
		int inputNum=0;
		int multiplesOfFive=0;
		int sum=0;
		int i=0;
		
		while (true) {
			inputNum=Integer.parseInt(scanner.nextLine());
			
			if(i==num.length) {
				int[] tmp=new int[num.length*2];
				System.arraycopy(num, 0, tmp, 0, num.length);
				num=tmp;
			}
			
			if(inputNum==0) {
				break;
			}else {
				num[i]=inputNum;
				if(num[i]%5==0) {
					multiplesOfFive++;	// 5의 배수의 갯수
					sum+=num[i];
				}
				i++;
			}
			
		}
		System.out.printf("Multiples of 5 : %d%n",multiplesOfFive);
		System.out.printf("sum : %d%n",sum);
		System.out.printf("avg : %.1f%n",sum/(float)multiplesOfFive);
	}

}
