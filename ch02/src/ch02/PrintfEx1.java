package ch02;

public class PrintfEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * %b: boolean
		 * %d: 10진수
		 * %o: 8진수
		 * %x, %X: 16진수
		 * %f: float
		 * %e, %E: 지수
		 * %c: 문자
		 * %s: 문자열
		 * 외우는 것이 아니다!!
		 */
		
		byte b=1;
		short s=2;
		char c='A';
		
		int finger=10;
		long big=100_000_000_000L;
		long hex=0xFFFF_FFFF_FFFF_FFFFL;
		
		int octNum=010;
		int hexNum=0x10;
		int binNum=0b10;
		
		System.out.printf("b=%d%n",b);
		System.out.printf("s=%d%n",s);
		System.out.printf("c=%c, %d %n", c, (int)c);
		System.out.printf("finger=[%10d]%n", finger);  	// 빈칸 10개를 만들어서 finger숫자를 거꾸로 오른쪽 부터 채운다.
		System.out.printf("finger=[%-5d]%n", finger);	// 빈칸 5개를 만들어서 finger숫자를 왼쪽 부터 채운다.	
		System.out.printf("finger=[%05d]%n", finger);	// 빈칸 10개를 만들어서 finger숫자를 거꾸로 오른쪽 부터 채우고 빈칸은 0으로 대체
		System.out.printf("big=%d %n", big);
		System.out.printf("hex=%x %n", hex);			// %#x : 0xffffffffffffffff  , %x : ffffffffffffffff
		System.out.printf("octNum=%o, %d%n", octNum, octNum);
		System.out.printf("hexNum=%x, %d%n", hexNum, hexNum);
		System.out.printf("binNum=%s, %d%n", Integer.toBinaryString(binNum), binNum);
		
	}

}
