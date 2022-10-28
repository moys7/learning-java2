package test.main;

import test.mypac.Remocon;

public class MainClass03 {
	//anonymous inner class를 이용해서 interface type의 참족밧 얻어내기
	//static 메소드 안에서 사용해야 되기 때문에 static 필드로 만들어준다.
	static Remocon r1=new Remocon() {
		@Override
		public void up() {
			System.out.println("온도올려");
		}
		
		@Override
		public void down() {
			System.out.println("온도내려");
		}
	};
	
	public static void main(String[] args) {
		useRemocon(r1);
		//anonymous local inner class를 이용해서 interface type 참조값 얻기
		Remocon r2=new Remocon() {
			@Override
			public void up() {
				System.out.println("속도올려");
			}	
			@Override
			public void down() {
				System.out.println("속도내려");
			}
		};//무명클래스 사용시 클래스 안만들어도 되는 장점?
		
		useRemocon(r2);
		//메소드 호출하면서 리모콘 타입 을 즉석에서 얻어내서 전달하기
		useRemocon(new Remocon() {
			@Override
			public void up() {
				System.out.println("up");
			}
			@Override
			public void down() {
				System.out.println("down");
			}
		});
	}
	

	
	public static void useRemocon(Remocon r) {
		r.up();
		r.down();
	}
}
