package t3_Event;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class T3_ButtonEvent2 extends Frame implements WindowListener, ActionListener{
	Button btnPlay, btnStop, btnExit, btnMessage;
	Label lblMessage;
	
	public T3_ButtonEvent2() {
		super("버튼 이벤트 연습~");
		setLayout(new FlowLayout());
		setBounds(300,350,1000,1000);
		
		//버튼 객체 생성 및 배치
		btnPlay = new Button("Start");
		btnStop = new Button("Stop");
		btnExit = new Button("Exit");
		btnMessage = new Button();
		add(btnPlay);
		add(btnStop);
		add(btnExit);
		add(btnMessage);
		//레이블 생성및 배치
		lblMessage = new Label();
		add(lblMessage);
		lblMessage.setSize(350, 350);
		lblMessage.setBackground(Color.YELLOW);
		
		setVisible(true);
	
		
		addWindowListener(this);
		btnExit.addActionListener(this);
		btnPlay.addActionListener(this);
		btnStop.addActionListener(this);
		
	}
	public static void main(String[] args) {
		new T3_ButtonEvent2();
	}
	@Override
	public void actionPerformed(ActionEvent e) { 
		Button btnText = (Button) e.getSource();
		if(btnText.getLabel().equals("Start"))
		{
//			System.out.println("시작 버튼을 누르셨군요.");
			lblMessage.setText("시작 버튼 눌림.");
			btnMessage.setLabel("시작");
		}
		else if(btnText.getLabel().equals("Stop")) 
		{
//			System.out.println("중지 버튼을 누르셨군요.");
			lblMessage.setText("중지버튼 눌림.");
			btnMessage.setLabel("종료");
		}
		else
		{
//			System.out.println("종료 버튼을 누르셨군요.");
			System.exit(0);
		}
	}
	@Override
	public void windowOpened(WindowEvent e) {}
	@Override
	public void windowClosing(WindowEvent e) {System.exit(0);}
	@Override
	public void windowClosed(WindowEvent e) {}
	@Override
	public void windowIconified(WindowEvent e) {}
	@Override
	public void windowDeiconified(WindowEvent e) {}
	@Override
	public void windowActivated(WindowEvent e) {}
	@Override
	public void windowDeactivated(WindowEvent e) {}
}
