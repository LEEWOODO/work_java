package ch05;

public class ArrayEx08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 45개의 정수값을 저장하기 위한 배열 생성
		int[] ball=new int[45];
		
		for(int i=0;i<ball.length;i++) {
			ball[i]=i+1;	// ball[i]=1,2,3,4,....45 까지 저장
		}
		
		int temp=0;
		int j=0;
		
		// 배열 i
		for(int i=0;i<6;i++) {
			j=(int)(Math.random()*45);	//0~44범위의 임의의 값을 얻는다
			temp=ball[i];
			ball[i]=ball[j];
			ball[j]=temp;
		}
		
		for(int i=0;i<6;i++) {
			System.out.printf("ball[%d]=%d%n",i,ball[i]);
		}
		
	}

}
