package ch04;

public class Exercise4_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int change=1;//  1 -1  1 -1   // 부호변수
		int count=0;
		int i=0;
		while (sum<100) {
			// sum이 100 이상이면 while문 탈출
			count++;
			i++;
			if(i%2!=0) {// 홀수 일때 --부호는 +  >>  change=1;
				change=1;
			}else {		// 짝수 일때 --부호는 -  >>  change=-1;
				change=-1;
			}
			sum+=i*change;
		
			
		}
		

		System.out.println("총합: "+sum);
		System.out.println(count+" 번째에 총합이 100이상이 된다.");
	
		// [방법2]
//		change=1;
//		int num=0;
//		int sum2=0;
//		for(int j=1;true;j++,change=-change) {
//			num=change*j;
//			sum2+=num;
//			if(sum2>=100) {
//				break;
//			}
//		}
//		System.out.println("총합 = "+sum);
//		System.out.println("답 = "+num);
	
		// [방법 3]
//		int sum2=0;
//		int s=1;
//		int num=0;
//		
//		for(int j=1;sum2<100;j++,s=-s) {
//			num=j*s;
//			sum2+=num;
//		}
//		System.out.println("총합 = "+sum2);
//		System.out.println("답 = "+num);
		
	}

}
