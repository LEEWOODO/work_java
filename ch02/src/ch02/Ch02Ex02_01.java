package ch02;

import java.util.Scanner;

public class Ch02Ex02_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kor,mat,eng=0;
		int sum=0;
		int avg=1;
		
		Scanner scanner =new Scanner(System.in);
		System.out.print("국어점수를 입력하시오.>");
		kor=Integer.parseInt(scanner.nextLine());
		System.out.print("수학점수를 입력하시오.>");
		mat=Integer.parseInt(scanner.nextLine());
		System.out.print("영어점수를 입력하시오.>");
		eng=Integer.parseInt(scanner.nextLine());
		
		sum=calculate(kor,mat,eng);
		
		
		System.out.println("kor: "+kor);
		System.out.println("mat: "+mat);
		System.out.println("eng: "+eng);
		System.out.println("sum: "+sum);
		System.out.println("avg: "+sum/3);
		
	}

	private static int calculate(int kor, int mat, int eng) {
		// TODO Auto-generated method stub
		int sum=0;
		sum=kor+mat+eng;
		return sum;
	}

}
