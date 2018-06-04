package ch03;

public class Exercise3_2 {
	// 12.3 만들고 0.5 더하고 반올림
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numOfApples=126;
		int sizeOfBucket=10;
		int numOfBucket=(numOfApples%sizeOfBucket==0?numOfApples/sizeOfBucket: (numOfApples/sizeOfBucket)+1);
		// 강사님 답
		// int numOfBucket2=numOfApples/sizeOfBucket+(numOfApples%sizeOfBucket>0? 1 : 0);
		/*
		 * 123/10.0=12.3000 (double 형)
		 * 12.3000+ 0.5 =12.8000
		 * Math.round(12.8)= 13;
		 */
		System.out.println("필요한 바구니의 수:"+numOfBucket);
	   
	}

}
