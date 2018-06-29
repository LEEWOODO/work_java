package ch06;

class Car2{
	String color;	// 색상
	String gearType;// 변속기 종류 - auto(자동), manual(수동)
	int door;		// 문의 개수
	Car2(){
		
	}
	Car2(String c, String g, int d){
		color=c;
		gearType=g;
		door=d;
		
	}
}

class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car2 c1=new Car2();
		c1.color="white";
		c1.gearType="auto";
		c1.door=4;
		
		Car2 c2=new Car2("Red","manual",2);
		System.out.println(" c1의  color= "+c1.color+" c1의  gearType= "+c1.gearType+" c1의  door= "+c1.door);
		System.out.println(" c2의  color= "+c2.color+" c2의  gearType= "+c2.gearType+" c2의  door= "+c2.door);
	}

}
