package ch03;

public class OperatorEx28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=0xAB, y=0xF;
		System.out.printf("x = %#X \t\t%s%n",x, toBinaryString(x));
		System.out.printf("y = %#X \t\t%s%n",y, toBinaryString(y));
		System.out.printf("%#X | %#X = %#X \t%s%n",x,y,x|y,toBinaryString(x|y));
		System.out.printf("%#X & %#X = %#X \t%s%n",x,y,x&y,toBinaryString(x&y));
		System.out.printf("%#X ^ %#X = %#X \t%s%n",x,y,x^y,toBinaryString(x^y));
		System.out.printf("%#X ^ %#X ^ %#X = %#X \t%s%n",x,y,y,x^y^y,toBinaryString(x^y^y));
		
	}

	private static Object toBinaryString(int num) {
		// TODO Auto-generated method stub
		String zero="00000000000000000000000000000000"; 	// 32비트 (32개)
		String tmp= zero+Integer.toBinaryString(num);		// num을 2진수 문자열로 바꾸는 것이다.
															// tmp="0..(32개)" + "10101011"  --> 40개
	//	System.out.println("tmp = "+tmp+", tmp.length()= "+tmp.length() );
		return tmp.substring(tmp.length()-32); // tmp는 40개이므로 -32 한 tmp의 8번째 자릿수부터 끝의 2진수 까지 리턴하는 tmp;
	}

}
