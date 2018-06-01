package ch03;

public class Exercise3_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 0=48   9=57
		// A=65   Z=90
		// a=97   z=122
		char ch='z';
//		char ch2=57;
//		
//		System.out.println(ch2);
		boolean b=( (48<=(int)ch && (int)ch<=57) || (65<=(int)ch && (int)ch<=90) || (97<=(int)ch && (int)ch<=122) );
		System.out.println(b);
	//	System.out.println(b);
	}

}
