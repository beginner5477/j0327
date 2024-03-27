package t3_Event;

import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class T2_KeyboardEvent extends Frame implements WindowListener, KeyListener{
	public T2_KeyboardEvent() {
		super("키보드 이벤트 연습");
		setBounds(300,250,400,400);
		
		
		setVisible(true);
		addWindowListener(this);
		addKeyListener(this);
	}
	public static void main(String[] args) {
		new T2_KeyboardEvent();
	}
	
	//윈도우 리스너를 위한 메소드7개(핸들러)
	@Override
	public void windowOpened(WindowEvent e) {}

	@Override
	public void windowClosing(WindowEvent e) { System.exit(0);}

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
	
	
	//키보드 리스너를 위한 핸들러
	
	//키보드 입력이 종결시
	@Override
	public void keyTyped(KeyEvent e) {
		System.out.println("키보드 입력 종결시?");
	}
	//키보드 눌리는 순간
	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("키보드 눌리는 순간");	
		System.out.println("입력된 키는? "+e.getKeyChar());
	}
	//키보드 눌렀다가 떼지는 순간
	@Override
	public void keyReleased(KeyEvent e) {
		System.out.println("키보드 떼지는 순간");		
	}
	
	
}
