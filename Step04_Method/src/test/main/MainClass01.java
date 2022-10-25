package test.main;

import test.mypac.MyObject;

public class MainClass01 {
	public static void main(String[] args) {
		/*
		 * MyObject 객체를 하난만 생성해서 그 객체가 가지고 있는
		 * walk(), getNumber(), getGreeting() 메소드를 차례로 호출 후
		 * 단, 메소드가 어떤 data를 리턴하면 해당 데이터를 지역변수에 담아보세요
		 */
		MyObject a=new MyObject();
		a.walk();
		int num=a.getNumber();
		String greet=a.getGreeting();
	}
}
