package ch09;

class Person{
	String name="";
	int age;
	String sex="";
	long id;
	public boolean equals(Object obj) {
		if(obj!=null && obj instanceof Person) {
			System.out.println("id: "+id);
			System.out.println("((Person)obj).id: "+((Person)obj).id);
			return id==((Person)obj).id;
		}
		else {
			return false;
		}
		
	}
	public Person(long id) {
		this.id=id;
	}
}

public class EqualsEx2 {
	public static void main(String[] args) {
		Person person1=new Person(8011_0811_1122_234L);
		Person person2=new Person(8011_0811_1122_235L);
		if(person1==person2) {
			System.out.println("p1과 p2는 같은 사람입니다.");
		}else {
			System.out.println("p1과 p2는 다른 사람입니다.");
		}
		
		if(person1.equals(person2)) {
			System.out.println("p1과 p2는 같은 사람입니다.");
		}else {
			System.out.println("p1과 p2는 다른 사람입니다.");
		}
		
	}
}
