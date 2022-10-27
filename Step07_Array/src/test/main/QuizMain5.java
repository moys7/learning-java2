package test.main;

import java.util.Random;
import java.util.Scanner;

public class QuizMain5 {
	public static void main(String[] args) {
		/* 
		 * 3개가 모두 같게 나왔다면 10점 부여하기
		 */
		
		String[] items={"cherry", "apple", "banana", "melon", "7"};
		//랜덤한 숫자를 얻어내기 위한 객체
		Random ran=new Random();
		
		//for문 안에서 얻어낸 랜덤한 숫자 3개를 저장할 배열 객체 생성
		int[] nums=new int[3];
		
		
		
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
			
			for(int i=0; i<3; i++) {
				//0~4 사이의 랜덤한 숫자를 하나 얻어내서
				int ranNum=ran.nextInt(5);
				//배열의 인덱스로 활용해서 문자열 출력하기
				System.out.print(items[ranNum]);//print 개행없이 출력가능
				if(i<2) {
				System.out.print(" | ");
				}
				nums[i]=ranNum;
			}
			System.out.println();
			

			boolean isEqual= nums[0] == nums[1] && nums[1] == nums[2];
			boolean istwoEqual= nums[0] == nums[1] || nums[1] == nums[2] ||  nums[0] == nums[2];

			if (isEqual) {
				System.out.println("     10점!");
			}else if(istwoEqual) {
				System.out.println("      5점!");
			}else {
				System.out.println("      실패!");
			}
			
		
		}
	}
}
