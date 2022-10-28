package test.main;

import test.mypac.Weapon;

public class MainClass04 {
	
	//내부 클래스
	static class YourWeapon extends Weapon{
	//내부클래스는 static을 붙일 수 있다.
		@Override
		public void attack() {
			System.out.println("공중 공격!");			
		}
		
	}
	
	
	public static void main(String[] args) {
		Weapon w1=new YourWeapon();
		//static이 YourWeapon에 안붙으면 new YourWeapon();이렇게 쓰면 에러난다
		useWeapon(w1);
		
		//Local Inner Class 내부클래스(메소드 안의 클래스)
		class OurWeapon extends Weapon{
			@Override
			public void attack() {
				System.out.println("모두에게 공격!");			
			}	
		}
		Weapon w2=new OurWeapon();
		useWeapon(w2);
	}
	
	
	
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
	}
}
