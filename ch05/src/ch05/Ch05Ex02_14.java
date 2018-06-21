package ch05;

public class Ch05Ex02_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix= {
				{3,5,9},
				{2,11,5},
				{8,30,10},
				{22,5,1}
		};
		int sum=0;
		
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				System.out.printf("%d ",matrix[i][j]);
				sum+=matrix[i][j];
			}
			System.out.println();
		}
		System.out.println(sum);
	}

}
