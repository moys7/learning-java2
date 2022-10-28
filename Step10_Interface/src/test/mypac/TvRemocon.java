package test.mypac;

public class TvRemocon implements Remocon{

	@Override
	public void up() {
		System.out.println("Tv 볼륨 업!");
		
	}

	@Override
	public void down() {
		System.out.println("Tv 볼륨 다운!");
	}

}
