package t7_WindowBuilder;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class P1 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	public static void main(String[] args) {
				new P1();
	}
	public P1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 645, 441);
		contentPane = new JPanel();

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitle = new JLabel("회원가입");
		lblTitle.setFont(new Font("굴림", Font.BOLD, 28));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setBounds(94, 10, 426, 43);
		contentPane.add(lblTitle);
		
		JLabel lblName = new JLabel("성명");
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		lblName.setFont(new Font("굴림", Font.PLAIN, 18));
		lblName.setBounds(60, 73, 133, 31);
		contentPane.add(lblName);
		
		JLabel kor = new JLabel("국어");
		kor.setHorizontalAlignment(SwingConstants.CENTER);
		kor.setFont(new Font("굴림", Font.PLAIN, 18));
		kor.setBounds(60, 124, 133, 31);
		contentPane.add(kor);
		
		JLabel mat = new JLabel("수학");
		mat.setHorizontalAlignment(SwingConstants.CENTER);
		mat.setFont(new Font("굴림", Font.PLAIN, 18));
		mat.setBounds(60, 232, 133, 31);
		contentPane.add(mat);
		
		JLabel eng = new JLabel("영어");
		eng.setHorizontalAlignment(SwingConstants.CENTER);
		eng.setFont(new Font("굴림", Font.PLAIN, 18));
		eng.setBounds(60, 176, 133, 31);
		contentPane.add(eng);
		
		textField = new JTextField();
		textField.setBounds(216, 73, 317, 31);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(216, 124, 317, 31);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(216, 176, 317, 31);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(216, 232, 317, 31);
		contentPane.add(textField_3);
		
		JButton btnNewButton = new JButton("입력");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(94, 300, 126, 73);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("재입력");
		btnNewButton_1.setBounds(258, 300, 126, 73);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("종료");
		btnNewButton_2.setBounds(427, 300, 126, 73);
		contentPane.add(btnNewButton_2);
		setVisible(true);
		
		//재입력 버튼
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField.requestFocus();
			}
		});
		//종료버튼
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ans = JOptionPane.showConfirmDialog(null, "종료하시겠습니까?", "종료선택창", JOptionPane.YES_NO_OPTION);
				if(ans == 0)
				{
					JOptionPane.showMessageDialog(null, "종료되었습니다.");
					System.exit(0);
				}
				else JOptionPane.showMessageDialog(null, "계속합니다.")	;	
			}
		});
		
		
		
		
	}
}
