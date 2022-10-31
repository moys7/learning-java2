package test.main;

import test.mypac.Joinner;

public class MainClass05 {
	public static void main(String[] args) {
		Joinner j1=new Joinner() {
			@Override
			public String join(String one, String two) {
				
				return one + two;
			}
		};
		String result1=j1.join("hi", "hey");
		
		//Joinner j2=(String one, Sttring two)->{};
		Joinner j2=(one, two)->{; //타입 생갹가는 매개변수 이름만 잘 적으면 된다.
			return one+two;
		};
			
		Joinner j3=(one,two)->one+two;    //더 줄인 표현 "람다식" 이라고 부른다.
	}
}
