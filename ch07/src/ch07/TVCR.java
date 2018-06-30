package ch07;
class TV2{
	boolean power;
	int channel;
	void power(){power=!power;}
	void channelUp() {
		++channel;
	}
	void channelDown() {
		--channel;
	}
}
class VCR{
	boolean power;
	int counter=0;
	void power() {power=!power;}
	void play() {}
	void stop() {}
	void rew() {}
	void ff() {}
}
/*
 * 단일상속만 가능(JAVA)- 오직 부모클래스로부터 하나의 자식클래스만 상속가능
 * 다중상속가능 (C++)	- 한 자식에 대해서 부모클래스가 여려개이다.
 * 
 * 이 문제에서는 TV2를 상속관계로 받고
 * VCR은 포함관계를 이용해서 구현하였다.
 */
class TVCR extends TV2{
	VCR vcr=new VCR();
	int counter=vcr.counter;
	void play() {
		vcr.play();
	}
	void stop() {
		vcr.stop();
	}
	void rew() {
		vcr.rew();
	}
	void ff() {
		vcr.ff();
	}
}


