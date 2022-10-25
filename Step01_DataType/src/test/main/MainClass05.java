package test.main;

/*
 * [자바 참조 데이터]
 * 
 * string type
 * 
 * 문자열을 다룰떄 사용하는 데이터 타입이다.
 */
public class MainClass05 {
	public static void main(String[] args) {
		//"김구라"라는 스트링 타입 객체를 heap영역에 만들고 그 참조값을 변수에 담기
		String name="김구라";
		//name 안에 있는 참조값 tmp 변수에 복사해 주기
		String tmp=name;
		//"원숭이"라는 스트링 타입 객체를 heap영역에 만들고 그 참조값을 name 변수에 덮어쓰기
		name="원숭이";
		//name 변수를 비우기(null은 참조 데이터 타입이 담길 수 있는 빈 공간을 의미한다.)
		name=null;
		//오라클과 널의 정의가 다름 자바에서는 비교가 =가능하다. (뜻은 비어있다.)
	}
}
