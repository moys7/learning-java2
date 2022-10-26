package test.main;

import test.mypac.Bike;

public class MainClass04 {
	public static void main(String[] args) {
		/*
		 * 
		 * 1. Bike 객체를 담을 수 있는 방 3개짜리 배열객체를 생성해서 참조값을 bike
		 * 라는 지역변수에 담아보세요.
		 * 2.배열의 각각의 방(0,1,2 번)에 Bike객체를 생성해서 담아보세요.
		 * 3.반복문for를 이용해서 순서대로 배열의 각각의 방에 있는 Bike객체의 ride()메소드를 
		 * 호출해보세요.
		 */
		//1.
		Bike[] bikes=new Bike[3]; 
		//바이크 배열객체를 생성한 것이지 바이크객체는 아래에서 생성할 것이다.
		
		//2.
		bikes[0]=new Bike();
		bikes[1]=new Bike();
		bikes[2]=new Bike();
		
		//3.
		for(int i=0; i<bikes.length; i++) {
			bikes[i].ride();
		}
		
	}

}
