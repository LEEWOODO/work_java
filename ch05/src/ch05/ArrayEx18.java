package ch05;

public class ArrayEx18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] score= {
				{100,100,100}
				,{20,20,20}
				,{30,30,30}
				,{40,40,40}
				
		};
		
		int sum=0;
		for(int i=0;i<score.length;i++) {	// i는 행
			for(int j=0;j<score[i].length;j++) {	// j는 i행의 열
			
				System.out.printf("score[%d][%d]=%d%n",i,j,score[i][j]);
			}
		}
		
		for(int[] temp: score) {
			for(int i:temp) {
				sum+=i;
			}
		}
		System.out.println("sum= "+sum);
	}

}
