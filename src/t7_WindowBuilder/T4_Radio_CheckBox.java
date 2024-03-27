package t7_WindowBuilder;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;

public class T4_Radio_CheckBox extends JFrame{
	JRadioButton rdMale, rdFemale;
	JCheckBox ckHobby1,ckHobby2,ckHobby3,ckHobby4;
	JButton btnGender, btnExit;
	JLabel lblMsg;
	private JButton btnHobby;
	private final ButtonGroup btngroupGender = new ButtonGroup();
	public T4_Radio_CheckBox() {
		super("라디오 체크박스 버튼 연습");
		setSize(800,600);
		
		
		JPanel pn1 = new JPanel();
		pn1.setBounds(12, 10, 760, 70);
		getContentPane().add(pn1);
		pn1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("라디오/체크박스 버튼 연습");
		lblNewLabel.setFont(new Font("궁서", Font.BOLD, 27));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 760, 70);
		pn1.add(lblNewLabel);
		
		JPanel pn2 = new JPanel();
		pn2.setBounds(12, 90, 760, 381);
		getContentPane().add(pn2);
		pn2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("성별");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(42, 31, 160, 42);
		pn2.add(lblNewLabel_1);
		
		rdMale = new JRadioButton("남자");
		btngroupGender.add(rdMale);
		rdMale.setFont(new Font("굴림", Font.PLAIN, 16));
		rdMale.setHorizontalAlignment(SwingConstants.CENTER);
		rdMale.setBounds(230, 31, 165, 42);
		pn2.add(rdMale);
		
		rdFemale = new JRadioButton("여자");
		btngroupGender.add(rdFemale);
		rdFemale.setHorizontalAlignment(SwingConstants.CENTER);
		rdFemale.setFont(new Font("굴림", Font.PLAIN, 16));
		rdFemale.setBounds(412, 31, 165, 42);
		pn2.add(rdFemale);
		
		JLabel lblNewLabel_1_1 = new JLabel("취미");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("굴림", Font.PLAIN, 16));
		lblNewLabel_1_1.setBounds(42, 83, 145, 42);
		pn2.add(lblNewLabel_1_1);
		
		ckHobby1 = new JCheckBox("등산");
		ckHobby1.setHorizontalAlignment(SwingConstants.CENTER);
		ckHobby1.setFont(new Font("굴림", Font.PLAIN, 16));
		ckHobby1.setBounds(195, 83, 115, 42);
		pn2.add(ckHobby1);
		
		ckHobby2 = new JCheckBox("게임");
		ckHobby2.setHorizontalAlignment(SwingConstants.CENTER);
		ckHobby2.setFont(new Font("굴림", Font.PLAIN, 16));
		ckHobby2.setBounds(329, 83, 115, 42);
		pn2.add(ckHobby2);
		
		ckHobby3 = new JCheckBox("독서");
		ckHobby3.setHorizontalAlignment(SwingConstants.CENTER);
		ckHobby3.setFont(new Font("굴림", Font.PLAIN, 16));
		ckHobby3.setBounds(448, 83, 115, 42);
		pn2.add(ckHobby3);
		
		ckHobby4 = new JCheckBox("수영");
		ckHobby4.setHorizontalAlignment(SwingConstants.CENTER);
		ckHobby4.setFont(new Font("굴림", Font.PLAIN, 16));
		ckHobby4.setBounds(577, 83, 115, 42);
		pn2.add(ckHobby4);
		
		lblMsg = new JLabel("메세지출력");
		lblMsg.setFont(new Font("굴림", Font.PLAIN, 16));
		lblMsg.setHorizontalAlignment(SwingConstants.CENTER);
		lblMsg.setBounds(45, 174, 671, 160);
		pn2.add(lblMsg);
		
		JPanel pn3 = new JPanel();
		pn3.setBounds(12, 481, 760, 70);
		getContentPane().add(pn3);
		pn3.setLayout(null);
		
		btnGender = new JButton("성별 출력");
		
		btnGender.setFont(new Font("굴림", Font.PLAIN, 16));
		btnGender.setBounds(35, 10, 206, 50);
		pn3.add(btnGender);
		
		btnExit = new JButton("종료");
		
		btnExit.setFont(new Font("굴림", Font.PLAIN, 16));
		btnExit.setBounds(517, 10, 206, 50);
		pn3.add(btnExit);
		
		btnHobby = new JButton("취미 출력");
		
		btnHobby.setFont(new Font("굴림", Font.PLAIN, 16));
		btnHobby.setBounds(282, 10, 206, 50);
		pn3.add(btnHobby);
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		setVisible(true);
		
		//성별출력버튼
		btnGender.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String gender = "";
				if(rdMale.isSelected()) gender = rdMale.getText();
				else gender = rdFemale.getText();
				
				lblMsg.setText(gender);
			}
		});
		//종료버튼
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		//취미출력버튼
		btnHobby.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Hobby = "";
				if(ckHobby1.isSelected()) Hobby += ckHobby1.getText();
				if(ckHobby2.isSelected()) Hobby += ckHobby2.getText();
				if(ckHobby3.isSelected()) Hobby += ckHobby3.getText();
				if(ckHobby4.isSelected()) Hobby += ckHobby4.getText();
				lblMsg.setText("선택하신 취미는: "+Hobby);
				JOptionPane.showMessageDialog(null, lblMsg.getText());
			}
		});
		
	}
	public static void main(String[] args) {
		new T4_Radio_CheckBox();
	}
}
