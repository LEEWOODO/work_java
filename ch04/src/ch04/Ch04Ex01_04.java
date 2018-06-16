package ch04;

import java.util.Scanner;

public class Ch04Ex01_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("복싱 몸무게를 입력해주세요: ");
		Scanner scanner=new Scanner(System.in);
		double weight=scanner.nextDouble();
		String weightName="";
/*		if(weight<=88.45) {
			weightName="Cruiserweight";
			if(weight<=72.57) {
				weightName="Middleweight";
				if(weight<=61.23) {
					weightName="Lightweight";
					if(weight<=50.80) {
						weightName="Flyweight";
					}
				}
			}
		}else {
			weightName="Heavyweight";
		}*/
		if(weight<=50.80) {
			weightName="Flyweight";
		}
		else if(weight<=61.23) {
			weightName="Lightweight";
		}
		else if(weight<=72.57) {
			weightName="Lightweight";
		}
		else if (weight<=88.45) {
			weightName="Cruiserweight";
		}
		else {
			weightName="Heavyweight";
		}
		
		System.out.println("weightName : "+weightName);
	}

}
