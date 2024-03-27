package t1_awt_basic;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

//종료버튼 처리(인터페이스 이용) 
public class Test3 extends Frame implements WindowListener {
	
	//객체를 생성시에 UI설계처리를 한다.
	public Test3() {
		setSize(300, 250);	//가로 세로 입력 픽셀단위
		setTitle("AWT 프레임");
		
		setVisible(true);
		addWindowListener(this);
	}
	public static void main(String[] args) {
		new Test3();
	}
	@Override
	public void windowOpened(WindowEvent e) {}
	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);	//jvm 닫기 (실행종료)
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
}
