package test.main;

import java.util.Scanner;

public class MainClass02 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("나눌수 입력:");
		String inputNum1=scan.nextLine();
		System.out.println("나누어 지는 수 입력");
		String inputNum2=scan.nextLine();
		try {
			int num1=Integer.parseInt(inputNum1);
			int num2=Integer.parseInt(inputNum2);
			
			int result1=num2/num1;//몫
			int result2=num2%num1;//나머지
			System.out.println(num2+"를 "+num1+" 으로 나눈 몫: "+result1);
			System.out.println(num2+"를 "+num1+" 으로 나눈 나머지: "+result2);
		}catch(NumberFormatException nfe) {
			System.out.println("숫자 형식으로 입력해주세요.");
		}catch(ArithmeticException ae) { //(Exception e) 모든 이셉션의 부토 타입으로 하면 된다. 타입을 모를 경우
			System.out.println("어떤수를 0으로 나눌수는 없어요.");
		}finally {//위에 예외 발생과 상관없이 반드시 실행이 보장되는 블럭
			System.out.println("무언가 중요한 마무리 작업을 해요!");
		}
		
		System.out.println("main 메소드가 정상 종료 됩니다.");
	}
}
