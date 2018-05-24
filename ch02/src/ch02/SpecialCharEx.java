package ch02;

public class SpecialCharEx {
	/*
	 *  특수 문자(Escape sequence)
	 *  tab: \t
	 *  backspace: \b
	 *  form feed: \f
	 *  new line: \n
	 *  carriage return: \r
	 *  역슬래쉬(\): \\
	 *  작은따옴표: \'
	 *  큰 따옴표: \"
	 *  유니코드(16진수)문자: \\u유니코드 (예: char a='\u0041');
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println('\'');  			// ' 출력     '''처럼 할 수 없다.
		System.out.println("abc\t123\b456");// \t : tap  ,  \b 백스페이스
		System.out.println('\n');			// 개행(new line)문자 출력하고 개행
		System.out.println("\"Hello\"");	//    \"  : 큰따옴표 출력-----> "
		System.out.println("c:\\");			// \\ : 역슬레시 출력 ---->   \
	}

}
