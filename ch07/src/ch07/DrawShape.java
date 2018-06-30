package ch07;

public class DrawShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point[] p = {
				new Point(100,100),
				new Point(140,50),
				new Point(200,100)
		};
		Triangle t=new Triangle(p);
		Circle c=new Circle(new Point(150,150),50);
		
		t.draw();	// 부모클래스(Shapq. draw)의 draw메소드를 우선 확인하고 자식 클래스에서 draw를 사용하면 자식 클래스의 draw메소드를 실행한다.
		c.draw();	// 만약 자식클래스의 draw메소드가 없다면 부모 클래스의 draw()를 실행한다.---> 동적 라이딩 이라고 한다. == 오버라이딩
	}

}

class Shape {
	String color = "black";

	void draw() {
		System.out.printf("[color=%s]%n", color);
	}
}

class Point {
	int x;
	int y;

	Point() {
		// TODO Auto-generated constructor stub
		this(0, 0);
	}

	Point(int x, int y) {
		// TODO Auto-generated constructor stub
		this.x = x;
		this.y = y;
	}
	String getXY() {
		return "("+x+","+y+")";
	}

}

class Circle extends Shape{
	Point center;
	int r;
	Circle() {
		// TODO Auto-generated constructor stub
		this(new Point(0,0),100);
	}
	Circle(Point center, int r){
		this.center= center;
		this.r=r;
		
	}
	void draw() {
		System.out.printf("[center=(%d,%d), r=%d, color=%s]%n",center.x, center.y, r, color);
	
	}
}

class Triangle extends Shape{
	Point[] p =new Point[3];
	Triangle(Point[] p) {
		// TODO Auto-generated constructor stub
		this.p=p;
	}
	void draw() {
		System.out.printf("[p1=%s, p2=%s, p3=%s, color=%s]%n",
				p[0].getXY(),p[1].getXY(),p[2].getXY(),color);
	}
}