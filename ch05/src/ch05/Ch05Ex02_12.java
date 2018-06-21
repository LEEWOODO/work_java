package ch05;

import java.util.Scanner;

public class Ch05Ex02_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] counter=new int[11];
		Scanner scanner=new Scanner(System.in);
		
		while (true) {
			int score=Integer.parseInt(scanner.nextLine());
			if(score==0) {
				break;
			}
			else {
				if(score>=100) {
					counter[10]+=1;
					continue;
				}
				int tmp=score/10; // tmp는 몫
				counter[tmp]+=1;	// tmp로 고치자
			}
		}
		for(int i=counter.length-1;i>=0;i--) {
			if(counter[i]!=0) {
				System.out.printf("%d  :  %d person%n",i*10,counter[i]);
			}
		
		}
		
	}

}
