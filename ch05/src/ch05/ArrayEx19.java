package ch05;

public class ArrayEx19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] score= {
				{100,100,100}
				,{20,20,20}
				,{30,30,30}
				,{40,40,40}
				,{50,50,50}
		};
		char[][] score2=new char[3][3];
		// 과목별 총점
		int korTotal=0, engTotal=0, mathTotal=0;
		
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
		System.out.println("===============================================");
		for(int i=0;i<score.length;i++) {
			int sum=0;
			float avg=0.0f;
			
			korTotal+=score[i][0];
			engTotal+=score[i][1];
			mathTotal+=score[i][2];
			System.out.printf("%3d",i+1);	// 번호 출력
			
			for(int j=0;j<score[i].length;j++) {
				sum+=score[i][j];	//  한 명의 총점
				System.out.printf("\t%d",score[i][j]);
			}
			avg=sum/(float)score[i].length;
			System.out.printf("\t%d \t%.1f%n",sum,avg);
		}
		System.out.println("===============================================");
		System.out.printf("총점:\t%d\t%d\t%d",korTotal,engTotal,mathTotal);
		
	}

}
