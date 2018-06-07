package ch04;

public class Exercise4_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		
		for(int i=1;i<=20;i++) {
			if(i%2==0||i%3==0) {
				continue;
			}
			else {
				//System.out.println(i);
				sum+=i;
			}
		}
		System.out.println("2, 3의 배수가 아닌 수의 합은: "+sum);
	}

}
