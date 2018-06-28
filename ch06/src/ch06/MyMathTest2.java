package ch06;
class MyMath2{
	long a,b;
	
	long add() {return a+b;}
	long substract() {return a-b;}
	long multiply() {return a*b;}
	double divide() {return a/b;}
	
	static long add(long a,long b) {return a+b;}
	static long substract(long a,long b) {return a-b;}
	static long multiply(long a,long b) {return a*b;}
	static double divide(double a,double b) {return a/b;}
}
public class MyMathTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyMathTest2 mathTest2=new MyMathTest2();	// add함수를 static 없이 선언할 경우 객체를 생성한뒤에 메소드를 이용가능
		System.out.println(mathTest2.add(10, 20));
		System.out.println("----------------------------");
		
		System.out.println(MyMath2.add(200L, 100L));
		System.out.println(MyMath2.substract(200L, 100L));
		System.out.println(MyMath2.multiply(200L, 100L));
		System.out.println(MyMath2.divide(200.0, 100.0));
		
		MyMath2 mm=new MyMath2();
		mm.a=300L;
		mm.b=400L;
		System.out.println(mm.add());
		System.out.println(mm.substract());
		System.out.println(mm.multiply());
		System.out.println(mm.divide());
	}
	int add(int a, int b) {
		return a+b;
	}
}
