package ch04;

public class Exercise4_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		/*	 내가 한것

		int i=1;   		// 2 x 1 2 x 2 2 x 3 의 뒤의 증가수 1,2,3
		int count=0;    // 3번 반복 되면 while 문 탈출
		int j;
		int k=0;
		while (true) {
			if(count==1) {
				break;
			}
		// 2단 부터 시작
		// j는 증가수 1,2,3
		// k는 2단부터 4단까지
			for(j=1;j<=3;j++) {
				for(k=2;k<=4;k++) {
					System.out.printf("%d*%d=%d\t",k,j,k*j);
				}
				System.out.println();
			}
			System.out.println();
			//System.out.println("j: "+j+" k: "+k);
			
			for(j=1;j<=3;j++) {
				for(k=5;k<=7;k++) {
					System.out.printf("%d*%d=%d\t",k,j,k*j);
				}
				System.out.println();
			}
			System.out.println();
		//	System.out.println("j: "+j+" k: "+k);
			
			for(j=1;j<=3;j++) {
				for(k=8;k<=9;k++) {
					System.out.printf("%d*%d=%d\t",k,j,k*j);
				}
				System.out.println();
			}
		
			
			
			count++;
		}*/
		
		
		/*
		 * 강사님 [방법 1]
		 */
		// i는 행, j는 열
//		for(int i=1;i<=9;i++) {
//			for(int j=1;j<=3;j++) {
//				int x=(j+1)+((i-1)/3)*3; //
//				int y=i%3==0?3:i%3;  // i%3 한 나머지가 0이면 3으로 바꾸고, 0이 아니면 그대로 i를 사용
//				if(x<10) {
//					System.out.printf("%d*%d=%d\t",x,y,x*y);
//				}
//			
//			}
//			System.out.println();
//			if(i%3==0)System.out.println();
//		}
		
		
		/*
		 * 강사님 [방법 2]
		 */
		// i는 행, j는 열
		for(int i=1;i<=3;i++) {
			for(int j=2;j<=4;j++) {
				System.out.printf("%d*%d=%d\t",j,i,j*i);
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i=1;i<=3;i++) {
			for(int j=5;j<=7;j++) {
				System.out.printf("%d*%d=%d\t",j,i,j*i);
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i=1;i<=3;i++) {
			for(int j=8;j<=9;j++) {
				System.out.printf("%d*%d=%d\t",j,i,j*i);
			}
			System.out.println();
		}
		System.out.println();
		
	}	

}
