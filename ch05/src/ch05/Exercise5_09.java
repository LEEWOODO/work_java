package ch05;

public class Exercise5_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] star= {
				{'*','*',' ',' ',' '},
				{'*','*',' ',' ',' '},
				{'*','*','*','*','*'},
				{'*','*','*','*','*'}
		};
		
		char[][] result=new char[star[0].length][star.length];
		
		for(int i=0;i<star.length;i++) {
			for(int j=0;j<star[i].length;j++) {
				System.out.print(star[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i=0;i<star.length;i++) {
			for(int j=0;j<star[i].length;j++) {
				result[j][3-i]=star[i][j];
				// 강사님 코드
				// int x=j;
				// int y=star.length -1 -i;
				// result[x][y] = star[i][j];
			}
		}
		System.out.println("90도 시계방향으로 회전");
		
		for(int i=0;i<result.length;i++) {
			for(int j=0;j<result[i].length;j++) {
				System.out.print(result[i][j]);
			}
			System.out.println();
		}
	}

}
