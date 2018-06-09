package ch04;

public class Exercise4_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String value="12o34";
		char ch=' ';
		boolean isNumber=true;
		
		// 반복분과 charAt(int i)를 이용해서 문자열의 문자를 하나씩 읽어서 검사한다.
		

		// a는 97 z는 122 공백은 32  1은 49 9는 57
		for(int i=0;i<value.length();i++) {
			ch=value.charAt(i);
//			if(ch>='1'&& ch<='9') {
//				isNumber=true;
//			}else {
//				isNumber=false;
//				break;
//			}
			
			// 끄집어 낸 문자가 '0'과 '9' 사이에 포함이 안되는 경우
			if(!('0'<=ch&&ch<='9')) {
				// 숫자가 아님을 표시하기 위한 변수 isNumber를 false로 설정
				isNumber=false;
				// 더 이상 반목문을 실행할 필요가 없으므로 빠져나온다.
				break;
			}
		}
		if(isNumber) {
			System.out.println(value+"는 숫자입니다");
		}else {
			System.out.println(value+"는 숫자가 아닙니다");
		}
		
	}

}
