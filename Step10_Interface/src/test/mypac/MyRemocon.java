package test.mypac;

public class MyRemocon implements Remocon{

	@Override
	public void up() {
		System.out.println("채널 올리기");
		
	}

	@Override
	public void down() {
		System.out.println("채널 내리기");
	}

}
