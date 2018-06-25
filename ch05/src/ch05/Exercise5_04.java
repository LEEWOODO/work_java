package ch05;

public class Exercise5_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr= {
				{5,5,5,5,5},
				{10,10,10,10,10},
				{20,20,20,20,20},
				{30,30,30,30,30}
		};
		
		int total=0;
		float avg=0;
		
		float count=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				total+=arr[i][j];
				count++;
			}
		}
		avg=total/count;
		System.out.println("total = "+total);
		System.out.println("avg = "+avg);
	}

}
