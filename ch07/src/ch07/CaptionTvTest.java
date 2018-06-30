package ch07;
class Tv{	//	조상클래스= 부모클래스=상위클래스
	boolean power;
	int channel;
	
	void power() {power=!power;}
	void channelUp() {++channel;}
	void channelDown() {--channel;}
	
}
class CaptionTv extends Tv{	// 자손클래스=자식 클래스= 하위 클래스
	boolean caption;	// 캡션(자막 기능) 상태 on/ off
	void displayCaption(String text) {
		if(caption) {	// 캡션 상태가 on(true)일때만 text를 보여준다.
			System.out.println(text);
		}
	}
}

public class CaptionTvTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CaptionTv ctv=new CaptionTv();
		ctv.channel=10;	// 부모 클래스로부터 상속받은 멤버 	
		ctv.channelUp();// 자식 클래스로부터 상속받은 멤버
		System.out.println(ctv.channel);
		ctv.displayCaption("Hello, World!");
		ctv.caption=true;	// 캡션(자막) 기능을 켠다.
		ctv.displayCaption("Hello, World!");
	}

}
