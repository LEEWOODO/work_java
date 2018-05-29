package ch03;

public class OperatorEx13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c1='a';
		//char c2=c1+1;	// 컴파일 에러 발생/
		char c2='a'+1;
		System.out.println(c2); // 'b' 출력
		/*
		 * c1+1에서 오류가 발생하는 이유
		 * 
		 * 'a'+1은 컴파일러가 자동으로 먼저 계산해서 +-------
		 * 'b'로 코드를 변경해서 실행하지만
		 * c1+1 에서 변수 c1은 컴파일러단계에서 c1에 어떤 값이 돌어올지
		 * 모르기 때문에 실행 단계에서 계산을 하게 되는데
		 * 실행 단계의 결과는 int형이기 떄문에 char형 변수에 저장할 수 있다.
		 */
	}
	

}
