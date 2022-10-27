package test.mypac;

public class SmartPhone extends HandPhone{
	
	//생성자
	public SmartPhone() {
		System.out.println("SmartPhone생성자 호출됨");
	}
	//메소드
	public void doInternet() {
		System.out.println("인터넷을 해요");
	}
	
	@Override//이 글씨는 지워도 에러가 나지않는다 다만 읽을때 다른것들과 비교가 될수 있록
	public void takePicture() {
		//super.takePicture();
		//super은 부모꺼를 사용하는 것이다.
		System.out.println("1000만 화소의 사진을 찍어요!");
	}
	//ctrl + space => takepicture
}
