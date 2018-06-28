package ch06;

public class FactorialTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result=factorial(4);
		System.out.println(result);
	}

	private static int factorial(int n) {
		// TODO Auto-generated method stub
		int result=0;
		if(n==1) {
			result=1;
		}else {
			result=n*factorial(n-1);
		}
		
		return result;
	}

}
