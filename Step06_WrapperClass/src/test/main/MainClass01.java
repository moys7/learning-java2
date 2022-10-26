package test.main;
/*
 * [기본 data 타입의 참조 데이타 타입]
 * 
 * byte   : Byte
 * short  : Short
 * int    : Integer
 * long   : Long
 * 
 * float  : Float
 * double : Double
 * 
 * char   : Character
 * boolean: Boolean
 * 
 * 때로는 기본데이터 타입의 참조데이터 타입이 필요할 때가 있다.
 * 기본 데이터 타입을 객체에 포장(boxing)하는 형태이다.
 * 박싱과 언박싱 은 자동으로 되기 때문에 프로그래머가 신경쓸 필요없다.
 */
public class MainClass01 {
	public static void main(String[] args) {
		// 기본 데이터 타입
		int num1=10;
		// 참조 데이터 타입
		Integer num2=10;
		//기본형에는 점을 찍으면 필드와 메소드가 보이지 않지만 참조형으로 바꾸면 점찍었을 때 사용이 가능하다.
		//참조형은 참조값이 생긴다.(힙영역에 10이 오토박싱된다.)
		
		
		// 참조 데이터 타입 이지만 기본 데이터 타입처럼 사용할 수 있다.
		int result1=num2+1;
		int result2=num1+num2;
		Integer result3=num1+num2;
		
		//문자를 숫자로 바꾸기(String type 을 int type으로 바꾼 결과값 얻어내기)
		int result4=Integer.parseInt("999"); //Integer 클래스의 static 메소드 활용.
		
	}
}
