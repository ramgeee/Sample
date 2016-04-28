package RTH;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.awt.Font;
import java.awt.Color;

public class ThanaMap {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	
	public static void appear() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ThanaMap window = new ThanaMap();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			
			}
		});
	}


	/**
	 * Create the application.
	 */
	public ThanaMap() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(AliceMap.class.getResource("/Images/Logo.jpg")));
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		final JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(AliceMap.class.getResource("/Images/Title2.png")));
		lblNewLabel.setBounds(10, 42, 250, 150);
		frame.getContentPane().add(lblNewLabel);
		
		final JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(AliceMap.class.getResource("/Images/Design3.png")));
		lblNewLabel_1.setBounds(10, 188, 250, 63);
		frame.getContentPane().add(lblNewLabel_1);
		
		final JButton btnCircle1 = new JButton("");
		btnCircle1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ThanaFight1 t1 = new ThanaFight1();
				t1.appear();
				frame.dispose();
			}
		});
		btnCircle1.setIcon(new ImageIcon(AliceMap.class.getResource("/Images/Circle1.png")));
		btnCircle1.setBounds(316, 11, 250, 125);
		btnCircle1.setBackground(null);
		btnCircle1.setContentAreaFilled(false);
		btnCircle1.setBorderPainted(false);
		btnCircle1.setFocusPainted(false);
		frame.getContentPane().add(btnCircle1);
		
		final JButton btnCircle2 = new JButton("");
		btnCircle2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ThanaFight2 t2 = new ThanaFight2();
				t2.appear();
				frame.dispose();
				}
		});
		btnCircle2.setIcon(new ImageIcon(AliceMap.class.getResource("/Images/Circle2.png")));
		btnCircle2.setBounds(332, 125, 223, 70);
		btnCircle2.setBackground(null);
		btnCircle2.setContentAreaFilled(false);
		btnCircle2.setBorderPainted(false);
		btnCircle2.setFocusPainted(false);
		frame.getContentPane().add(btnCircle2);
		
		final JButton btnCircle3 = new JButton("");
		btnCircle3.setIcon(new ImageIcon(AliceMap.class.getResource("/Images/Circle3.png")));
		btnCircle3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ThanaFight3 t3 = new ThanaFight3();
				t3.appear();
				frame.dispose();
			}
		});
		btnCircle3.setBounds(347, 195, 200, 59);
		btnCircle3.setBackground(null);
		btnCircle3.setContentAreaFilled(false);
		btnCircle3.setBorderPainted(false);
		btnCircle3.setFocusPainted(false);
		frame.getContentPane().add(btnCircle3);
		
		final JButton btnCircle4 = new JButton("");
		btnCircle4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ThanaFight4 t4 = new ThanaFight4();
				t4.appear();
				frame.dispose();
			}
		});
		btnCircle4.setIcon(new ImageIcon(AliceMap.class.getResource("/Images/Circle4.png")));
		btnCircle4.setBounds(362, 255, 171, 51);
		btnCircle4.setBackground(null);
		btnCircle4.setContentAreaFilled(false);
		btnCircle4.setBorderPainted(false);
		btnCircle4.setFocusPainted(false);
		frame.getContentPane().add(btnCircle4);
		
		final JButton btnCircle5 = new JButton("");
		btnCircle5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ThanaFight5 t5 = new ThanaFight5();
				t5.appear();
				frame.dispose();
			}
		});
		btnCircle5.setIcon(new ImageIcon(AliceMap.class.getResource("/Images/Circle5.png")));
		btnCircle5.setBounds(368, 306, 153, 56);
		btnCircle5.setBackground(null);
		btnCircle5.setContentAreaFilled(false);
		btnCircle5.setBorderPainted(false);
		btnCircle5.setFocusPainted(false);
		frame.getContentPane().add(btnCircle5);
		
		final JButton btnCircle6 = new JButton("");
		btnCircle6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ThanaFight6 t6 = new ThanaFight6();
				t6.appear();
				frame.dispose();
			}
		});
		btnCircle6.setIcon(new ImageIcon(AliceMap.class.getResource("/Images/Circle6.png")));
		btnCircle6.setBounds(378, 359, 135, 56);
		btnCircle6.setBackground(null);
		btnCircle6.setContentAreaFilled(false);
		btnCircle6.setBorderPainted(false);
		btnCircle6.setFocusPainted(false);
		frame.getContentPane().add(btnCircle6);
		
		final JButton btnCircle7 = new JButton("");
		btnCircle7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ThanaFight7 t7 = new ThanaFight7();
				t7.appear();
				frame.dispose();
			}
		});
		btnCircle7.setIcon(new ImageIcon(AliceMap.class.getResource("/Images/Circle7.png")));
		btnCircle7.setBounds(388, 418, 114, 44);
		btnCircle7.setBackground(null);
		btnCircle7.setContentAreaFilled(false);
		btnCircle7.setBorderPainted(false);
		btnCircle7.setFocusPainted(false);
		frame.getContentPane().add(btnCircle7);
		
		final JButton btnCircle8 = new JButton("");
		btnCircle8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ThanaFight8 t8 = new ThanaFight8();
				t8.appear();
				frame.dispose();
			}
		});
		btnCircle8.setIcon(new ImageIcon(AliceMap.class.getResource("/Images/Circle8.png")));
		btnCircle8.setBounds(398, 463, 96, 34);
		btnCircle8.setBackground(null);
		btnCircle8.setContentAreaFilled(false);
		btnCircle8.setBorderPainted(false);
		btnCircle8.setFocusPainted(false);
		frame.getContentPane().add(btnCircle8);
		
		final JButton btnCircle9 = new JButton("");
		btnCircle9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ThanaFight9 t9 = new ThanaFight9();
				t9.appear();
				frame.dispose();
			}
		});
		btnCircle9.setIcon(new ImageIcon(AliceMap.class.getResource("/Images/Circle9.png")));
		btnCircle9.setBounds(403, 509, 86, 52);
		btnCircle9.setBackground(null);
		btnCircle9.setContentAreaFilled(false);
		btnCircle9.setBorderPainted(false);
		btnCircle9.setFocusPainted(false);
		frame.getContentPane().add(btnCircle9);
		
		final JLabel lblCircle1Name = new JLabel("");
		lblCircle1Name.setIcon(new ImageIcon(AliceMap.class.getResource("/Images/Limbo.png")));
		lblCircle1Name.setBounds(576, 79, 186, 23);
		frame.getContentPane().add(lblCircle1Name);
		
		final JLabel lblCircle2Name = new JLabel("");
		lblCircle2Name.setIcon(new ImageIcon(AliceMap.class.getResource("/Images/Lust.png")));
		lblCircle2Name.setBounds(576, 151, 186, 23);
		frame.getContentPane().add(lblCircle2Name);
		
		final JLabel lbCircle3Name = new JLabel("");
		lbCircle3Name.setIcon(new ImageIcon(AliceMap.class.getResource("/Images/Gluttony.png")));
		lbCircle3Name.setBounds(576, 212, 183, 23);
		frame.getContentPane().add(lbCircle3Name);
		
		final JLabel lblCircle4Name = new JLabel("");
		lblCircle4Name.setIcon(new ImageIcon(AliceMap.class.getResource("/Images/Greed.png")));
		lblCircle4Name.setBounds(576, 267, 183, 23);
		frame.getContentPane().add(lblCircle4Name);
		
		final JLabel lblCircle5Name = new JLabel("");
		lblCircle5Name.setIcon(new ImageIcon(AliceMap.class.getResource("/Images/Anger.png")));
		lblCircle5Name.setBounds(576, 327, 183, 23);
		frame.getContentPane().add(lblCircle5Name);
		
		final JLabel lblCircle6Name = new JLabel("");
		lblCircle6Name.setIcon(new ImageIcon(AliceMap.class.getResource("/Images/Heresy.png")));
		lblCircle6Name.setBounds(576, 382, 183, 26);
		frame.getContentPane().add(lblCircle6Name);
		
		final JLabel lblCircle7Name = new JLabel("");
		lblCircle7Name.setIcon(new ImageIcon(AliceMap.class.getResource("/Images/Violence.png")));
		lblCircle7Name.setBounds(576, 427, 183, 26);
		frame.getContentPane().add(lblCircle7Name);
		
		final JLabel lblCircle8Name = new JLabel("");
		lblCircle8Name.setIcon(new ImageIcon(AliceMap.class.getResource("/Images/Fraud.png")));
		lblCircle8Name.setBounds(576, 470, 183, 23);
		frame.getContentPane().add(lblCircle8Name);
		
		final JLabel lblCircle9Name = new JLabel("");
		lblCircle9Name.setIcon(new ImageIcon(AliceMap.class.getResource("/Images/Treachery.png")));
		lblCircle9Name.setBounds(576, 509, 183, 23);
		frame.getContentPane().add(lblCircle9Name);
		
		JButton btnBack = new JButton("Exit");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MainMenu mm = new MainMenu();
				mm.appear();
				frame.dispose();
			}
		});
		btnBack.setBackground(Color.DARK_GRAY);
		btnBack.setForeground(Color.WHITE);
		btnBack.setFont(new Font("Diablo", Font.ITALIC, 15));
		btnBack.setBounds(10, 509, 89, 23);
		frame.getContentPane().add(btnBack);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(AliceMap.class.getResource("/Images/old-paper.jpg")));
		lblNewLabel_2.setBounds(0, 0, 800, 600);
		frame.getContentPane().add(lblNewLabel_2);
		
		
		
	}
}
