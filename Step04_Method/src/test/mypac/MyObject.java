package test.mypac;
/*
 * [메소드를 만들때 고려 해야할 것]
 * 
 * 1. 접근 지정자
 * 2. static or non static 
 * 3. 리턴 타입
 * 4. 메소드명
 * 5. 
와 데이터 타입
 */
public class MyObject {
	public void walk() {
		//1. public
		//2.static이 비어 있음으로 non
		//3. void 리턴타입 비어있음
		//4. walk
		//5. ()에 비어있음으로 0개
		System.out.println("걸음을 걸어요");
	}
	public int getNumber() {
		return 10;
		//만약 리턴10을 빼면 int 값을 리턴하기로 했음으로 에러난다.
		
		//2. non 3. int(호출하는 위치로 int)  4.getNumber
		//5.()0개
	}
	
	public String getGreeting() {
		return "안녕하세요";
	}
	
	//Car type을 리턴을 해주는 메소드
	public Car getCar() {
		return new Car();
	}
	
	//int type 을 메소드의 인자로 전달 받는 메소드
	public void setNum(int num) {
		System.out.println("num:"+num);
	}
	
	//string type 을 메소드의 인자로 전달받는 메소드
	public void setName(String name) {
		System.out.println("name:"+name);
	}
	
	//cartype 을 메소드의 인자로 전달받는 메소드
	public void useCar(Car car) {
			car.drive();
	}
	
	//3개의 type 을 메소드의 인잘 전달받는 메소드
	public void doSomething(int num, String msg, Car c) {
		System.out.println("무언가 작업중");
	}
	
	
	public void send() {
		System.out.println("무언가를 전송해요");
	}
	public void send(int num) {
		System.out.println(num+"을 전송해요");
	}
	public void send(String name) {
		System.out.println(name+"을 전송해요");
	}
	public void send(Car car) {
		System.out.println("자동차를 전송해요");
	}
}
