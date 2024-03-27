package t1_awt_basic;

import java.awt.Frame;

//직접 프레임 객체를 생성하여 작업하기
public class Test1 {
	public static void main(String[] args) {
		Frame frame = new Frame();
		
		frame.setTitle("AWT 프레임");
		frame.setSize(500, 250);	//가로 세로 입력 픽셀단위
		
		frame.setVisible(true);
	}
}
