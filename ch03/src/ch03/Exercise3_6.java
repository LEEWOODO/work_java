package ch03;

public class Exercise3_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * num의 십의자리 수를 뽑아 1을 더한 후 10을 곱하면
		 * 변수 num의 값보다 크면서도 가장 가까운 10의 배수를 구할 수 있다.
		 * 24/10 = 2
		 * 2+1 =3
		 * 3*10 = 30
		 * 30-24=6;
		 */
		int num=23;
		System.out.println((Math.round((num/10.0)+0.5)*10) -num );
		System.out.println(10-num%10); // 좋은 코드지만 보고 바로 이해를 할 수 없다.
	}

}
