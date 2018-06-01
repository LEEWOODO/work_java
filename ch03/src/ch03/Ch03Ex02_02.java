package ch03;

import java.util.Scanner;

public class Ch03Ex02_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.print("직사각형의 가로를 입력하여주세요.> ");
		int width=Integer.parseInt(scanner.nextLine());
		System.out.print("직사각형의 세로를 입력하여주세요.>> ");
		int length=Integer.parseInt(scanner.nextLine());
		
		width+=5;
		length*=2;
		
		System.out.printf("width = %d%nlength = %d%narea = %d%n ",width,length,width*length);
		
	}

}
