package test.main;

import java.util.Scanner;

public class MainClass05 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작되었습니다.");
		//키보드로부터 입력 받을 수 있는 기능을 가진 객체생성
		Scanner scan=new Scanner(System.in);
		System.out.print("문자열 한줄 입력:");//println 차이
		//한줄 입력 받고
		String str=scan.nextLine();
		//입력 받은 문자열을 콘솔에 출력
		System.out.println(str);
		//종료
		System.out.println("main 메소드가 종료됬습니다.");
	}
}
