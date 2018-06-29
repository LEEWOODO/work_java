package ch06;

class Car{
	String color;
	String gearType;
	int door;
	Car(){
		// this 해석: 이 객체의~~
		// 이 객체의 3개짜리 생성자를 호출
		this("white","auto",4);
	}
	Car(String color){
		this(color,"auto",4);
	}
	Car(String color, String gearType, int door) {
		// TODO Auto-generated constructor stub
		// 이 객체(Car)의 color 인스턴스 변수에 파라미터 color를 저장
		this.color=color;
		this.gearType=gearType;
		this.door=door;
	}
	
}

class CarTest2 {
	public static void main(String[] args) {
		Car c1=new Car();
		Car c2=new Car("blue");
		System.out.println(" c1의  color= "+c1.color+" c1의  gearType= "+c1.gearType+" c1의  door= "+c1.door);
		System.out.println(" c2의  color= "+c2.color+" c2의  gearType= "+c2.gearType+" c2의  door= "+c2.door);
	}
	
}
