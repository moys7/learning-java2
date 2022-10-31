package test.mypack;

/*
 * 클 래스 안에서 사용하는 특정 type을 고정하지 않고 
 * 클래스릃 사용하는 시점에 타입을 정할 수 있게 할 수 있다.
 * 
 * - 아래 선언한 T는 마음대로 스펠링이나 단어를 정할 수 있다.
 * 보통 타입이라는 의미에서 T라고 많이 정한다.
 * 
 * -T를 포괄클래스(Generic Class)라고 한다. (일반 클래스 또는 보통 클래스라 얘기한다.)
 */

public class FruitBox<T>{
	//필드
	private T item; //클래스를 사용하는 시점에 전달되는 타입을 필드의 타입으로 사용하기
	
	//필드에 값을 넣는 메소드
	public void setItem(T item) {
		this.item=item;
	}
	
	//필드에 저장된 값을 리턴하는 메소드
	public T getItem() {
		return item;
	}
}
