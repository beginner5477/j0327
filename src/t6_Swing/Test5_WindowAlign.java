package t6_Swing;


import javax.swing.JFrame;

//화면 중앙에 윈도우 정렬, 크기 고정
public class Test5_WindowAlign extends JFrame{
	public Test5_WindowAlign() {
		super("Swing 연습5");
//		setBounds(300, 250,300, 250);
		setSize(300, 250);
		setLocationRelativeTo(null); 	//윈도우 화면 중앙에 띄우기
		setResizable(false);
		setVisible(true);
		
		//윈도우 창 닫기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new Test5_WindowAlign();
	}
}
