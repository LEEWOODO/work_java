package ch03;

public class OperatorEx30 {
	static String toBinaryString(int x) {
		String zero="0000000000000000000000000000000";
		String tmp=zero+Integer.toBinaryString(x);
		
		return tmp.substring(tmp.length()-32);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dec= 8;
		System.out.printf("%d >> %d = %4d \t%s%n",dec,0,dec>>0,toBinaryString(dec>>0));
//		System.out.printf();
//		System.out.printf();
//		System.out.printf();
//		System.out.printf();
//		System.out.printf();
//		System.out.printf();
//		System.out.printf();
		
	}

}
