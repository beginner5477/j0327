package t8_insa;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;
import java.util.regex.Pattern;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class Insa2List extends JFrame{
	private Vector title,vData;
	private JTextField txtCondition;
	private final ButtonGroup btnGroupGender = new ButtonGroup();
	private JTable table;
	private DefaultTableModel dtm;
	private JScrollPane scrollPane;
	Insa2DAO dao = new Insa2DAO();
	private JButton btnCondition,btnList,btnExit,btnIpsailDesc, btnIpsailAsc;
	private JComboBox cbCondition;
	private JRadioButton rdMale,rdFemale;
	
	public Insa2List() {
		super("전체조회하기");
		setSize(800,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		getContentPane().setLayout(null);
		
		JPanel pn1 = new JPanel();
		pn1.setBounds(12, 10, 760, 50);
		getContentPane().add(pn1);
		pn1.setLayout(null);
		
		btnCondition = new JButton("조건 검색");
		
		btnCondition.setFont(new Font("굴림", Font.PLAIN, 15));
		btnCondition.setBounds(331, 0, 123, 50);
		pn1.add(btnCondition);
		
		btnList = new JButton("전체 검색");
		
		btnList.setFont(new Font("굴림", Font.PLAIN, 15));
		btnList.setBounds(474, 0, 123, 50);
		pn1.add(btnList);
		
		btnExit = new JButton("종료");
		
		btnExit.setFont(new Font("굴림", Font.PLAIN, 15));
		btnExit.setBounds(617, 0, 123, 50);
		pn1.add(btnExit);
		
		txtCondition = new JTextField();
		txtCondition.setBounds(168, 0, 143, 50);
		pn1.add(txtCondition);
		txtCondition.setColumns(10);
		
		cbCondition = new JComboBox();
		cbCondition.setFont(new Font("굴림", Font.PLAIN, 15));
		cbCondition.setModel(new DefaultComboBoxModel(new String[] {"성명", "성별", "나이", "입사일"}));
		cbCondition.setBounds(20, 0, 128, 50);
		pn1.add(cbCondition);
		
		JPanel pn2 = new JPanel();
		pn2.setBounds(12, 65, 760, 433);
		getContentPane().add(pn2);
		pn2.setLayout(null);
		
//		JScrollPane scrollPane = new JScrollPane();
		
//		pn2.add(scrollPane);
		
//		table = new JTable();
//		scrollPane.setViewportView(table);
		
		JPanel pn3 = new JPanel();
		pn3.setBounds(12, 501, 760, 50);
		getContentPane().add(pn3);
		pn3.setLayout(null);
		
		rdMale = new JRadioButton("남자");
		btnGroupGender.add(rdMale);
		rdMale.setHorizontalAlignment(SwingConstants.CENTER);
		rdMale.setBounds(8, 6, 136, 38);
		pn3.add(rdMale);
		
		rdFemale = new JRadioButton("여자");
		btnGroupGender.add(rdFemale);
		rdFemale.setHorizontalAlignment(SwingConstants.CENTER);
		rdFemale.setBounds(148, 6, 136, 38);
		pn3.add(rdFemale);
		
		btnIpsailAsc = new JButton("입사일 오름차순");
		
		btnIpsailAsc.setBounds(319, 10, 143, 23);
		pn3.add(btnIpsailAsc);
		
		btnIpsailDesc = new JButton("입사일 내림차순");
		
		btnIpsailDesc.setBounds(502, 14, 143, 23);
		pn3.add(btnIpsailDesc);
		
		//JTable설계
		title = new Vector<>();
		title.add("번호");
		title.add("성명");
		title.add("나이");
		title.add("성별");
		title.add("입사일");
		
		vData = dao.getInsaList("","");
		dtm = new DefaultTableModel(vData, title);
		table = new JTable(dtm);
		table.setRowSorter(new TableRowSorter(dtm));
		
		scrollPane = new JScrollPane(table);
		scrollPane.setBounds(12, 10, 736, 413);
		pn2.add(scrollPane);
		
//		=================위쪽은 UI생성=========아래쪽은 메소드생성=======================================
		
		//종료버튼
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new Insa2Main();
			}
		});
		//입사일 오름차순
		btnIpsailAsc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vData = dao.getInsaList("ipsail","a");
				dtm.setDataVector(vData, title);
			}
		});
		//입사일 내림차순
		btnIpsailDesc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vData = dao.getInsaList("ipsail","d");
				dtm.setDataVector(vData, title);
			}
		});
		//조건 검색 엔터키로 작동시키기
		btnCondition.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				String cbCondi = cbCondition.getSelectedItem().toString();
				String txtCondi = txtCondition.getText();
				if(txtCondi.trim().equals("")) {
					JOptionPane.showMessageDialog(null, "검색할 내용을 입력하세요!");
					txtCondition.requestFocus();
					return;
				}
				
				if(cbCondi.equals("성명")) vData = dao.getConditionSearch("name",txtCondi);
				else if(cbCondi.equals("나이")) {
					if(!Pattern.matches("^[0-9]+$", txtCondi)) {
						JOptionPane.showMessageDialog(null, "나이는 숫자로 입력하세요");
						txtCondition.requestFocus();
					}
					else vData = dao.getConditionSearch("age",txtCondi);
				}
				else if(cbCondi.equals("성별")) vData = dao.getConditionSearch("gender",txtCondi);
				else if(cbCondi.equals("입사일")) vData = dao.getConditionSearch("ipsail",txtCondi);
				
				dtm.setDataVector(vData, title);
			}
		});
		//조건 검색버튼
		btnCondition.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cbCondi = cbCondition.getSelectedItem().toString();
				String txtCondi = txtCondition.getText();
				if(txtCondi.trim().equals("")) {
					JOptionPane.showMessageDialog(null, "검색할 내용을 입력하세요!");
					txtCondition.requestFocus();
					return;
				}
				
				if(cbCondi.equals("성명")) vData = dao.getConditionSearch("name",txtCondi);
				else if(cbCondi.equals("나이")) {
					if(!Pattern.matches("^[0-9]+$", txtCondi)) {
						JOptionPane.showMessageDialog(null, "나이는 숫자로 입력하세요");
						txtCondition.requestFocus();
					}
					else vData = dao.getConditionSearch("age",txtCondi);
				}
				else if(cbCondi.equals("성별")) vData = dao.getConditionSearch("gender",txtCondi);
				else if(cbCondi.equals("입사일")) vData = dao.getConditionSearch("ipsail",txtCondi);
				
				dtm.setDataVector(vData, title);
			}});
		//전체 검색 엔터키로 누르기 
		btnList.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				vData = dao.getInsaList("", "");
				dtm.setDataVector(vData, title);
			}
		});
		//전체 검색
		btnList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vData = dao.getInsaList("", "");
				dtm.setDataVector(vData, title);
			}
		});
		
		setVisible(true);
	}
//	public static void main(String[] args) {
//		new Insa2List();
//	}
}
