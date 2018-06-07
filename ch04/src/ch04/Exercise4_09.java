package ch04;

public class Exercise4_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="12345";
		int sum=0;

		for(int i=0;i<str.length();i++) {
			
			sum+=(int)str.charAt(i)-48;
			
			
		}
		
		System.out.println("   sum = "+sum);
	}

}
