package ch03;

public class OperatorEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=-10;
		i=+i;	// 부호 그대로 두기(곱하기 +1한 것과 동일) 거의 사용하지 않는다. 부호바꾸는 - 가 있기떄문에 형식상 존재한다.
		System.out.println(i);
		
		i=-10;
		i=-i;	// 부호 바꾸기(곱하기 -1한 것과 동일)
		System.out.println(i);
	}

}
