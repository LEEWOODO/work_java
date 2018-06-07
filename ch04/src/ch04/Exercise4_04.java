package ch04;

public class Exercise4_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int change=1;//  1 -1  1 -1
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
			System.out.println(sum);
			
		}
		
		System.out.println(count+" 번째에 총합이 100이상이 된다.");
	}

}
