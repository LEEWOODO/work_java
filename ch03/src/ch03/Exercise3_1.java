package ch03;

public class Exercise3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=2;
		int y=5;
		char c='A'; // 'A'의 문자 코드는 65
		
		System.out.println(1+x<<33);  // 1+x = 11(2) 2진수=3  33칸 이동하면  000..00110(2)= 6;
		System.out.println(y>=5 || x<0 && x>2);
		System.out.println(y+=10-x++);
		System.out.println(x+=2);
		System.out.println(!('A'<=c && c<='z'));
		System.out.println('C'-c);
		System.out.println('5'-'0');
		System.out.println(c+1); // c+1 = char + int ==int 형 출력되므로 66 출력
		System.out.println(++c); // B 출력
		System.out.println(c++);
		System.out.println(c);
		
	}

}
