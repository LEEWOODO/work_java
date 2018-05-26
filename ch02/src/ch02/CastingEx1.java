package ch02;

public class CastingEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d=85.4;
		int score=(int)d;	// 소수점 아래 값은 버림 발생.
		
		System.out.println("d = "+d);
		System.out.println("score = "+score);
		
		int a=10;
		float intToFloat=(float)a;
		System.out.println(intToFloat);
	}

}
