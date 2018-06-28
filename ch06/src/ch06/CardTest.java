package ch06;

public class CardTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Card.width= "+Card.width);	// 클래스변수 (static변수)는 객체 생성없이 '클래스이름.클래스변수' 로 직접 사용 가능하다.
		System.out.println("Card.height= "+Card.height);
		
		Card c1=new Card();
		c1.kind="Heart";
		c1.number=7;
		
		Card c2=new Card();
		c2.kind="Spade";	// 인스턴스변수의 값을 변경한다.
		c2.number=4;
		
		System.out.println("c1은 "+c1.kind + ", "+c1.number+" 이며, 크기는 ("+ Card.width+", "+Card.height+ ")");
		System.out.println("c2은 "+c2.kind + ", "+c2.number+" 이며, 크기는 ("+ Card.width+", "+Card.height+ ")");
	
		System.out.println("c1의 width와 height를 각각 50, 80으로 변경합니다.");
		Card.width=50;	// 클래스변수의 값을 변경한다
		c1.height=80;	// c1에 width, height를 변경하였지만 static으로 정의된 변수이므로 c2의 width,height도 50, 80이 된다.
		
		System.out.println("c1은 "+c1.kind + ", "+c1.number+" 이며, 크기는 ("+ c1.width+", "+c1.height+ ")");
		System.out.println("c2은 "+c2.kind + ", "+c2.number+" 이며, 크기는 ("+ c2.width+", "+c2.height+ ")");
	}

}
class Card{
	String kind;		// 카드의 무늬 - 인스턴스 변수
	int number;			// 카드의 숫자 - 인스턴스 변수
	static int width=100;// 카드의 폭	- 클래스 변수			// 같은 값을 공유해서 쓸때 static 키워드를 사용한다.
	static int height=250;// 카드의 높이 - 클래스 변수
	
}
