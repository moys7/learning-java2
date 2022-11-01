package test.main;

import test.mypac.MyUtil;

public class MainClass06 {
	public static void main(String[] args) {
		
		try {
			MyUtil.send();
		} catch (InterruptedException e) {//사용하는 쪽에서 트라이 캐치로 서라운드해야한다.
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		MyUtil.draw();
	}
}
