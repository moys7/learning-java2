package test.mypac;

//동물원 클래스?
public class Zoo {
	
	//클래스 안에 클래스(내부 클래스)
	public class Monkey{
		public void say() {
			System.out.println("안녕 난 원숭이");
		}
	}
	//내부 클래스
	public class Tiger{
		public void say() {
			System.out.println("안녕 난 호랑이");
		}
	}
	
	//메소드
	public Monkey getMonkey() {//내부 클래스로 객체를 생성해서 리턴해주는 메소드
		return new Monkey();
	}
	public Tiger getTiger() {
		return new Tiger();
	}
}