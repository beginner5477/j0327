package t8_insa;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;

public class Insa2Input extends JFrame{
	private JTextField txtName;
	private JTextField txtAge;
	private final ButtonGroup btnGroupGender = new ButtonGroup();
	Insa2DAO dao = new Insa2DAO();
	Insa2VO vo = null;
	int res = 0;
	JRadioButton rdMale, rdFemale;
	JComboBox cbYY, cbMM, cbDD;
	public Insa2Input() {
		super("회원가입창");
		setSize(800,600);
		getContentPane().setLayout(null);
		
		JPanel pn1 = new JPanel();
		pn1.setBounds(12, 10, 760, 55);
		getContentPane().add(pn1);
		pn1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("회원가입창");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 35));
		lblNewLabel.setBounds(0, 0, 760, 55);
		pn1.add(lblNewLabel);
		
		JPanel pn2 = new JPanel();
		pn2.setBounds(12, 75, 760, 411);
		getContentPane().add(pn2);
		pn2.setLayout(null);
		
		JLabel lblName = new JLabel("성명");
		lblName.setFont(new Font("굴림", Font.PLAIN, 20));
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		lblName.setBounds(80, 47, 172, 44);
		pn2.add(lblName);
		
		JLabel lblAge = new JLabel("나이");
		lblAge.setHorizontalAlignment(SwingConstants.CENTER);
		lblAge.setFont(new Font("굴림", Font.PLAIN, 20));
		lblAge.setBounds(80, 138, 172, 44);
		pn2.add(lblAge);
		
		JLabel lblGender = new JLabel("성별");
		lblGender.setHorizontalAlignment(SwingConstants.CENTER);
		lblGender.setFont(new Font("굴림", Font.PLAIN, 20));
		lblGender.setBounds(80, 229, 172, 44);
		pn2.add(lblGender);
		
		JLabel lblIpsail = new JLabel("입사일");
		lblIpsail.setHorizontalAlignment(SwingConstants.CENTER);
		lblIpsail.setFont(new Font("굴림", Font.PLAIN, 20));
		lblIpsail.setBounds(80, 320, 172, 44);
		pn2.add(lblIpsail);
		
		txtName = new JTextField();
		txtName.setHorizontalAlignment(SwingConstants.CENTER);
		txtName.setBounds(260, 47, 410, 44);
		pn2.add(txtName);
		txtName.setColumns(10);
		
		txtAge = new JTextField();
		txtAge.setHorizontalAlignment(SwingConstants.CENTER);
		txtAge.setColumns(10);
		txtAge.setBounds(260, 138, 410, 44);
		pn2.add(txtAge);
		
		rdMale = new JRadioButton("남자");
		btnGroupGender.add(rdMale);
		rdMale.setFont(new Font("굴림", Font.PLAIN, 18));
		rdMale.setHorizontalAlignment(SwingConstants.CENTER);
		rdMale.setBounds(245, 225, 208, 55);
		pn2.add(rdMale);
		
		rdFemale = new JRadioButton("여자");
		btnGroupGender.add(rdFemale);
		rdFemale.setSelected(true);
		rdFemale.setHorizontalAlignment(SwingConstants.CENTER);
		rdFemale.setFont(new Font("굴림", Font.PLAIN, 18));
		rdFemale.setBounds(483, 229, 208, 55);
		pn2.add(rdFemale);
		
		
		//년도 월 일 초기값 생성하기
		String[] yy = new String[25];
		String[] mm = new String[12];
		String[] dd = new String[31];
		
		int imsi = 0;
		for(int i = 0; i < yy.length; i++)
		{
			imsi = 2024 - i;
			yy[i] = imsi + "";
		}
		for(int i = 0; i < mm.length; i++)
		{
			mm[i] = (i+1) + "";
		}
		for(int i = 0; i < dd.length; i++)
		{
			dd[i] = (i+1) + "";
		}
		cbYY = new JComboBox(yy);
		cbYY.setFont(new Font("굴림", Font.PLAIN, 18));
		cbYY.setBounds(260, 320, 96, 31);
		pn2.add(cbYY);
		
		cbMM = new JComboBox(mm);
		cbMM.setFont(new Font("굴림", Font.PLAIN, 18));
		cbMM.setBounds(413, 320, 96, 31);
		pn2.add(cbMM);
		
		cbDD = new JComboBox(dd);
		cbDD.setFont(new Font("굴림", Font.PLAIN, 18));
		cbDD.setBounds(574, 320, 96, 31);
		pn2.add(cbDD);
		
		JLabel lblNewLabel_2 = new JLabel("년");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(357, 320, 57, 31);
		pn2.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("월");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setBounds(510, 320, 57, 31);
		pn2.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("일");
		lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2.setBounds(670, 320, 57, 31);
		pn2.add(lblNewLabel_2_2);
		
		JPanel pn3 = new JPanel();
		pn3.setBounds(12, 496, 760, 55);
		getContentPane().add(pn3);
		pn3.setLayout(null);
		
		JButton btnInput = new JButton("가입하기");
		btnInput.setBounds(25, 10, 219, 35);
		pn3.add(btnInput);
		
		JButton btnReset = new JButton("다시입력");
		
		btnReset.setBounds(269, 10, 219, 35);
		pn3.add(btnReset);
		
		JButton btnClose = new JButton("창닫기");
		btnClose.setBounds(513, 10, 219, 35);
		pn3.add(btnClose);
		setLocationRelativeTo(null);
		
		//오늘날짜 가져와서 가입화면에 보여주기
		Insa2Service service = new Insa2Service();
		vo = service.getDefaultDate();
		cbYY.setSelectedItem(vo.getCbYY());
		cbMM.setSelectedItem(vo.getCbMM());
		cbDD.setSelectedItem(vo.getCbDD());
//		==============================================================================================
		
		//회원가입버튼을 키보드 엔터키를 눌렀을때 수행처리
		btnInput.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				setinsaInput();
			}
		});
		//회원가입버튼을 마우스로 클릭했을때 수행처리
		btnInput.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setinsaInput();
			}
		});
		
		//다시입력버튼
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtName.setText("");
				txtAge.setText("");
				txtName.requestFocus();
			}
		});
		
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new Insa2Main();
			}
		});
		setVisible(true);
	}
	//회원가입처리를 위한 유효성 검사 메소드
	protected void setinsaInput() {
		String name = txtName.getText().trim();
		String age = txtAge.getText().trim();
		String gender = "";
		String ipsail = cbYY.getSelectedItem()+"-"+cbMM.getSelectedItem()+"-"+cbDD.getSelectedItem();
		
		//유효성 검사
		if(name.equals(""))
		{
			JOptionPane.showMessageDialog(null, "성명을 입력하세요");
			txtName.requestFocus();
		}
		else if(!Pattern.matches("^[0-9]+$", age))
		{
			JOptionPane.showMessageDialog(null, "나이는 숫자만 입력가능합니다.");
			txtAge.requestFocus();
		}
		else {
			if(rdMale.isSelected()) gender = "남자";
			else gender = "여자";
		}
		
		//모든체크가 끝나면 DB에 새로운 회원을 넣는다
		//회원명 중복처리
		vo = dao.getNameSearch(name);
		if(vo.getName() != null) {
			JOptionPane.showMessageDialog(null, "이미 가입된 회원입니다 다른 성명을 입력해주세요.");
			txtName.requestFocus();
		}
		else {
			vo.setName(name);
			vo.setAge(Integer.parseInt(age));
			vo.setGender(gender);
			vo.setIpsail(ipsail);
			res = dao.setInsaInput(vo);
			if(res != 0)
			{
				JOptionPane.showMessageDialog(null, "회원가입 완료");
				dispose();
				new Insa2Main();
			}
			else {
				JOptionPane.showMessageDialog(null, "회원가입 실패");
				txtName.requestFocus();
			}
		}
	}
	public static void main(String[] args) {
		new Insa2Input();
	}
}
