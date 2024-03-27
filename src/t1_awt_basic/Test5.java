package t1_awt_basic;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

//시작 좌표랑 크기설정 
public class Test5 extends Frame implements WindowListener, ActionListener {
	
	//객체를 생성시에 UI설계처리를 한다.
	public Test5() {
		setBounds(300, 200, 1000, 500);	//가로 세로 입력 픽셀단위
		setTitle("AWT 프레임");
		//레이블 컴포넌트
		Label lbl1 = new Label("레이블 테스트입니다.");
//		this.add(lbl1);
		add(lbl1);
		Button btnExit = new Button("종료");
		add(btnExit);
		setVisible(true);
		
		//리스너(윈도우 감지부분 처리)
		addWindowListener(this);
		btnExit.addActionListener(this);
	}
	public static void main(String[] args) {
		new Test5();
	}
	@Override
	public void windowOpened(WindowEvent e) {}
	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);	//윈도우창 닫기 (실행종료)
	}
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
	@Override
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
	}
}
