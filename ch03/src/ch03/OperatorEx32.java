package ch03;

public class OperatorEx32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y,z;
		int absX=0, absY = 0, absZ = 0;
		char signX, signY, signZ;
		
		x=10;
		y=-5;
		z=0;
		
		absX = x>=0? x:-x;
		absY = y>=0? y:-y;
		absZ = z>=0? z:-z;
		// 조건연산자 (3항 연산자)
		// (조건) ? (조건이 참일 경우 실행) : (조건이 거짓일 경우 실행)
		signX= x>0? '+':(x==0? ' ' : '-');	// x값이 양수면 '+' , x값이 0 이면 공백, x값이 음수면 '-'
		signY= y>0? '+':(y==0? ' ' : '-');
		signZ= z>0? '+':(z==0? ' ' : '-');
	
		System.out.printf("x = %c%d%n",signX,absX);
		System.out.printf("y = %c%d%n",signY,absY);
		System.out.printf("z = %c%d%n",signZ,absZ);
	}

}
