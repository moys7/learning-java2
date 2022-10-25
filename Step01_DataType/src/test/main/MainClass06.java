package test.main;

public class MainClass06 {
	public static void main(String[] args) {
		System.out.println("메인 메소드가 시작 되었습니다.");
		//지역변수는 값을 넣지 않고 선언만 하면 만들어지지 않는다.
		int num1;
		String name1;
		//어떠한 것도 넣지 않고는 공간을 만들수 없다.
		//따라서 실행도 안 된다. 위에2줄
		
		//아직 만들어 지지 않았기 때문에 num1 은 참조 불가
		//int result=1+num1; //앞에 주석을 지우면 에러가 바로 뜬다.
		
		//아직 만들어 지지 않았기 때문에 name1은 참조 불가
		//System.out.println("name1:"+name1);
		
		System.out.println("메인 메소드가 종료됩니다.");
	}
}
