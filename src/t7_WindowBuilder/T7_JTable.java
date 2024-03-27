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
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableRowSorter;

import t8_insa.Insa2DAO;
import t8_insa.Insa2VO;

public class T7_JTable extends JFrame{
	private JTable table;
	private Vector title,vData;
	private DefaultTableModel dtm;
	private JScrollPane scrollPane;
	private JLabel lblMessage; 
	Insa2DAO dao = new Insa2DAO();
	public T7_JTable() {
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
		
		lblMessage = new JLabel("J테이블에서 선택된 값을 출력합니다.");
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
		//테이블의 내용을 행(타이틀)이름으로 정렬(오름차순/내림차순)하고자 한다면??
		table.setRowSorter(new TableRowSorter(dtm));
		//5.자료가 담긴 JTable을 JScrollPane객체 생성시에 함께 담아서 생성해준다.
		scrollPane = new JScrollPane(table);
		scrollPane.setBounds(12, 10, 460, 165);
		pn2.add(scrollPane);
		//6.출력 결과를 확인한다.
		/*JTable 속성 제어하기*/
		//table의 컬럼크기 설정, 컬럼 위치 고정
		table.getColumnModel().getColumn(0).setMaxWidth(50);
		table.getColumnModel().getColumn(2).setMaxWidth(50);
		table.getColumnModel().getColumn(3).setMaxWidth(50);
		table.getColumnModel().getColumn(0).setResizable(false);
		table.getColumnModel().getColumn(2).setResizable(false);
		table.getTableHeader().setReorderingAllowed(false);
		//테이블셀안의 내용 정렬하기
		DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer();
		dtcr.setHorizontalAlignment(SwingConstants.CENTER);
		TableColumnModel tcm = table.getColumnModel();
		tcm.getColumn(3).setCellRenderer(dtcr);
		//전체셀 가운데 정렬...
		for(int i = 0; i < tcm.getColumnCount(); i++)
		{
			tcm.getColumn(i).setCellRenderer(dtcr);
		}
//		=================위는 UI생성 아래는 메소드================================================
		//종료버튼 마우스 클릭
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		//J테이블에서 선택한 값 출력하기 버튼
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int row = table.getSelectedRow();
				int column = table.getSelectedColumn();
//				if(row < 0)
//				{
//					JOptionPane.showMessageDialog(null, "셀을 선택후 버튼을 눌러주세용");
//				}
//				else {
//					System.out.println("선택된 행 인덱스 번호: "+row);
//					System.out.println("선택된 열 인덱스 번호: "+column);
//				}
				if(row != -1)
				{
//					lblMessage.setText(table.getValueAt(row, column)+"");
					//선택된 행의 모든 정보를 메세지창에 띄우세요.
					String ans = table.getValueAt(row, 1)+"";
					Insa2VO vo = dao.getNameSearch(ans);
					System.out.println(vo);
				}
			}
		});
		setVisible(true);
	}
	public static void main(String[] args) {
		new T7_JTable();
	}
}
