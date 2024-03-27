package t7_WindowBuilder;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JPasswordField;

public class Test2_TextField extends JFrame {

	private JPanel contentPane;
	private JTextField txtMid;
	private JTextField txtName;
	private JTextField txtAge;
	private JPasswordField txtPwd;
	private String regAge = "^[0-9]+$";

	

	public Test2_TextField() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		//윈도우창 종료버튼 활성화
		setBounds(100, 100, 784, 535);
		setLocationRelativeTo(null);   	//윈도우창 프레임을 가운데에 위치시키기
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		setResizable(false);
		JPanel pn1 = new JPanel();
		pn1.setBackground(new Color(255, 255, 0));
		pn1.setForeground(new Color(255, 255, 0));
		pn1.setBounds(12, 10, 705, 95);
		contentPane.add(pn1);
		pn1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("회원가입");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(60, 10, 565, 63);
		pn1.add(lblNewLabel);
		
		JPanel pn2 = new JPanel();
		pn2.setBackground(new Color(0, 255, 0));
		pn2.setBounds(12, 115, 705, 216);
		contentPane.add(pn2);
		pn2.setLayout(null);
		
		JLabel lblMid = new JLabel("아이디");
		lblMid.setFont(new Font("굴림", Font.PLAIN, 16));
		lblMid.setHorizontalAlignment(SwingConstants.CENTER);
		lblMid.setBounds(35, 10, 115, 34);
		pn2.add(lblMid);
		
		txtMid = new JTextField();
		txtMid.setBounds(173, 10, 484, 34);
		pn2.add(txtMid);
		txtMid.setColumns(10);
		
		JLabel lblPwd = new JLabel("비밀번호");
		lblPwd.setHorizontalAlignment(SwingConstants.CENTER);
		lblPwd.setFont(new Font("굴림", Font.PLAIN, 16));
		lblPwd.setBounds(35, 54, 115, 34);
		pn2.add(lblPwd);
		
		JLabel lblName = new JLabel("성명");
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		lblName.setFont(new Font("굴림", Font.PLAIN, 16));
		lblName.setBounds(35, 98, 115, 34);
		pn2.add(lblName);
		
		txtName = new JTextField();
		txtName.setColumns(10);
		txtName.setBounds(173, 98, 484, 34);
		pn2.add(txtName);
		
		JButton btnReset = new JButton("다시입력");
		JButton btnExit = new JButton("종료");
		btnExit.setIcon(new ImageIcon(Test2_TextField.class.getResource("/t7_WindowBuilder/images/15.jpg")));
		JButton btnSubmit = new JButton("회원가입");
		
		JLabel lblAge = new JLabel("나이");
		lblAge.setHorizontalAlignment(SwingConstants.CENTER);
		lblAge.setFont(new Font("굴림", Font.PLAIN, 16));
		lblAge.setBounds(35, 142, 115, 34);
		pn2.add(lblAge);
		
		txtAge = new JTextField();
		txtAge.setColumns(10);
		txtAge.setBounds(173, 142, 484, 34);
		pn2.add(txtAge);
		
		txtPwd = new JPasswordField();
		txtPwd.setBounds(173, 54, 484, 34);
		pn2.add(txtPwd);
		JLabel lblImage = new JLabel("");
		lblImage.setHorizontalAlignment(SwingConstants.CENTER);
//		lblImage.setIcon(new ImageIcon("D:\\javaclass\\java\\works\\j0325_AWT_Swing_WindowBuilder\\myImages\\1.png"));
		lblImage.setIcon(new ImageIcon("./myImages/1.png"));
//		lblImage.setIcon(new ImageIcon(Test2.class.getResource("../..//myImages/1.png")));
		lblImage.setBounds(0, 0, 705, 216);
		pn2.add(lblImage);
		
//		------------위쪽은 UI-------------아래쪽은 메소드설정---------------------------------------------
		JPanel pn3 = new JPanel();
		pn3.setBackground(new Color(0, 128, 255));
		pn3.setBounds(12, 341, 705, 104);
		contentPane.add(pn3);
		pn3.setLayout(null);
		
		//회원가입 버튼 설정
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtMid.getText().trim().equals(""))
				{
					JOptionPane.showMessageDialog(null, "아이디를 입력하세요");
					txtMid.requestFocus();
				}
				else if(txtPwd.getText().trim().equals(""))
				{
					JOptionPane.showMessageDialog(null, "비밀번호를 입력하세요");
					txtPwd.requestFocus();
				}
				else if(txtName.getText().trim().equals(""))
				{
					JOptionPane.showMessageDialog(null, "성명을 입력하세요");
					txtName.requestFocus();
				}
//				else if(txtAge.getText().trim().equals(""))
//				{
//					JOptionPane.showMessageDialog(null, "나이를 입력하세요");
//					txtAge.requestFocus();
//				}
				else if(!Pattern.matches(regAge, txtAge.getText().trim()))
				{
					JOptionPane.showMessageDialog(null, "나이는 숫자만 입력 가능합니다.");
					txtAge.setText("");
					txtAge.requestFocus();
				}
				else 
				{
					JOptionPane.showMessageDialog(null, "회원가입완료");
				}
			}
		});
		btnSubmit.setBounds(44, 24, 191, 50);
		pn3.add(btnSubmit);
		
		//다시입력 버튼
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtMid.setText("");
				txtPwd.setText("");
				txtName.setText("");
				txtAge.setText("");
				txtMid.requestFocus();
			}
		});
		btnReset.setBounds(263, 24, 191, 50);
		pn3.add(btnReset);
		
		//종료 버튼
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(479, 24, 191, 50);
		pn3.add(btnExit);
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Test2_TextField frame = new Test2_TextField();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
