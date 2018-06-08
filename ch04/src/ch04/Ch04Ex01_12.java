package ch04;

import java.util.Scanner;

public class Ch04Ex01_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("년도를 입렵하세요: (윤년찾기 2018) >");
		Scanner scanner=new Scanner(System.in);
		int year=scanner.nextInt();
		String result="";
		if(year%400==0 ||(year%4==0&&year%100!=0)) {
			result="leap year"; // 윤년
		}else {
			result="common year";
		}
		System.out.println(result);
		
	}

}
