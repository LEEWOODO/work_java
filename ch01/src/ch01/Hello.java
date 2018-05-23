package ch01;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello");
		System.out.println("안녕, 세계.");
		String myname="";
		int myage=0;
		
		
		math2 math2=new math2();
		myname=math2.name;
		myage=math2.age;
		
		
		
		System.out.println("나의 이름은: "+myname+"이고, 나의 나이는: "+myage);
		System.out.println("재미있는 GitHub 로딩 & 다운로딩 연습중 !");
		System.out.println("Home PC transfort");
		
	}

}
class math2{
	String name="LWD";
	int age=26;
	
}