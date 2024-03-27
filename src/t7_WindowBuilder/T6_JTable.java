package t7_WindowBuilder;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import t8_insa.Insa2DAO;

public class T6_JTable extends JFrame{
	private JTable table;
	private Vector title,vData;
	private DefaultTableModel dtm;
	private JScrollPane scrollPane;
	Insa2DAO dao = new Insa2DAO();
	public T6_JTable() {
		super("JTable연습");
		setSize(500,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		getContentPane().setLayout(null);
		
		JPanel pn1 = new JPanel();
		pn1.setBounds(0, 0, 484, 36);
		getContentPane().add(pn1);
		pn1.setLayout(null);
		
		JButton btnExit = new JButton("종료");
		btnExit.setFont(new Font("굴림", Font.PLAIN, 15));
		
		
		JButton btnPrint = new JButton("선택셀값출력");
		btnPrint.setFont(new Font("굴림", Font.PLAIN, 15));
		btnPrint.setBounds(0, 0, 135, 36);
		pn1.add(btnPrint);
		btnExit.setBounds(349, 0, 135, 36);
		pn1.add(btnExit);
		
		JPanel pn2 = new JPanel();
		pn2.setBounds(0, 42, 484, 175);
		getContentPane().add(pn2);
		pn2.setLayout(null);
		
//		table = new JTable();
//		scrollPane.setViewportView(table);
		
		JPanel pn3 = new JPanel();
		pn3.setBounds(0, 222, 484, 36);
		getContentPane().add(pn3);
		pn3.setLayout(null);
		
		JLabel lblMessage = new JLabel("J테이블에서 선택된 값을 출력합니다.");
		lblMessage.setHorizontalAlignment(SwingConstants.CENTER);
		lblMessage.setBounds(0, 0, 484, 36);
		pn3.add(lblMessage);
		/*아래로 JTable설계하기*/
		//JTable제작시는 '부제목'과 '데이터'를 설계하여 Vector 타입으로 준비한다.
		
		//1.'부제목'을 Vector에 저장
		title = new Vector<>();
		title.add("번호");
		title.add("성명");
		title.add("나이");
		title.add("성별");
		title.add("입사일");
		//2.'데이터'를 Vector타입으로 준비 데이터는 데이터베이스에서 가져온다.
		vData = dao.getInsaList("","");
		//3.DB에서 가져온 자료와(vData)와 타이틀(title)을 DefaultTableModel객체를 생성하면서 담아준다.
		dtm = new DefaultTableModel(vData,title);
		//4.DefaultTableModel을 JTable생성시에 담아준다.
		table = new JTable(dtm);
		//5.자료가 담긴 JTable을 JScrollPane객체 생성시에 함께 담아서 생성해준다.
		scrollPane = new JScrollPane(table);
		scrollPane.setBounds(12, 10, 460, 165);
		pn2.add(scrollPane);
//		=================위는 UI생성 아래는 메소드================================================
		//종료버튼 마우스 클릭
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		setVisible(true);
	}
	public static void main(String[] args) {
		new T6_JTable();
	}
}
