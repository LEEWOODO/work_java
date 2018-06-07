package ch04;

public class Exercise4_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int Total=0;
		for(int i=1;i<=10;i++) { // 10회반복
			int lineTotal=0;
			for(int j=1;j<=i;j++) {
				lineTotal+=j;
				Total+=j;
			}
			System.out.println("lineTotal : "+lineTotal);
		}
		System.out.println("1+...(1+2+3+...+10)까지의 합: "+Total);
	}

}
