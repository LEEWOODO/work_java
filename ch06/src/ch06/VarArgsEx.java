package ch06;
/*
 * 가변인자와 오버로딩
 * String...
 * int...
 */
public class VarArgsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strArr= {"100","200","300"};
		
		System.out.println(concatenate("","100","200","300"));
		System.out.println(concatenate("-",strArr));
		System.out.println(concatenate(",",new String[]{"1","2","3"}));
		System.out.println("["+concatenate(",", new String[0])+"]");
		System.out.println("["+concatenate(",")+"]");
		
		System.out.printf("%2d %s", 99,"hello");	// printf가 가변인자의 좋은 예이다.
	}
	// String... <<<가변인자를 뜻한다.
	// 파라미터의 갯수가 늘어날수도 줄어들 수도 있을 때 사용한다. 0개부터~ 한계치 까지 받는다.
	// delim: 구분자를 뜻한다.
	// args에 배열 형태로 저장된다.
	static String concatenate(String delim, String... args) {

		String result="";
		for(String str: args) {
			result+=str+delim;
		}
		return result;
	}
	static String concatenate(String delim,String str,int... str2) {
		return null;
	}
}
