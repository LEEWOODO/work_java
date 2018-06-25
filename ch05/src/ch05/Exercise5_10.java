package ch05;

public class Exercise5_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] abcCode = { '`', '~', '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '_', '+', '=', '|', '[',
				']', '{', '}', ';', ':', ',', '.', '/' };
		// 0 1 2 3 4 5 6 7 8 9
		char[] numCode = { 'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p' };

		String src = "abc123";
		String result = "";
	
		for (int i = 0; i < src.length(); i++) {
			char ch = src.charAt(i);	// ch는 a,b,c
			int abcIndex=0;
			int numIndex=0;
			if('a'<=ch&&ch<='z') {
				 abcIndex = (int) ch - 'a';
				 result+=abcCode[abcIndex];
			}else if ('0'<=ch&& ch<='9') {
				numIndex = (int) ch - '0';
				 result+=numCode[numIndex];
			}
			
			//System.out.println("abcIndex: "+ abcIndex+" numIndex: "+ numIndex);
			
			
//0은 48  a는 97부터
	
		}
		System.out.println("src:" + src);
		System.out.println("result:" + result);
	}

}
