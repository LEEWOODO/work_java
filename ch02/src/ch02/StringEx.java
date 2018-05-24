package ch02;

import java.util.ArrayList;

public class StringEx {
	/*
	 * 문자열 + any type > 문자열+문자열 > 문자열
	 *  any type+문자열   > 문자열+문자열 > 문자열
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="JA"+"VA";	// 문자열 + 문자열 = 문자열
		String str=name+8.0;	// 문자열 + double = 문자열
		int age=26;
		double age2=26.5;
		
		System.out.println(name);	// 문자열 "JAVA" 출력	
		System.out.println(str);	// "JAVA" + "8.0" (double형이 문자열로 형변환)
		System.out.println(7+" ");	// int형 7이 문자열로 형변환
		System.out.println(" "+7);	// int형 7이 문자열로 형변환
		System.out.println(7+"");	// int형 7이 문자열로 형변환
		System.out.println(""+7);	// int형 7이 문자열로 형변환
		System.out.println(""+"");	// "" 문자열
		System.out.println(7+7+"");	// 7 + 7 한 결과에 문자열을 더해서 문자열 "14"
		System.out.println(""+7+7);	// "" + 7 한 결과(문자열 7)에 7을 더해서 문자열 "77"
		
		System.out.printf("age: %d\n", age);
		System.out.printf("age: %f\n", age2);
		System.out.printf("age: 14\n");
		
		String name2="L E e woo do";
		String[] strings;
		strings=name2.split("o");
		for(String s:strings) {
			System.out.print(s);
		}
		System.out.println();
		for(int i=0;i<strings.length;i++) {
			System.out.print(strings[i]);
		}
		
		
	}

}
