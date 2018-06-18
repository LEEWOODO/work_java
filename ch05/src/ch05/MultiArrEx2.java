package ch05;

import java.util.Scanner;

public class MultiArrEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int SIZE=5;
		int x=0,y=0,num=0;
		
		int [][] bingo=new int[SIZE][SIZE];
		Scanner scanner=new Scanner(System.in);
		// 배열 초기화 1~5,6~10,..., 20~25
		for(int i=0;i<SIZE;i++) {
			for(int j=0;j<SIZE;j++) {
				bingo[i][j]=i*SIZE+j+1;
			}
		}
		
		// 배열에 저장된 값을 뒤섞는다 (shuffle)
		for(int i=0;i<SIZE;i++) {
			for(int j=0;j<SIZE;j++) {
				x=(int)(Math.random()*SIZE);	// Size가 5일때; 0.5~ 4.5 이니깐 x,y는 최대 4가 된다. 마지막 배열 bingo[4][4];
				y=(int)(Math.random()*SIZE);
				int tmp=bingo[i][j];
				bingo[i][j]=bingo[x][y];
				bingo[x][y]=tmp;
				
			}
		}
		
		do {
			for(int i=0;i<SIZE;i++) {
				for(int j=0;j<SIZE;j++) {
					System.out.printf("%2d ",bingo[i][j]);
				}
				System.out.println();
			}
			System.out.println();
			
			System.out.printf("1~%d의 숫자를 입력하세요. (종료:0)", SIZE*SIZE);
			String tmp=scanner.nextLine();
			num=Integer.parseInt(tmp);
			
			// 입력 받은 숫자와 같은 숫자가 저장된 요소를 찾아서 0 저장.
			outer:
				for(int i=0;i<SIZE;i++) {
					for(int j=0;j<SIZE;j++) {
						if(bingo[i][j]==num) {
							bingo[i][j]=0;
							break outer;
						}
					}
					
				}
		}while(num!=0);
			System.out.println("===========BYE============");
		/*for(int i=0;i<SIZE;i++) {
			for(int j=0;j<SIZE;j++) {
				System.out.print(bingo[i][j]+"\t");
			}
			System.out.println();
			
		}*/
		
		
	}

}
