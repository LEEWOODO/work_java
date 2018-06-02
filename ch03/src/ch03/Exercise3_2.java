package ch03;

public class Exercise3_2 {
	// 12.3 만들고 0.5 더하고 반올림
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numOfApples=131;
		int sizeOfBucket=10;
	//	System.out.println(;
		System.out.println("필요한 바구니의 수:"+(numOfApples%sizeOfBucket==0?numOfApples/sizeOfBucket: (numOfApples/sizeOfBucket)+1));
	//	System.out.println("필요한 바구니의 수: "+(int) (Math.round(((numOfApples/(double)sizeOfBucket)+0.5))));
	}

}
