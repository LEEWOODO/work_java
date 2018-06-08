package ch04;

public class Exercise4_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1번
		int x=14;
		System.out.println(x>10 && x<20);
		
		// 2번
		char ch='a';
		System.out.println(ch!=' '?true:false);
		/*강사님 답*/
		System.out.println(!(ch==' '||ch=='\t'));
		System.out.println(ch!=' '&&ch!='\t');
		
		// 3번
		ch='a';
		System.out.println(ch=='x'||ch=='X'?true:false);
		
		// 4번
		ch='5';
		System.out.println(ch<='9'&&ch>='0'? true: false);
		
		// 5번
		ch='g';
		System.out.println((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')?true:false);

		// 6번
		int year=2018;
		System.out.println(year%400==0 || (year%4==0&&year%100!=0)?true:false);

		// 7번
		boolean powerOn=false;
		System.out.println(powerOn==false?true:false);
		/*강사님 답*/
		boolean sevenOne=!powerOn;
		boolean sevenTwo=powerOn==false;
		
		// 8번
		String str="yes2";
		System.out.println(str=="yes"?true:false);
		System.out.println(str.equals("yes"));
		System.out.println("yes2".equals(str));
	}

}
