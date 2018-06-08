package ch04;

import java.util.Scanner;

public class Ch04Ex01_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("성별과 나이를 입력해주세요(MorF 18)> ");
		Scanner scanner=new Scanner(System.in);
		String str[]=scanner.nextLine().split(" ");
	
		String adultAndKid="";
		String sex=str[0];
		
		if(sex.equals("M")||sex.equals("m")) {
			if(Integer.parseInt(str[1])>=18) {
				adultAndKid="MAN";
			}else {
				adultAndKid="BOY";
			}
		}else if(sex.equals("F")||sex.equals("f")){
			if(Integer.parseInt(str[1])>=18) {
				adultAndKid="WOMAN";
			}else {
				adultAndKid="GIRL";
			}
		}else {
			System.out.println("입력오류 !!");
		}
		System.out.println("성별 나이 결과 : "+adultAndKid);
	}

}
