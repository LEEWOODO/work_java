package ch05;

public class ArrayEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		/*
		 * 배열의 크기를 늘릴 수 없으니까
		 * 기존의 배열을 유지한채 다른 temp배열의 크기를 늘려서
		 * temp에 기존의 배열을 넣는다.
		 * 
		 * */
		
		int[] arr=new int[5];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=i+1;
		}
		System.out.println("[변경전]");
		System.out.println("arr.length: "+arr.length);
		for(int i=0;i<arr.length;i++) {
			System.out.println("arr["+i+"]: "+arr[i]);
		}
		
		// 배열 arr에 저장된 값들을 배열 temp에 복사한다.
		int[] temp=new int[arr.length*2];
		for(int i=0;i<arr.length;i++) {
			temp[i]=arr[i];
		}
		
		// temp에 저장된 값을 arr에 저장한다.
		arr=temp;
		
		System.out.println("[변경후]");
		System.out.println("arr.length: "+arr.length);
		for(int i=0;i<arr.length;i++) {
			System.out.println("arr["+i+"]: "+arr[i]);
		}
		
	}

}
