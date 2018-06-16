package ch05;

public class ArrayEx14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="ABCDE";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			System.out.println("str.charAt("+i+"): "+ch);
		}
		
		char[] chArr=str.toCharArray();
		System.out.println(chArr);
	}

}
