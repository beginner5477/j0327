package t6_Swing;


import javax.swing.JFrame;

//스윙의 종료(어댑터를 이용함)
public class Test4_WindowClose extends JFrame{
	public Test4_WindowClose() {
		super("Swing 연습4");
		setBounds(300, 250,300, 250);
		setVisible(true);
		
		//윈도우 창 닫기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new Test4_WindowClose();
	}
}
