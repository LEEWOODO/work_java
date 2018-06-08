package ch04;

import java.util.Scanner;

public class Ch04Ex02_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		int num=0;
		int oddCount=0;
		int evenCount=0;
		while (true) {
			System.out.print("정수를 입력하여 주세요:(0: 홀,짝 출력)");
			num=scanner.nextInt();
			if(num==0) {
				break;
			}
			if(num%2==0) {
				evenCount++;
			}else {
				oddCount++;
			}
			
		}
		System.out.println("odd: "+oddCount);
		System.out.println("even: "+evenCount);
	}

}
