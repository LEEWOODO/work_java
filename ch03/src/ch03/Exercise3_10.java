package ch03;

public class Exercise3_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 0=48   9=57
		// A=65   Z=90
		// a=97   z=122
		char ch='A';
		// 소문자= 대문자+32
						
		// ('A'<=ch&&ch<='Z')? (char)(ch+32):ch;
		char lowerCase= (char) ((int)ch>=65&&(int)ch<90? (int)ch+32: (int)ch);
		
		char lowerCase2= ('A'<=ch&&ch<='Z')? (char)(ch+32):ch;
		
		System.out.println("ch: "+ch);
		System.out.println("ch to lowerCase: "+lowerCase);
		System.out.println("ch to lowerCase2: "+lowerCase2);
	}

}
