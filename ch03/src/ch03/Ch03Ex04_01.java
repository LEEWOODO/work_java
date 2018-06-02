package ch03;

public class Ch03Ex04_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 프로그램 실행 중에 1번 위치의 a값이 궁금할 경우
		// 방법1: print 메소드를 이용해 출력해본다.
		// 방법2: 디버깅 도구를 사용한다.
		int a=5;
		a+=10;
		//System.out.println(a);   // 방법 1: 파괴식 검사
		a=a-1;		// 1번위치
		// 방법2 14번 줄의 숫자를 더블클릭한다. 알고싶어하는 위치에 점을 찍어준다. (break point: 중단 점) 
		// 디버그 모드로 시작하기 누르면 F6으로 라인을 넘어가며 검사한다.  F5는 메소드 수행 시점에서 메소드로 들어갈때 사용한다.
		// F5 : 메소드 내부 진입
		// F6 : 현재 가리키고 있는 줄 실행
		// F8 : 다음 break point로 이동
		
		debugtest(a);
		System.out.printf("%d%n", a);
	}
	
	private static void debugtest(int b) {
		System.out.println(b+ 10);
	}
}
