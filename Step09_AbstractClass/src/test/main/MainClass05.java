package test.main;

import java.util.Scanner;

import test.mypac.Weapon;

public class MainClass05 {
/*
 * 필드!	              	//System.out.println();//필드 안에서 작동 안한다. 코딩을 하면 안된다. 필드만 만들어라 값을 얻는 거까지는 가능.
 */
	//필드를 선언하면서 값을 얻어내서 대입하는 코드
	int num=999;
	String name ="kim";
	Scanner scan=new Scanner(System.in);
	
	//필드는 선언만 하면 기본값이 들어간다.
	int weight; //0
	boolean isRun; //false
	String msg; //null
	Scanner scan2; //null
	//스태틱 영역에 올리고 싶은 필드는 스태틱 예약어를 이요해서 만든다.
	static String greet="안녕";
	
	// Anonymous Inner Class를 이용해서 Weapon type의 참조값 얻어내기
	static Weapon w1=new Weapon() {
		@Override
		public void attack() {
			System.out.println("아무렇게 공격");
		}
	};
	//static Weapon w1;
	//w1에는 null이 들어가 있다. 추상클래스는 그냥 new Weapon();할수 없다.
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		useWeapon(w1);
		//Anonymous Local Inner Class를 이용해서 Weapon type의 참조값 얻어내기
		Weapon w2=new Weapon() {
			@Override
			public void attack() {
				System.out.println("아몰라 공격해");	
			}	
		};
		useWeapon(w2);
		
		
		useWeapon(new Weapon() {
			@Override
			public void attack() {
				System.out.println("신기한 공격!");
			}
		});
	}
	
	
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
	}
}
