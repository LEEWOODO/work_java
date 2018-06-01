package ch03;

public class Exercise3_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fahrenheit=100;
		float celcius=Math.round(((fahrenheit-32)*5/(float)9)*100)/(float)100;
		
		System.out.println("fahrenheit :"+fahrenheit);

		System.out.println("celcius :"+celcius);
	}

}
