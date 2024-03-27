package t1_awt_basic;

import java.awt.Frame;

//프레임 객체를 상속받아서 작업 하기 
public class Test2 extends Frame {
	
	//객체를 생성시에 UI설계처리를 한다.
	public Test2() {
		setSize(300, 250);	//가로 세로 입력 픽셀단위
		setTitle("AWT 프레임");
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new Test2();
	}
	
}
