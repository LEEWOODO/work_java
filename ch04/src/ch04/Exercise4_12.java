package ch04;

public class Exercise4_12 {
	/*
	 * 8,9단 못했음
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		int check=0;
		int i=2;
		while (count<3) {
			int j=1;
			
			check=0;
			loop1:for(;i<=9;i++) {
				if(check==3) {
					j++;
					break loop1;
				}
				System.out.printf("%d * %d = %d  ",i,j,i*j);
			
				check++;
			}
			System.out.println();
			check=0;
			if(i==10) {
				i=i+1;
				check=1;
			}
			loop2:for(i=i-3;i<=9;i++) {
				
				if(check==3) {
					j++;
					break loop2;
				}
				System.out.printf("%d * %d = %d  ",i,j,i*j);
			
				check++;
			}
			System.out.println();
			
			check=0;
			if(i==9) {
				i=i+1;
				check=1;
			}
			loop3:for(i=i-3;i<=9;i++) {
				
				if(check==3) {
					j++;
					break loop3;
				}
				System.out.printf("%d * %d = %d  ",i,j,i*j);
			
				check++;
			}
			System.out.println();
			
			
			count++;
		}
	}	

}
