package t5_Adapter;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Test2 extends Frame{
	Button btnPlayStop, btnExit;
	public Test2() {
		super("어댑터 연습.");
		setBounds(300,350,300,300);
		setLayout(new FlowLayout());
		
		btnPlayStop = new Button("Play");
		btnExit = new Button("Exit");
		add(btnExit);
		add(btnPlayStop);
		
		btnPlayStop.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Button btnLabel = (Button) e.getSource();
				if(btnLabel.getLabel().equals("Play"))
				{
					btnPlayStop.setLabel("Stop");
					System.out.println("출발");
				}
				else
				{
					btnPlayStop.setLabel("Play");
					System.out.println("정지");
				}
			}
		});
		setVisible(true);
		//어댑터를 이용한 윈도우 종료(익명 이너 클래스)
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		//버튼 클릭시 종료.(익명 이너 클래스를 이용)
		btnExit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}
	
	public static void main(String[] args) {
		new Test2();
	}
}
