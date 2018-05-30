package ch03;

public class OperatorEx26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a= 5;
		int b=0;
		
		/*
		 * a!=0 || ++b!=0 이 문장을 실행하면
		 * 왼쪽 a!=0 true 이기 때문에  ++b!=0 문장은 실행하지 않고 결과값 true를 반환한다.
		 * 다음도 마찬가지 ...
		 */
		System.out.printf("a=%d, b=%d%n",a,b);
		System.out.printf("a!=0 || ++b !=0 = %b%n",a!=0 || ++b!=0 );
		System.out.printf("a = %d, b= %d%n",a,b );
		System.out.printf("a==0 && ++b!=0 = %b%n",a==0 && ++b!=0);
		System.out.printf("a = %d, b= %d%n",a,b );
		
		
	}

}
