package ch02;

public class OverflowEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		short sMin=-32768;  // short 2바이트= 16비트 2^16---> -2^15+ ~ 2^15-1
		short sMax=32767;
		char cMin=0;		// char 2바이트= 16비트 0~65535 까지
		char cMax=65535;
		
		System.out.println("sMin = "+sMin);
		System.out.println("sMin-1 = "+(short)(sMin-1));
		System.out.println("sMax = "+sMax);
		System.out.println("sMax+1 = "+(short)(sMax+1));
		System.out.println("cMin = "+(int)cMin);
		System.out.println("cMin-1 = "+(int)--cMin);
		System.out.println("cMax = "+(int)cMax);
		System.out.println("cMax+1 = "+(int)++cMax);
		
	}

}
