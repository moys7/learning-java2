package test.main;

import javax.swing.JFrame;

public class ㅅㄷㄴㅅ1 extends JFrame{
	
	//생성자
	public MyFrame(String title) {
		super(title);
		
		this.setBounds(100,100,500,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setVisible(true);
	
	}
	//run 했을때 실행의 흐름이 시작되는 특별한 메소드
	public static void main(String[] args) {
		//MyFrame 객체생성하기
		new MyFrame("나의 프레임");
	}

}