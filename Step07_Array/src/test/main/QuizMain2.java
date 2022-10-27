package test.main;

import java.util.Random;

public class QuizMain2 {
	public static void main(String[] args) {
		/* 2.run 헀을때
		 * 5개의 문자열중 3개가 한줄에 한번에 랜덤하게 출력되게 해보세요
		 *예) 7|7|7
		 *  7|apple|melon
		 */
		
		String[] items={"cherry", "apple", "banana", "melon", "7"};
		//랜덤한 숫자를 얻어내기 위한 객체
		Random ran=new Random();
		
		for(int i=0; i<3; i++) {
			//0~4 사이의 랜덤한 숫자를 하나 얻어내서
			int ranNum=ran.nextInt(5);
			//배열의 인덱스로 활용해서 문자열 출력하기
			System.out.print(items[ranNum]);//print 개행없이 출력가능
			if(i<2) {
			System.out.print(" | ");
			}
		}
	}
}
