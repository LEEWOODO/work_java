package ch03;

public class OperatorEx27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean b=true;
		char ch='C';  // 'C'< 'c'
		char ch2='c';
		System.out.printf("b=%b%n",b);
		System.out.printf("!b=%b%n",!b);
		System.out.printf("!!b=%b%n",!!b);
		System.out.printf("!!!b=%b%n",!!!b);
		System.out.println();
		
		System.out.printf("ch=%c%n",ch);
		System.out.printf("ch2=%d%n",(int)ch2);
		System.out.printf("ch < 'a' || ch > 'z' = %b%n",ch<'a'||ch>'z');
		System.out.printf("!('a' < =ch && ch <= 'z') = %b%n",!('a'<=ch && ch<='z'));
		System.out.printf("'a' <= ch && ch <= 'z' = %b%n",'a'<=ch && ch<='z');
	}

}
