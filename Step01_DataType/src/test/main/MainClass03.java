package test.main;
/*
 * [자바 기본 데이터 타입]
 * 
 * 2. 논리형 (boolean)
 * 
 * true, false 두가지 값중 하나이다.
 * true, false를 직접 쓰거나 비교연산 혹은 논리 연산의 결과로 얻어낼수 있다.
 * 참과 거짓을 나타내는 데이터 타입
 * 
 */

public class MainClass03 {
	public static void main(String[] args) {
		//논리형 변수 선언과 동시에 값 대입하기
		boolean isRun=true;
		
		if (isRun) {
			System.out.println("달려요");
		}
		
		//비교 연산의 결과로 얻어진 불리안 값 담기
		boolean isGreater=10>1;
		//논리 연산의 결과로 얻어진 boolean값 담기
		boolean result=true||false;
		
		//한번 선언한 변수는 다시 선언 할 수 없다. (result 값을 바꿀 수 없다. 자바는 타입에 민감해)
		//boolean result=false; //주석 지우면 바로 에러 보인다.
		result=false; //변수에 다른 값을 대입 할 수 있다.(동일한 타입인 경우)
		//다른 타입 값은 변수에 담을 수 없다.
		//result=10;
	}

}
