package ch04;

public class Exercise4_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=12345;
		int sum=0;
		
		while (num>0) {
			sum+=num%10;  // 5 4 3 2 1
			num/=10; // 1234  123 12 1
//			System.out.println("sum : "+sum);
//			System.out.println("num : "+num);
				
			
			
		}
		
		System.out.println("sum = "+sum);
	}

}
