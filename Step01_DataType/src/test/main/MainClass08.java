package test.main;

public class MainClass08 {
	public static void main(String[] args) {
		String str="abcde12345";
		int result=str.length();
		//자바는 메소드 호출 위치에 어떤값으로 바뀔때도 있고 아닐때도 있다.
		char result2=str.charAt(5);
		/*
		 * String 객체의 메소드를 활용해서
		 * str 변수 안에있는 문자를 모두 대문자(UpperCase)로 변환해서
		 * str2라는 이름의 변수에 담아보세요.
		 */
		String str2=str.toUpperCase();
		
		String greet="Hello! mimi, Bye! mimi";
		//위의 문자열에서 mimi라는 문자열을 mama라는 문자열로 교체해서 결과를 greet2에 담아보세요
		//단, String 객체의 메소드를 활용
		String greet2=greet.replace("mimi", "mama");
		//replace 또는 replaceaAll 활용
		//String greet2=greet.replaceAll("mimi", "mama");
		
		
		String message="My name is Kimgura";
		/*
		 * 1.위에 문자열이 My란는 문자열로 시작 하는지 여부를 isStart라는 변수에 담기
		 * 2.위에 문자열에서 i가 문자열의 몇번째 인덱스에 위피하고 있는지 index라는 변수에 담기
		 */
		boolean isStart = message.startsWith("My");
		int index=message.indexOf("i");

	}
}

