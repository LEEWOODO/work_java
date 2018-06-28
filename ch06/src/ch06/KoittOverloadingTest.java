package ch06;

class KoittOverloadingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KoittOverloadingTest koittOverloadingTest=new KoittOverloadingTest();	// plus 메소드들이 static이 아니므로 객체생성후 사용 가능
		int result1=koittOverloadingTest.plus(3, 5);
		System.out.println(result1);
		
		long result2=koittOverloadingTest.plus(3L, 5L);
		System.out.println(result2);
		
		double result3=koittOverloadingTest.plus(3.0, 5.0);
		System.out.println(result3);
		
		double result4=plus(1.0, 2.0, 3.0);	// static으로 정의된 메소드이기 때문에 바로 접근 가능
		System.out.println(result4);
	}
	// int형 값 두개를 더한 결과를 리턴
	int plus(int a,int b) {
		return a+b;
	}
	
	// long형 값 두개를 더한 결과를 리턴
	long plus(long a,long b) {
		return a+b;
	}
	
	double plus(double a, double b) {
		return a+b;
	}
	static double plus(double a, double b,double c) {
		return a+b+c;
	}

}
