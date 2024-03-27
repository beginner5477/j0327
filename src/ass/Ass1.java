package ass;
 
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
 
public class Ass1 extends JFrame{
    int cnt = 0, cnt1 = 0,cnt2 = 0,cnt3 = 0,cnt4 = 0,cnt5 = 0,cnt6 = 0,cnt7 = 0,cnt8 = 0,cnt9 = 0;
    String[] imgs = {"/t7_WindowBuilder/images/12.png","/t8_insa/images/15.jpg","/t8_insa/images/16.gif",
            "/t7_WindowBuilder/images/14.png","/t7_WindowBuilder/images/12.png","/t8_insa/images/15.jpg",
            "/t8_insa/images/16.gif","/t7_WindowBuilder/images/14.png"};
    int[] img = {0,1,2,3,4,5,6,7};
    public Ass1() {
        super("카드 맞추기 게임");
        setSize(600, 500);
        getContentPane().setLayout(null);
        
        JPanel pn1 = new JPanel();
        pn1.setBounds(12, 10, 560, 37);
        getContentPane().add(pn1);
        pn1.setLayout(null);
        
        JLabel lblNewLabel = new JLabel("카드 맞추기 게임");
        lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 24));
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setBounds(0, 0, 560, 37);
        pn1.add(lblNewLabel);
        
        JPanel pn2 = new JPanel();
        pn2.setBounds(12, 57, 560, 339);
        getContentPane().add(pn2);
        pn2.setLayout(null);
        
        JButton btn1 = new JButton("New button");
        btn1.setIcon(new ImageIcon(Ass1.class.getResource("/t7_WindowBuilder/images/12.png")));
        btn1.setBounds(45, 60, 83, 79);
        pn2.add(btn1);
        
        JButton btn11 = new JButton("New button");
        
        btn11.setBounds(173, 60, 83, 79);
        btn11.setIcon(new ImageIcon(Ass1.class.getResource("/t7_WindowBuilder/images/12.png")));
        pn2.add(btn11);
        
        JButton btn2 = new JButton("New button");
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(cnt2 == 0) btn2.setIcon(null);
                else if(cnt2 == 1) btn2.setIcon(new ImageIcon(Ass1.class.getResource(imgs[img[2]])));
                if(cnt2 == 0) cnt2 = 1;
                else if(cnt2 == 1) cnt2 = 0;
            }
        });
        btn2.setIcon(new ImageIcon(Ass1.class.getResource("/t8_insa/images/15.jpg")));
        btn2.setBounds(301, 60, 83, 79);
        pn2.add(btn2);
        
        JButton btn22 = new JButton("New button");
        btn22.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(cnt3 == 0) btn22.setIcon(null);
                else if(cnt3 == 1) btn22.setIcon(new ImageIcon(Ass1.class.getResource(imgs[img[3]])));
                if(cnt3 == 0) cnt3 = 1;
                else if(cnt3 == 1) cnt3 = 0;
            }
        });
        btn22.setIcon(new ImageIcon(Ass1.class.getResource("/t8_insa/images/15.jpg")));
        btn22.setBounds(429, 60, 83, 79);
        pn2.add(btn22);
        
        JButton btn3 = new JButton("New button");
        btn3.setIcon(new ImageIcon(Ass1.class.getResource("/t8_insa/images/16.gif")));
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(cnt4 == 0) btn3.setIcon(null);
                else if(cnt4 == 1) btn3.setIcon(new ImageIcon(Ass1.class.getResource(imgs[img[4]])));
                if(cnt4 == 0) cnt4 = 1;
                else if(cnt4 == 1) cnt4 = 0;
            }
        });
        btn3.setBounds(45, 199, 83, 79);
        pn2.add(btn3);
        
        JButton btn33 = new JButton("New button");
        btn33.setIcon(new ImageIcon(Ass1.class.getResource("/t8_insa/images/16.gif")));
        btn33.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(cnt5 == 0) btn33.setIcon(null);
                else if(cnt5 == 1) btn33.setIcon(new ImageIcon(Ass1.class.getResource(imgs[img[5]])));
                if(cnt5 == 0) cnt5 = 1;
                else if(cnt5 == 1) cnt5 = 0;
            }
        });
        btn33.setBounds(173, 199, 83, 79);
        pn2.add(btn33);
        
        JButton btn4 = new JButton("New button");
        btn4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(cnt6 == 0) btn4.setIcon(null);
                else if(cnt6 == 1) btn4.setIcon(new ImageIcon(Ass1.class.getResource(imgs[img[6]])));
                if(cnt6 == 0) cnt6 = 1;
                else if(cnt6 == 1) cnt6 = 0;
            }
        });
        btn4.setIcon(new ImageIcon(Ass1.class.getResource("/t7_WindowBuilder/images/14.png")));
        btn4.setBounds(301, 199, 83, 79);
        pn2.add(btn4);
        
        JButton btn44 = new JButton("New button");
        btn44.setIcon(new ImageIcon(Ass1.class.getResource("/t8_insa/images/14.png")));
        btn44.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(cnt7 == 0) btn44.setIcon(null);
                else if(cnt7 == 1) btn44.setIcon(new ImageIcon(Ass1.class.getResource(imgs[img[7]])));
                if(cnt7 == 0) cnt7 = 1;
                else if(cnt7 == 1) cnt7 = 0;
            }
        });
        btn44.setBounds(429, 199, 83, 79);
        pn2.add(btn44);
        btn1.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                if(cnt == 0) btn1.setIcon(null);
                else if(cnt == 1) btn1.setIcon(new ImageIcon(Ass1.class.getResource(imgs[img[0]])));
                if(cnt == 0) cnt = 1;
                else if(cnt == 1) cnt = 0;
            }
        });
        btn11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(cnt1 == 0) btn11.setIcon(null);
                else if(cnt1 == 1) btn11.setIcon(new ImageIcon(Ass1.class.getResource(imgs[img[1]])));
                if(cnt1 == 0) cnt1 = 1;
                else if(cnt == 1) cnt1 = 0;
            }
        });
        JPanel pn3 = new JPanel();
        pn3.setBounds(12, 406, 560, 45);
        getContentPane().add(pn3);
        pn3.setLayout(null);
        
        JButton btnBack = new JButton("전체 뒤집기");
        btnBack.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btn1.setIcon(new ImageIcon(Ass1.class.getResource(imgs[img[0]])));
                btn11.setIcon(new ImageIcon(Ass1.class.getResource(imgs[img[1]])));
                btn2.setIcon(new ImageIcon(Ass1.class.getResource(imgs[img[2]])));
                btn22.setIcon(new ImageIcon(Ass1.class.getResource(imgs[img[3]])));
                btn3.setIcon(new ImageIcon(Ass1.class.getResource(imgs[img[4]])));
                btn33.setIcon(new ImageIcon(Ass1.class.getResource(imgs[img[5]])));
                btn4.setIcon(new ImageIcon(Ass1.class.getResource(imgs[img[6]])));
                btn44.setIcon(new ImageIcon(Ass1.class.getResource(imgs[img[7]])));
                cnt1 = 0;
                cnt2 = 0;
                cnt3 = 0;
                cnt4 = 0;
                cnt5 = 0;
                cnt6 = 0;
                cnt7 = 0;
                cnt8 = 0;
            }
        });
        btnBack.setBounds(0, 0, 138, 45);
        pn3.add(btnBack);
        
        JButton btnBack_1 = new JButton("카드 섞기");
        btnBack_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
//                "/t7_WindowBuilder/images/12.png"
//                "/t8_insa/images/15.jpg"
//                "/t8_insa/images/16.gif"
//                "/t7_WindowBuilder/images/14.png"
                for(int i = 0; i < 8; i++)
                {
                    img[i] = (int)(Math.random()*8);
                    for(int j = 0; j < i; j++)
                    {
                        if(img[j] == img[i])
                        {
                            i--;
                            break;
                        }
                    }
                }
                btn1.setIcon(new ImageIcon(Ass1.class.getResource(imgs[img[0]])));
                btn11.setIcon(new ImageIcon(Ass1.class.getResource(imgs[img[1]])));
                btn2.setIcon(new ImageIcon(Ass1.class.getResource(imgs[img[2]])));
                btn22.setIcon(new ImageIcon(Ass1.class.getResource(imgs[img[3]])));
                btn3.setIcon(new ImageIcon(Ass1.class.getResource(imgs[img[4]])));
                btn33.setIcon(new ImageIcon(Ass1.class.getResource(imgs[img[5]])));
                btn4.setIcon(new ImageIcon(Ass1.class.getResource(imgs[img[6]])));
                btn44.setIcon(new ImageIcon(Ass1.class.getResource(imgs[img[7]])));
                
                try {
					Thread.sleep(500);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
                
                cnt1 = 1;
                cnt2 = 1;
                cnt3 = 1;
                cnt4 = 1;
                cnt5 = 1;
                cnt6 = 1;
                cnt7 = 1;
                cnt8 = 1;
                btn1.setIcon(null);
                btn11.setIcon(null);
                btn2.setIcon(null);
                btn22.setIcon(null);
                btn3.setIcon(null);
                btn33.setIcon(null);
                btn4.setIcon(null);
                btn44.setIcon(null);
            }
        });
        btnBack_1.setBounds(171, 0, 138, 45);
        pn3.add(btnBack_1);
        
        JButton btnNewButton = new JButton("종료");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        btnNewButton.setBounds(340, 0, 208, 45);
        pn3.add(btnNewButton);
        
        setVisible(true);
    }
    public static void main(String[] args) {
        new Ass1();
    }
}
 