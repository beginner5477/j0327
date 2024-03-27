package t6_Swing;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class Test7_BorderLayout2_점검요 extends Frame{
	Panel pn1;
	Button btn1,btn2,btn3,btn4,btn5;
	Checkbox gender1, gender2;
	CheckboxGroup gender;
	public Test7_BorderLayout2_점검요() {
		super("라디오버튼 연습");
		setLayout(new FlowLayout());
		setSize(300,300);
		setLocationRelativeTo(null);
		setResizable(false);
		pn1 = new Panel();
		pn1.setLayout(null);
		
		gender = new CheckboxGroup();
		gender1 = new Checkbox("남자", gender,true); 	//첫번째 레이블 두번째 그룹명 세번째 초기선택유무 트루면 체크된채로 실행
		gender2 = new Checkbox("여자", gender,false); 	//첫번째 레이블 두번째 그룹명 세번째 초기선택유무 트루면 체크된채로 실행
		
		pn1.add(gender2);
		pn1.add(gender1);
		
		add(pn1);
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		btn5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}
	public static void main(String[] args) {
		new Test7_BorderLayout2_점검요();
	}
}
