package ch04;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=10;
		
		// 내 코드
		
		// 행의 수만큼 반복
		for(int i=0;i<num;i++) {
			for(int j=num;j>0;j--) {
				if(i>=j-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();System.out.println();
		// 강사님 코드
		for(int j=0;j<num;j++) {
			// 열의 수만큼 반복
			for(int k=0;k<num;k++) {
				// 현재 찍을 곳이 빈칸이 아닌경우
				if(k>=num-j-1) {
					System.out.print("*");
				}
				// 그 외는 빈칸인 경우이므로 빈캄 찍기
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		
		
		
	}

}
