package frame05;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyFrame extends JFrame{
	//생성자
	public MyFrame(String title) {
		super(title);
		
		//다형성 확인 this가 무슨 타입일지
		//this 예약어를 이용해서 MyFrame 객체의 다형성 확인!
		MyFrame a=this;
		JFrame b=this;
		Component c=this;
		Object d=this;
		
		setBounds(100, 100, 500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		JButton sendBtn=new JButton("전송");
		add(sendBtn);
		
		//ActionLister 인터페에스 type의 참조값 얻어내기
		ActionListener listener= new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("전송 버튼을 눌렀습니다.");	
				
				//알림메세지
				JOptionPane.showMessageDialog(MyFrame.this, "전송합니다.");
				//this가 누굴 가리키는지.
				//ActionLister f= this;
			}
		};
		
		//전송버튼에 등록하기
		sendBtn.addActionListener(listener);
		
		
		
		
		/*
		 * 삭제 버튼도 프레임에 배치하고, 해당 버튼을 눌렀을떄 "삭제버튼을 눌렀음"
		 * 라는 메세지를 콘솔창에 출력되도록 프로그래밍 해보세요.
		 */
		
		JButton deleteBtn=new JButton("삭제");
		add(deleteBtn);
		ActionListener listener2= new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("삭제 버튼을 눌렀습니다.");	
				JOptionPane.showMessageDialog(MyFrame.this, "삭제합니다.");
			}
		};
		deleteBtn.addActionListener(listener2);
		
	}
	
	public static void main(String[] args) {
		MyFrame f=new MyFrame("나의 프레임5");
		f.setVisible(true);
	}
}
