package ch05;

import java.util.Scanner;

public class Ch05Ex02_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr1 = new int[2][3];
		int[][] arr2 = new int[2][3];
		int[][] result=new int[2][3];
		Scanner scanner = new Scanner(System.in);
		// 첫번째 입력
		System.out.println("first array");

	
		for(int i=0;i<arr1.length;i++) {
			String[] num = scanner.nextLine().split(" ");
			for(int j=0;j<arr1[0].length;j++) {
				arr1[i][j]=Integer.parseInt(num[j]);
			}
			
		}
		
		// 두번째 입력
				System.out.println("Second array");

			
				for(int i=0;i<arr2.length;i++) {
					String[] num = scanner.nextLine().split(" ");
					for(int j=0;j<arr2[0].length;j++) {
						arr2[i][j]=Integer.parseInt(num[j]);
					}
					
				}
		
				
		// 출력
			for(int i=0;i<result.length;i++) {
				for(int j=0;j<result[i].length;j++) {
					result[i][j]=arr1[i][j]*arr2[i][j];
					System.out.printf("%d ",result[i][j]);
				}
				System.out.println();
			}	
				
				
				
	/*	for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++) {
				System.out.print(arr1[i][j]+" ");
				
				
			}
			System.out.println();
		}
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr2[i].length;j++) {
				System.out.print(arr2[i][j]+" ");
				
				
			}
			System.out.println();
		}
		*/
	
	}

}
