package test.main;

import java.util.Random;
import java.util.Scanner;

public class QuizMain5 {
	public static void main(String[] args) {

		String[] items={"cherry", "apple", "banana", "melon", "7"};
		Random ran=new Random();
		
		int[] nums=new int[3];
		
		
		
		int point=1000;
		
		Scanner scan=new Scanner(System.in);
		

		while(true) {
			if (point == 0) {
				break; 
			}
			System.out.println("Enter를 치세요");
			scan.nextLine();

			point -= 10;
			System.out.println("시작 포인트:"+point);
			for(int i=0; i<3; i++) {
				int ranNum=ran.nextInt(5);
				System.out.print(items[ranNum]);
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
				point +=10;
			}else if(istwoEqual) {
				System.out.println("      5점!");
				point +=5;
			}else {
				System.out.println("      실패!");
			}
			
		System.out.println("얻은 포인트:"+point);
		}
	}
}
