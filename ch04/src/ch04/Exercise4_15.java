package ch04;

public class Exercise4_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=12321;
		int tmp=number;
		
		int result=0;
		String str="";
		while (tmp!=0) {
			
			//result=tmp%10; // 5 4 3 2 1
			//str+=result+"";
			
			result = result*10 + tmp % 10; 
			
			tmp/=10;
			
		}
	//	result=Integer.parseInt(str);
		
		if(number==result) {
			System.out.println(number+ "는 회문수 입니다.");
		}else {
			System.out.println(number+ "는 회문수가 아닙니다.");
		}
	}

}
