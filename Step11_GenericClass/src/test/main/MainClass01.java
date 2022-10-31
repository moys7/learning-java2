package test.main;

import test.mypack.Apple;
import test.mypack.Banana;
import test.mypack.FruitBox;

public class MainClass01 {
	public static void main(String[] args) {
		/*
		 * 객체 생성시 generic 클래스느 생략가능!   <>얀에 비워도 된다는 뜻.
		 * 참조갑을 필드나 변수에 받을때만 타입을 정확히 지정하면 됩니다.
		 */
		FruitBox<Apple> box1 = new FruitBox<>();//<> 안에 생략 가능
		//setItem() 메소드 호출하면서 Apple type 전달하기
		box1.setItem(new Apple());
		//getItem() 메소드 호출해서 Apple type리턴 받기
		Apple a=box1.getItem();
		
		
		//웨의 텍스트를 Banan 클래스로 해 보세요
		FruitBox<Banana> box2 = new FruitBox<>();
		box2.setItem(new Banana());
		Banana b=box2.getItem();
		
	}
}
