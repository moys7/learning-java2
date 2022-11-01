package test.main;

public class MainClass03 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작되었습니다.");
		
		
		try {
			/*
			 * 시뢩의 흐름을 스트레드 라고 하는데 스트레드를 임의로 5초동안 잡아두기
			 * 컴파일시에 발생하는 Exception 이 발생하기 때문에반드시 try~catch 블럭으로 예외 처리를 해야한다.
			 */
			//실행을 잡아둔다.import없이 사요가능
			Thread.sleep(5000);//1000이 1초다 5000밀리초(5초) 동안 잠아둔다 
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		System.out.println("main 메소드가 종료됩니다.");
	}
}
