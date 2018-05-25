package ch02;

import java.io.IOException;
import java.util.Scanner;

public class Ch02Ex02_08 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		double firstNum=0.0;
		double SecondNum=0.0;
		char c;
		Scanner scanner=new Scanner(System.in);

		System.out.print("첫번째 실수를 입력하여주세요.> ");
		firstNum=Double.parseDouble(scanner.nextLine());
		System.out.print("두번째 실수를 입력하여주세요.>> ");
		SecondNum=Double.parseDouble(scanner.nextLine());
		System.out.print("한개의 문자를 입력하여주세요.>>> ");
		/*
		 * 두 번째 방법으로 System 클래스에서 제공하는 read() 라는 함수를 이용하여 키보드 입력을 받아보자.
	  		read() 함수는 1byte 크기만 입력스트림에서 읽어와 ASCII 코드에 해당하는 int 값을 리턴한다.
			그래서 문자를 입력받을때 주로 사용한다.
			
			read()함수의 경우 Scanner의 next()함수와 유사하게 동작한다. 숫자 + Enter 입력 시, Enter(\r\n) 값은 입력스트림 버퍼에 그대로 남아 있게 된다.
			따라서, 아래와 같이 예외 처리를 해주어야 한다.
			Enter의 경우 두개의 문자 (\r\n) 이므로 read()함수를 두 번 호출 (  System.in.read();  )하여 문자들을 버퍼에서 제거 해준다.
			또는 System.in.skip(2);	

		 */
		c=(char)System.in.read();
		//System.in.read();
		//System.in.read();
		System.in.skip(2);
		
		System.out.printf("%.2f\n",firstNum);
		System.out.printf("%.2f\n",SecondNum);
		System.out.printf("%c",c);
	}

}
