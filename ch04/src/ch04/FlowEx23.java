package ch04;

public class FlowEx23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=5;
		
		/*
		 * 1. 1 조건이 true이면 2 실행
		 * 2. 문장 실행 끝나면 1조건으로 이동
		 */
		while (i--!=0) {  // 1번 조건
			System.out.println(i+ " - I can do it. ");		// 2번
			
		}
	}

}
