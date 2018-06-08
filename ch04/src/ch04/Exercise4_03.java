package ch04;

public class Exercise4_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		
		// [방법1]  55번 반복
		int Total=0;
		for(int i=1;i<=10;i++) { // 10회반복
			int lineTotal=0;
			for(int j=1;j<=i;j++) {
				lineTotal+=j;
				Total+=j;
				count++;
			}
		//	System.out.println("lineTotal : "+lineTotal);
		}
		System.out.println("1+...(1+2+3+...+10)까지의 합: "+Total);
		System.out.println(count+" 번 반복"); 
		
		
		
		// [방법2] for문 한번만 쓰기
		int sum=0;				// 괄호 안의 부분 합
		int totalSum=0;			// 총합
		int count2=0;
		for(int i=1;i<=10;i++) {
			sum+=i;
			totalSum+=sum;
			count2++;
		}
		System.out.println(totalSum);
		System.out.println(count2);	// 총 10회 반복
		
		
		
		
		
	}

}
