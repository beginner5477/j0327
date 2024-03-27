package t8_insa;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;

public class Insa2Main extends JFrame{
	JButton btnSearch, btnInput, btnList, btnExit;
	public Insa2Main() {
		super("인사관리메뉴");
		setSize(800,600);
		getContentPane().setLayout(null);
		
		JPanel pn1 = new JPanel();
		pn1.setBounds(12, 10, 760, 67);
		getContentPane().add(pn1);
		pn1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("인사관리 프로그램v1.0");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 39));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 760, 67);
		pn1.add(lblNewLabel);
		
		JPanel pn2 = new JPanel();
		pn2.setBounds(12, 87, 760, 387);
		getContentPane().add(pn2);
		pn2.setLayout(null);
		
		JLabel lblMainImage = new JLabel("");
		lblMainImage.setIcon(new ImageIcon(Insa2Main.class.getResource("/t8_insa/images/13.png")));
		lblMainImage.setHorizontalAlignment(SwingConstants.CENTER);
		lblMainImage.setBounds(0, 0, 760, 387);
		pn2.add(lblMainImage);
		
		JPanel pn3 = new JPanel();
		pn3.setBounds(12, 484, 760, 67);
		getContentPane().add(pn3);
		pn3.setLayout(null);
		
		btnInput = new JButton("사원등록");
		
		btnInput.setFont(new Font("굴림", Font.PLAIN, 18));
		btnInput.setBounds(28, 10, 155, 47);
		pn3.add(btnInput);
		
		btnSearch = new JButton("개별조회");
		
		btnSearch.setFont(new Font("굴림", Font.PLAIN, 18));
		btnSearch.setBounds(211, 10, 155, 47);
		pn3.add(btnSearch);
		
		btnList = new JButton("전체조회");
		
		btnList.setFont(new Font("굴림", Font.PLAIN, 18));
		btnList.setBounds(394, 10, 155, 47);
		pn3.add(btnList);
		
		btnExit = new JButton("종료");
	
		btnExit.setFont(new Font("굴림", Font.PLAIN, 18));
		btnExit.setBounds(577, 10, 155, 47);
		pn3.add(btnExit);
		
		
		//사원등록버튼을 엔터키로 누를시 수행
		btnInput.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				dispose();
				new Insa2Input();
			}
		});
		//사원등록버튼
		btnInput.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new Insa2Input();
			}
		});
		//개별조회버튼 엔터로 누를시
		btnSearch.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				String name = JOptionPane.showInputDialog("검색할 성명을 입력하세요.");
				Insa2DAO dao = new Insa2DAO();
				Insa2VO vo = dao.getNameSearch(name);
				if(vo.getName() == null) JOptionPane.showMessageDialog(null, "검색된 회원이 없습니다.");
				else {
					dispose();
					new Insa2Search(vo);
				}
				dao.connClose();
			}
		});
		//개별조회버튼
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = JOptionPane.showInputDialog("검색할 성명을 입력하세요.");
				Insa2DAO dao = new Insa2DAO();
				Insa2VO vo = dao.getNameSearch(name);
				if(vo.getName() == null) JOptionPane.showMessageDialog(null, "검색된 회원이 없습니다.");
				else {
					dispose();
					new Insa2Search(vo);
				}
				dao.connClose();
			}
		});
		//전체조회버튼
		btnList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new Insa2List();
			}
		});
		//종료버튼 엔터누를시
		btnExit.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				System.exit(0);
			}
		});
		//종료버튼
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		setVisible(true);
	}
	public static void main(String[] args) {
		new Insa2Main();
	}
}
