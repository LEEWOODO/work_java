package ch05;

public class Exercise5_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] cointUnit= {500,100,50,10};
		int money= 2680;
		System.out.println("money = "+money);
		
		for(int i=0;i<cointUnit.length;i++) {
			int count=0;
			count=money/cointUnit[i];
			System.out.printf("%d원 : %d%n",cointUnit[i],count);
			money=money%cointUnit[i];
		}
		
	}

}
