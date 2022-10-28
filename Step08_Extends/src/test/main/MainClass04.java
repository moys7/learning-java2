package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;

public class MainClass04 {
	public static void main(String[] args) {
		//HandPhone객체를 생성해서 그 참조값을 Object 타입 p3지역변수에 담는다.
		Object p3=new HandPhone();		
		//Object type 변수에 담긴 값을 Phone 타입 변수에 담기
		Phone p2=(Phone)p3; //casting 연산자를 이용하면 가능하다.	
		//더 넓은 범위 Object에서 좁은 범위 Phone에 넣으려니 캐스팅
		HandPhone p1=(HandPhone)p3; //casting 연산자를 이용하면 가능하다.
		
				//무작정 캐스팅하면 안된다. 그 타입이 아닌데 강제로 입히면 실행시 에러난다.
				//그 타입이 맞는 지 확인해야한다.
	}
}
