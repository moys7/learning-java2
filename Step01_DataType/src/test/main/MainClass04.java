package test.main;
/*
 * [자바 기본 데이터]
 * 
 * 2. 문자형(char)
 * 
 * 65536 가지의 코드값을 가질 수 있다. (내부적으로 모든 글자는 번호가 지정되어있어 번호로 작동한다.)
 * 전 세계에서 사용하는 모든 문자 1글자를 표현할 수 있다.
 * single quotation 을 이용해서 만든다.
 */

public class MainClass04 {
	public static void main(String[] args) {
		//char형 변수 선언과 동시에 값 대입하기
		char ch1='a';
		char ch2='b';
		char ch3='c';
		char ch4='가';
		char ch5='나';
		char ch6='다';
		char ch7='@';
		
		//정수값에 1:1 대응되는 char 값이 존재한다.
		int code1=ch1;
		int code2=ch2;
		int code3=ch3;
		int code4=ch4;
		int code5=ch5;
		int code6=ch6;
		//65536개의 코드(숫자) 중 지정된 숫자보기
		//사실 따지고 보면 컴퓨터에 입력된 모든것은 숫자로 이뤄져있다.
	}
}
