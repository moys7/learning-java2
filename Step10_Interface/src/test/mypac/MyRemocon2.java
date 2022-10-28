package test.mypac;

public class MyRemocon2 implements Remocon{

	@Override
	public void up() {
		System.out.println("볼륨 업");
		
	}

	@Override
	public void down() {
		System.out.println("볼륨다운");
	}

}
//내가 하다만거