package ch04;

public class Exercise4_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=6; // 눈의 합
		int i;   // 첫 번째 주사위의 눈
		int j;   // 두 번째 주사위의 눈
		
		for(i=1;i<=6;i++) {
			for(j=1;j<=6;j++) {
				if(sum==i+j) {
					System.out.printf("[%d,%d]%n",i,j);
				}
				
			}
		}
		
	}

}
