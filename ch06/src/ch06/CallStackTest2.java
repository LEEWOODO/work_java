package ch06;

public class CallStackTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main(String[] args)이 시작되었음.");
		firstMethod();
		System.out.println("main(String[] args)이 끝났음.");

	}

	private static void firstMethod() {
		// TODO Auto-generated method stub
		System.out.println("firstMethod() 이 시작되었음.");
		secondMethod();
		System.out.println("firstMethod() 이 끝났음.");
	}

	private static void secondMethod() {
		// TODO Auto-generated method stub
		System.out.println("secondMethod() 이 시작되었음.");
	
		System.out.println("secondMethod() 이 끝났음.");
	}

}
