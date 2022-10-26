package test.main;

public class MainClass02 {
	public static void main(String[] args) {
		// 0으로 초기화된 방 3개짜리 int[] 객체를 만들어서 참조값을 지역 변수 nums에 담기
		int[] nums={0, 0, 0};
		// 0번방에 10, 1번방에 20, 2번방에 30을 저장해 보세요.
		nums[0]=10;
		nums[1]=20;
		nums[2]=30;
		
		//0으로 초기화된 방 100개짜리 int[] 객체 만들어서 참조값을 지역 변수 num2에 담기
		int[] num2= new int[100];
		
		//0으로 초기화된 방 100개짜리 int[] 객체 만들어서 참조값을 지역 변수 num3에 담기
		int[] num3= new int[3];		
		num3[3]=400;//3번방은 존재하지 않음으로 어레이 범위가 벗어났다고 에러가 뜬다.
		//에러가 뜨면 실행의 흐름이 다른곳으로 넘어가기에 아래는 실행될 수 없다.
		
		System.out.println("main 메소드가 정상 종료됩니다.");
	}
}
