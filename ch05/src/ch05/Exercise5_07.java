package ch05;

public class Exercise5_07 {
	/*
	 * 커맨드 라인으로 실행하는법
	 * 1. cmd 들어가기
	 * 2. cd C:\git\work_java\ch05\src\ch05 입력(패키지안에 java파일 일경우)
	 * 3. javac Exercise5_07.java
	 * 4. cd ../ 하나의 하위 폴더로 이동
	 * 5. javac ch05/Exercise5_7.java
	 * 6. java ch05/Exercise5_7 3170
	 * */
	public static void main(String[] args) {
		// 직접 args에 값을 담는 방법
		// TODO Auto-generated method stub
		// args 배열에 아무값도 없을 때 출력
		if(args.length!=1) {
			System.out.println("USAGE: java Exercise5_07 3120");
			System.exit(0);	// main에서 return과 비슷
			/*
			 * JVM에게 이 프로그램이 어떤 종료가 되었는지 알려준다.
			 * System.exit(number): 
			 * 0 : 정상종료.
			 * -1 : 비정상 종료
			 * ...etc
			 */
		}
		
		int money=Integer.parseInt(args[0]);
		System.out.println("money = "+money);
		int[] coinUnit= {500,100,50,10};
		int[] coin={5,5,5,5};
		
		for(int i=0;i<coinUnit.length;i++) {
			int coinNum=0;
			// 1. 금액을 동전단위로 나눠서 필요한 동전의 개수를 구한다.
			coinNum=money/coinUnit[i];	
			
			// 2. 배열 coin에서 coinNum만큼의 동전을 뺀다
			// (만일 충분한 동전이 없다면 배열 coin에 있는 만큼만 뺀다.)
			if(coin[i]>=coinNum) {
				coin[i]=coin[i]-coinNum;
			}else {
				coinNum=coin[i];
				coin[i]=0;
			}
			
			money=money-(coinNum*coinUnit[i]);
			
			
			System.out.println(coinUnit[i]+" WON: "+coinNum);
		}
		if(money>0) {
			System.out.println("No hava coin.");
			System.exit(0);
		}
		
		System.out.println("=remain coin=");
		for(int i=0;i<coinUnit.length;i++) {
			System.out.println(coinUnit[i]+" WON: "+coin[i]);
		}
	}

}
