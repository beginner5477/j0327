package t7_WindowBuilder;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class Test3_Image extends JFrame{
	JLabel lblCount;
	int img1Cnt = 0,img2Cnt = 0,img3Cnt = 0,img4Cnt = 0;
	private JLabel lblImg1, lblImg2, lblImg3, lblImg4;
	public Test3_Image() {
		super("카드 횟수 맞추기");
		setSize(812,625);
		
		JPanel pn1 = new JPanel();
		pn1.setBounds(12, 10, 760, 39);
		getContentPane().add(pn1);
		pn1.setLayout(null);
		
		JButton btnTotal = new JButton("모두보기");
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				allDispaly();
				img1Cnt++;
				img2Cnt++;
				img3Cnt++;
				img4Cnt++;
				dispCount();
			}
		});
		btnTotal.setBounds(0, 0, 94, 39);
		pn1.add(btnTotal);
		
		JButton btn1 = new JButton("1번보기");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblImg1.setVisible(true);
				lblImg2.setVisible(false);
				lblImg3.setVisible(false);
				lblImg4.setVisible(false);
				img1Cnt++;
				dispCount();
			}
		});
		btn1.setBounds(93, 0, 94, 39);
		pn1.add(btn1);
		
		JButton btn2 = new JButton("2번보기");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblImg1.setVisible(false);
				lblImg2.setVisible(true);
				lblImg3.setVisible(false);
				lblImg4.setVisible(false);
				img2Cnt++;
				dispCount();
			}
		});
		btn2.setBounds(188, 0, 116, 39);
		pn1.add(btn2);
		
		JButton btn3 = new JButton("3번보기");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblImg1.setVisible(false);
				lblImg2.setVisible(false);
				lblImg3.setVisible(true);
				lblImg4.setVisible(false);
				img3Cnt++;
				dispCount();
			}
		});
		btn3.setBounds(305, 0, 116, 39);
		pn1.add(btn3);
		
		JButton btn4 = new JButton("4번보기");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblImg1.setVisible(false);
				lblImg2.setVisible(false);
				lblImg3.setVisible(false);
				lblImg4.setVisible(true);
				img4Cnt++;
				dispCount();
			}
		});
		btn4.setBounds(419, 0, 101, 39);
		pn1.add(btn4);
		
		JButton btnRandom = new JButton("랜덤보기");
		btnRandom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblImg1.setVisible(false);
				lblImg2.setVisible(false);
				lblImg3.setVisible(false);
				lblImg4.setVisible(false);
				int ran = (int)(Math.random()*4) +1;
				switch(ran)
				{
					case 1:
						lblImg1.setVisible(true);
						img1Cnt++;
						break;
					case 2:
						lblImg2.setVisible(true);
						img2Cnt++;
						break;
					case 3:
						lblImg3.setVisible(true);
						img3Cnt++;
						break;
					case 4:
						lblImg4.setVisible(true);
						img4Cnt++;
						break;
				}
				dispCount();
			}
		});
		btnRandom.setBounds(521, 0, 81, 39);
		pn1.add(btnRandom);
		
		JButton btnClose = new JButton("모두닫기");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				allClose();
			}
		});
		btnClose.setBounds(603, 0, 81, 39);
		pn1.add(btnClose);
		
		JButton btnExit = new JButton("종료");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(684, 0, 76, 39);
		pn1.add(btnExit);
		
		JPanel pn3 = new JPanel();
		pn3.setBounds(12, 512, 760, 39);
		getContentPane().add(pn3);
		pn3.setLayout(null);
		
		lblCount = new JLabel("1번:0, 2번:0, 3번:0, 4번:0");
		lblCount.setHorizontalAlignment(SwingConstants.CENTER);
		lblCount.setForeground(new Color(255, 0, 255));
		lblCount.setFont(new Font("궁서", Font.BOLD, 22));
		lblCount.setBounds(12, 10, 736, 29);
		pn3.add(lblCount);
		
		//============================================================================
		JPanel pn2 = new JPanel();
		pn2.setBounds(12, 59, 760, 443);
		getContentPane().add(pn2);
		pn2.setLayout(null);
		
		lblImg1 = new JLabel("");
		lblImg1.setIcon(new ImageIcon(Test3_Image.class.getResource("/t7_WindowBuilder/images/11.png")));
		lblImg1.setBounds(-1, 10, 201, 433);
		pn2.add(lblImg1);
		lblImg1.setVisible(false);
		
		lblImg2 = new JLabel("");
		lblImg2.setIcon(new ImageIcon(Test3_Image.class.getResource("/t7_WindowBuilder/images/13.png")));
		lblImg2.setBounds(212, 10, 209, 433);
		pn2.add(lblImg2);
		lblImg2.setVisible(false);
		
		lblImg3 = new JLabel("");
		lblImg3.setIcon(new ImageIcon(Test3_Image.class.getResource("/t7_WindowBuilder/images/15.jpg")));
		lblImg3.setBounds(426, 10, 144, 433);
		pn2.add(lblImg3);
		lblImg3.setVisible(false);
		
		lblImg4 = new JLabel("");
		lblImg4.setIcon(new ImageIcon(Test3_Image.class.getResource("/t7_WindowBuilder/images/16.gif")));
		lblImg4.setBounds(582, 10, 166, 433);
		pn2.add(lblImg4);
		lblImg4.setVisible(false);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		getContentPane().setLayout(null);
	}
	protected void dispCount() {
		lblCount.setText("1번:"+img1Cnt+", 2번:"+img2Cnt+", 3번:"+img3Cnt+", 4번:"+img4Cnt);
	}
	protected void allClose() {
		lblImg1.setVisible(false);
		lblImg2.setVisible(false);
		lblImg3.setVisible(false);
		lblImg4.setVisible(false);
	}
	protected void allDispaly() {
		lblImg1.setVisible(true);
		lblImg2.setVisible(true);
		lblImg3.setVisible(true);
		lblImg4.setVisible(true);
	}
	public static void main(String[] args) {
		new Test3_Image();
	}
}
