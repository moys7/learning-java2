package test.mypac;

public class Member {
	//번호 저장할 필드
	public int num;
	//이름 저장할 필드
	public String name;
	//주소 저장할 필드
	public String addr;
	
	
	//생성자란 클래스명과 이름이 같고 리턴에대한 값이 없는 것.
	public Member(int num, String name, String addr) {//생성자에도 매개 변수를 선언할 수 있다.
		//생성자의 인자로 전달받은 값을 필드에 저장하기
		this.num=num;
		this.name=name;
		this.addr=addr;
	}
	
	//생성자를 하나라도 정의하면 기본 생성자는 없다고 간주 되기 때문에
	//기본 생성자도 필요하면 명시적으로 정의 해야 한다.
	public Member() {}
	
	//메소드
	public void showInfo() {
		//필드에 저장된 내용을 활용해서 정보를 출력하기
		System.out.println("번호:"+this.num+", 이름:"+this.name+", 주소:"+this.addr);
	}
}
