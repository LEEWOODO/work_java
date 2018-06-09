package ch04;

public class Exercise4_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=12321;
		int tmp=number;
		
		int result=0;
		String str="";
		while (tmp!=0) {
			
			// result에 10을 곱하여 일의 자리 수를 저장할 공간을 확보한 후
			// tmp에 남아있는 일의 자리수를 끄집어내어 result에 저장
			// 반복하다 보면 거꾸로 저장된다.
			result = result*10 + tmp % 10; 
			
			
			// tmp=12321  1232   123   12   1
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
