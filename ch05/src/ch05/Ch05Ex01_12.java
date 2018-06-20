package ch05;

import java.util.Arrays;
import java.util.Scanner;

public class Ch05Ex01_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. 배열 생성(첫항과 두번째 항만 저장하는 배열을 우선 생성한다.)
		int[] stream = new int[2];
		
		
		// 2. 첫번째항은 100으로 두번째 항은 입력받은 수로 초기화
		Scanner scanner=new Scanner(System.in);
		stream[0]=100;
		stream[1]=Integer.parseInt(scanner.nextLine());
		
		
		for(int i=2;i<=stream.length;i++) {
			// 배열이 꽉 찾을 경우
			if(i==stream.length) {
				int[] tmp=new int[stream.length*2];	// 원래 배열의 2배 크기로 만든다.
			
				// System.arraycopy();
				System.arraycopy(stream, 0, tmp, 0, stream.length);
				//					(1) (2)	(3)	(4)	(5)
				// (1)stream 배열을 (2)0번째부터 (3)tmp 배열의 (4)0 번째 요소에
				// (5)stream 배열의 0부터 크기 까지 넣어라.
				stream=tmp;	// 바뀐 tmp 배열을 stream 배열에 넣는다. 이렇게 하면 배열의
							// 크기를 바꿀 수 있다.
				
				
			}
			int result=stream[i-2] - stream[i-1];
			stream[i]=result;
			System.out.println(Arrays.toString(stream));
			
			if(result<0) {
				break;
			}
			
			
		}
		
		
		// 출력
		
		for(int i=0;i<stream.length;i++) {
			if(stream[i]!=0) {
				System.out.printf("%d ",stream[i]);
			}
		}
	}

}
