package ch05;

public class ArrayEx10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numArr=new int[10];
	
		
		for(int i=0;i<numArr.length;i++) {
			System.out.print(numArr[i]=(int)(Math.random()*10));
		}
		System.out.println();
		
		for(int i=0;i<numArr.length-1;i++) {	// 0~8번까지 총 9번 회전
			boolean changed=false;
			for(int j=0;j<numArr.length-1-i;j++) {
					if(numArr[j]>numArr[j+1]) {
						int temp=numArr[j];
						numArr[j]=numArr[j+1];
						numArr[j+1]=temp;
						changed=true;
					}
			}
			if(!changed) break; 	// 자리바꿈이 없으면 반복문을 벗어난다.
			
			for(int k=0;k<numArr.length;k++) {
				System.out.print(numArr[k]);
			}
			System.out.println();
		}
	
	}

}