package ch04;

public class Ex00 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i;
		int z=0;
		
		int num=10;
		// 강사님 코드
		
		// 행의 수만큼 반복
		for(int j=0;j<num;j++) {
			// 열의 수만큼 반복
			for(int k=0;k<num;k++) {
				// 현재 찍을 곳이 빈칸이 아닌경우
				if(k>=j) {
					System.out.print("*");
				}
				// 그 외는 빈칸인 경우이므로 빈캄 찍기
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		
		/*  내가한것
		for(i=10;i>0;i--) {
			
		

			for(int j=0;j<i;j++) {
				System.out.print("*");
				
			}
			
			System.out.println();
			for(z=10;z>=i;z--) { // 1 ,2 ,3 ...9번까지의 공백출력
				System.out.print(" ");
			}
		*/
	}

}
