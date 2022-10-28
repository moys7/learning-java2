package test.main;

import test.mypac.Zoo;
import test.mypac.Zoo.Monkey;
import test.mypac.Zoo.Tiger;

public class MainClass03 {
	public static void main(String[] args) {
	//Zoo 클래스에 있는 getMonkey() 메소드를 호출해서
	//리턴되는 값을 m1이라는 지역 변수에 담아보세요
		
		Zoo z=new Zoo();
		Monkey m1=z.getMonkey();
		m1.say();
		
		Tiger t1=z.getTiger();
		t1.say();
		//Zoo.Monkey m1=z.getMonkey();
		//위처럼 쓰면 import test.mypac.Zoo.Monkey; 생략가능
		
		//메소드 안에서도 클래스를 정의 할 수 있다.
		//지역 내부 클래스, local Inner Class
		class Gura{
			public void say() {
				System.out.println("안녕 난 구라");
			}
		}
		
		Gura g1=new Gura();
		g1.say();
	}
}
	
