package ch03;

public class OperatorEx12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c1='a';
		char c2=c1;
		char c3=' ';
		
		int i=c1+1;	// i='a'+1= 97+1= 98   c1=97
		
		c3=(char)(c1+1); // c1+1 -> 97+1 =>98 =>'b'
		c2++;			 // 98-> 'b'
		c2++;			 // 99-> 'c'
		
		System.out.println("i = "+i);
		System.out.println("c2 = "+c2);
		System.out.println("c3 = "+c3);
	}

}
