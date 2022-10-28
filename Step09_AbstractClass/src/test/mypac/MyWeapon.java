package test.mypac;

public class MyWeapon extends Weapon{

	@Override//주석과 비슷하게 그냥 표시의 역할
	public void attack() {
		System.out.println("공격해요!");	
	}
}