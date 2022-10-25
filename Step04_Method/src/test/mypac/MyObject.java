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
		//2. non 3. int(호출하는 위치로 int)  4.getNumber
		//5.()0개
	}
	
	public String getGreeting() {
		return "안녕하세요";
		//2.non 3.string 5.()안에 0개
	}
}
