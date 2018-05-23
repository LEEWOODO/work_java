package ch02;

public class VarEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year=2018;
		int age=26;
		String name="LEEWOODO";
		
		System.out.println("HELLO "+name+"\n"+"Year: "+year+"\n"+"AGE: "+age+"\n");
	
		
		year=age+2000;
		age=age+1;
		
		System.out.println("HELLO "+name+"\n"+"Year: "+year+"\n"+"AGE: "+age);
		
		// temp이용해서 치환하기
		System.out.println("두 수 A, B 교환하기");
		int a=10;
		int b=20;
		int temp=0;
		System.out.println("A: "+a+" B:"+b);
		temp=a;
		a=b;
		b=temp;
		
		System.out.println("A: "+a+" B:"+b);
		
		
	}

}
