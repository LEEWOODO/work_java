package ch04;

public class FlowEx13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int sum=0;
		 
		 for(int i=1;i<=10;i++) {
			 sum+=i;
			 System.out.printf("1부터 %2d까지의 합: %2d%n",i,sum);
		 }
		 
		 for(int j=6;j<3;j++) { // 초기화 한 값이 조건을 만족하지 않으면 for문 실행하지 않는다.
			 System.out.println("실행될까");
		 }
	}

}
            