package ch03;

public class OperatorEx08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1_000_000;	// 백만원
		int b=2_000_000;	// 2백만원
			
		long c=a*b;			// 2000000000000  int범위 -200억~ 200억 인데 여기의 범위를 넘어 오버플로우된 값이 c에 저장된다
		System.out.println(c);
		
		long cc=(long)a*b;			// long으로 명시적 형변환 시키면 정상적으로  출력 가능
		System.out.println(cc);
	}

}
