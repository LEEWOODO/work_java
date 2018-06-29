package ch06;

class Car3{
	String color;
	String gearType;
	int door;
	Car3(){
		this("white","auto",4);
	}
	// 깊은 복사(Deep Copy)
	Car3(Car3 c){	// Car3 c의 주소를 이용
		this.color=c.color;	// c 주소의 color
		this.gearType=c.gearType;
		this.door=c.door;
	}
	Car3(String color, String gearType, int door){
		this.color=color;
		this.gearType=gearType;
		this.door=door;
	}
}
/*
 *  얕은 복사(Shadow Copy) vs 깊은 복사(Deep Copy)
 * - 주소값 복사				- 값 자체를 복사
 * - Car c2=c1;				- Car c2=new Car(c1);
 * 
 */
public class CarTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car3 c1=new Car3();
		Car3 c2=new Car3(c1);	// c1 객체의 주소를 넘겨주는 것이다.
		System.out.println(" c1의  color= "+c1.color+" c1의  gearType= "+c1.gearType+" c1의  door= "+c1.door);
		System.out.println(" c2의  color= "+c2.color+" c2의  gearType= "+c2.gearType+" c2의  door= "+c2.door);
		
		c1.door=100;
		System.out.println(" c1.door=100; 으로 수행 후");
		System.out.println(" c1의  color= "+c1.color+" c1의  gearType= "+c1.gearType+" c1의  door= "+c1.door);
		System.out.println(" c2의  color= "+c2.color+" c2의  gearType= "+c2.gearType+" c2의  door= "+c2.door);
		System.out.println();
		
		
		Car3 c3=c2;	// 얕은 복사 주소값을 복사
		System.out.println(" c2의  color= "+c2.color+" c2의  gearType= "+c2.gearType+" c2의  door= "+c2.door);
		System.out.println(" c3의  color= "+c3.color+" c3의  gearType= "+c3.gearType+" c3의  door= "+c3.door);
		c3.door=200;
		System.out.println(" c3.door=200; 으로 수행 후");
		// 얕은 복사 이므로 주소값을 이용하여 바꿧기 때문에 의도치 않게 c3의 door를 변경하였지만
		// c2의 door도 변경되었다.
		System.out.println(" c2의  color= "+c2.color+" c2의  gearType= "+c2.gearType+" c2의  door= "+c2.door);
		System.out.println(" c3의  color= "+c3.color+" c3의  gearType= "+c3.gearType+" c3의  door= "+c3.door);
	}

}
