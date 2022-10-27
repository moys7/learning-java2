package test.main;

import test.mypac.HandPhone;
import test.mypac.SmartPhone;

public class MainClass06 {
	public static void main(String[] args) {
		//자식에게 사준 일반 핸드폰(인터넷이 안됨)
		HandPhone p1=new HandPhone();
		
		//엄마! 나도 스마트폰SmartPhone 갖고 싶어
		//자 새로운 설명서를 가지고 왔어 이제 그폰은 스마트포이야
		SmartPhone p2=(SmartPhone)p1;
		
		//엄마 엄청나다 나 이제 인터넷 할 수 있다.
		p2.doInternet();
		
	}
}
