package t7_WindowBuilder;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.JTextArea;

public class T5_combo_ListBox_점검요 extends JFrame{
	JComboBox comboJob;
	
	public T5_combo_ListBox_점검요() {
		super("콤보상자연습");
		setSize(600,500);
		getContentPane().setLayout(null);
		
	
		JList listJob2 = new JList();
		listJob2.setModel(new AbstractListModel() {
			String[] values = new String[] {"학생", "군인", "한의사", "회계사", "공무원", "프로그래머", "강사", "교수", "역무원", "건설노동자", "기타"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		JList listJob = new JList();
		listJob.setModel(new AbstractListModel() {
			String[] values = new String[] {"학생", "군인", "한의사", "회계사", "공무원", "프로그래머", "강사", "교수", "역무원", "건설노동자", "기타"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		JPanel pn4 = new JPanel();
		pn4.setBounds(12, 382, 560, 69);
		getContentPane().add(pn4);
		pn4.setLayout(null);
		
		JLabel lblMsg = new JLabel("출력메세지");
		lblMsg.setHorizontalAlignment(SwingConstants.CENTER);
		lblMsg.setBounds(0, 0, 548, 59);
		pn4.add(lblMsg);
		
		JPanel pn3 = new JPanel();
		pn3.setBounds(12, 337, 560, 45);
		getContentPane().add(pn3);
		pn3.setLayout(null);
		
		JButton btnCombo = new JButton("콤보출력");
		//콤보 출력 버튼 설정
		btnCombo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String msg = comboJob.getSelectedItem().toString() + "("+comboJob.getSelectedIndex()+")";
				lblMsg.setText(msg);
			}
		});
		btnCombo.setBounds(12, 0, 145, 35);
		pn3.add(btnCombo);
		
		JButton btnExit = new JButton("종료");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(439, 0, 97, 35);
		pn3.add(btnExit);
		
		JButton btnList1 = new JButton("리스트상자출력1");
		btnList1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String msg = "";
//				Object[] jobs = listJob.getSelectedValues();
				Object[] jobs = listJob.getSelectedValuesList().toArray();
				for(Object job:jobs)
				{
					msg += job + "/";
				}
				msg = msg.substring(0,msg.length()-1);
				
				lblMsg.setText(msg);
			}
		});
		btnList1.setBounds(158, 0, 123, 35);
		pn3.add(btnList1);
		
		
		
		JPanel pn1 = new JPanel();
		pn1.setBounds(0, 0, 281, 337);
		getContentPane().add(pn1);
		pn1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("직업을 선택하세요");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 281, 53);
		pn1.add(lblNewLabel);
		
		comboJob = new JComboBox();
		comboJob.setModel(new DefaultComboBoxModel(new String[] {"학생", "회사원", "군인", "건설일용직", "의사", "운전수", "공무원", "가사도우미", "청소원"}));
		comboJob.setBounds(10, 48, 259, 28);
		pn1.add(comboJob);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(20, 86, 249, 241);
		pn1.add(scrollPane_1);
		
		JTextArea textArea = new JTextArea();
		scrollPane_1.setViewportView(textArea);
		
		JPanel pn2 = new JPanel();
		pn2.setBounds(291, 0, 281, 337);
		getContentPane().add(pn2);
		pn2.setLayout(null);
		
		
		listJob.setBounds(12, 10, 257, 94);
		pn2.add(listJob);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 124, 257, 94);
		pn2.add(scrollPane);
		JButton btnList2 = new JButton("리스트상자출력2");
		btnList2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnList2.setBounds(292, 0, 123, 35);
		pn3.add(btnList2);
		
		scrollPane.setViewportView(listJob2);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		
	}
	public static void main(String[] args) {
		new T5_combo_ListBox_점검요();
	}
}
