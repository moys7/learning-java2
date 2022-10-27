package test.main;

import java.util.Scanner;

public class TestMain {
	public static void main(String[] args) {
		
		int point=1000;
		
		Scanner scan=new Scanner(System.in);
		
		//이는 false로 바뀔때까지 무한으로 돈다.
		while(true) {
			//만일 point 가 0이면
			if (point == 0) {
				break; //반복문 loop 탈출
			}
			System.out.println("Enter를 치세요");
			scan.nextLine();
			//포인트10씩감소
			point -= 10;
			//원하는 작업 수행
			System.out.println("수행중...");		
		}
		
		System.out.println("메소드 종료");
	}

}
