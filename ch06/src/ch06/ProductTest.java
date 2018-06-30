package ch06;
class Product{
	static int count=0;
	int serialNo;
	{					// product인스턴스가 생성될 때마다 count의 값을 1씩 증가시켜서
		++count;		// serialNo에 저장한다.
		serialNo=count;
	}
	public Product() {
		
	}
}

public class ProductTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1=new Product();
		Product p2=new Product();
		Product p3=new Product();
		
		System.out.println("p1의 제품번호 (p1.serialNo)는 "+p1.serialNo);
		System.out.println("p2의 제품번호 (p2.serialNo)는 "+p2.serialNo);
		System.out.println("p3의 제품번호 (p3.serialNo)는 "+p3.serialNo);
		System.out.println("생산된 제품의 수는 모두 "+Product.count+" 개 입니다.");
	}

}
