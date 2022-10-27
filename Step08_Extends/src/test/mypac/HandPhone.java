package test.mypac;
/*
 * 이미 존재하는 Phone 클래스의 extends(상속)를 받아서 HandPhone클래스 정의하기
 */
public class HandPhone extends Phone{
	
	public HandPhone() {
		System.out.println("HandPhone 생성자 호출");
	}
	
	//메소드
	public void mobileCall() {
		System.out.println("이동중 전화 검");
	}
	
	//사진 찍는 메소드
	public void takePicture() {
		System.out.println("30만 화소의 사진 찍음");
	}
}
