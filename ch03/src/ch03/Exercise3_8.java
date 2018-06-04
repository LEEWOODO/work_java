package ch03;

public class Exercise3_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte a=10;
		byte b=20;
		byte c=(byte) (a+b);
		
		char ch='A';
		ch=(char) (ch+2);
		
		float f= 3/2f;
		long l =3000 * 3000*3000L;
		
		float f2=0.1f;
		double d=0.1f;
		
		boolean result= (float)d==f2;  // 비교연산자 이전에 형변환이 먼저 일어나고 계산이 된다.
		
		System.out.println("c= "+c);
		System.out.println("ch= "+ch);
		System.out.println("f= "+f);
		System.out.println("l= "+l);
		System.out.println("result= "+result);
	}

}
