package ch05;


import java.util.Arrays;
import java.util.Random;

public class ArrayEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] iArr1=new int[10];
		int[] iArr2=new int[10];
		int[] iArr3= {100,95,80,70,60};
		char[] chArr= {'a','b','c','d'};
		for(int i=0;i<iArr1.length;i++) {
			iArr1[i]=i+1;	//1~10의 숫자를 순서대로 배열에 넣는다.
		}
		for(int i=0;i<iArr2.length;i++) {
			iArr2[i]=(int)(Math.random()*10+1);
		}
		for(int i=0;i<iArr1.length;i++) {
			System.out.print(iArr1[i]+",");
		}
		System.out.println();
		// 직접 API 연결하는 방법
		// Ctrl키 누르고 메소드위에 마우스 올려놓고 Open Declaration클릭하고 오픈 소스 클릭
		// 그런뒤 External 외부 파일을 C폴더에서 jdk1.8의 src.zip 을 불러온다. 그럼 직접 API에 구현된 코드를 볼 수 있다.
		System.out.println(Arrays.toString(iArr1));	// 배열내용 출력 하기 쉬운 방법!!! 중요
		System.out.println(Arrays.toString(iArr2));	// Util 패키지의 Arrays 클래스의 오버라이딩된 toString()사용.
		System.out.println(Arrays.toString(iArr3)); 
		System.out.println(iArr3);		// 배열의 첫번째 주소를 출력한다.
		System.out.println(chArr);		// int배열과 char 배열의  println 출력 구조가 API에서 다르다. 
/*		연습...
 * 		String str="abcd";
		String str2="";
		for(char c:chArr) {
			str2+=c;
		}
		System.out.println("str2: "+str2);
		if(str.equals(str2)) {
			System.out.println("같은 글씨다");
		}else {
			System.out.println("다르다");
		}*/
		System.out.println(Arrays.toString(chArr));
		
	
	}

}
