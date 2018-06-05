package ch04;

public class FlowEx33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Loop1:for(int i=2;i<10;i++) {
			for(int j=1;j<10;j++) {
				if(j==5)
//					break Loop1;
//					break;
//					continue Loop1;
					continue;
				System.out.println(i+"*"+j+"="+i*j);
				
			} // end of for i
			System.out.println();
		}// end of Loop1
		System.out.println("END");
	} 
}
