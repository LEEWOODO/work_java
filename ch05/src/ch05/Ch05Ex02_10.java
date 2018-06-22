package ch05;

import java.util.Arrays;
import java.util.Scanner;

public class Ch05Ex02_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("사람의 수를 입력해주세요: ");
		int people = Integer.parseInt(scanner.nextLine());
		if (people > 20) {
			return;
		}

		int[] score = new int[people];

		System.out.print(people + "명의 점수를 입력해주세요(띄워쓰기 구분)");
		String[] tmp = scanner.nextLine().split(" ");

		for (int i = 0; i < tmp.length; i++) {
			if(Integer.parseInt(tmp[i])!=0) {
				score[i] = Integer.parseInt(tmp[i]);
			}else {
				break;
			}
		
		}

		// ArrayEx10 예제 참고 버블정렬
		// 오름차순 정렬
		for (int i = 0; i < score.length - 1; i++) {
			boolean changed = false;

			for (int j = 0;j<score.length-1-i; j++) {
					if(score[j]>score[j+1]) {
						int temp=score[j];
						score[j]=score[j+1];
						score[j+1]=temp;
						changed=true;
					}
			}
			if(!changed) {
				break;
			}
		}
		
		// 오름차순 된것을 뒤에서 부터 출력한다.(내림차순)
		for(int i=score.length-1;i>=0;i--) {
			System.out.println(score[i]+" ");
		}

	}

}
