package RTH;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.ImageIcon;

public class AliceInfo {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void appear() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AliceInfo window = new AliceInfo();
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
	public AliceInfo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setForeground(Color.WHITE);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(AliceInfo.class.getResource("/Images/Logo.jpg")));
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		final JLabel lblTittle = new JLabel("Alice , The Arch Bishop");
		lblTittle.setFont(new Font("Diablo", Font.ITALIC, 35));
		lblTittle.setBounds(137, 11, 517, 53);
		frame.getContentPane().add(lblTittle);
		
		final JButton btnBack = new JButton("BACK");
		btnBack.setForeground(Color.WHITE);
		btnBack.setBackground(Color.DARK_GRAY);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				NewGame ng = new NewGame();
				ng.appear();
				frame.dispose();
				
			}
		});
		btnBack.setFont(new Font("Diablo", Font.ITALIC, 15));
		btnBack.setBounds(10, 504, 89, 46);
		frame.getContentPane().add(btnBack);
		
		final JButton btnConfirm = new JButton("CONFIRM");
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AliceMap am = new AliceMap();
				am.appear();
				frame.dispose();
;			}
		});
		btnConfirm.setForeground(Color.WHITE);
		btnConfirm.setBackground(Color.DARK_GRAY);
		btnConfirm.setFont(new Font("Diablo", Font.ITALIC, 15));
		btnConfirm.setBounds(665, 504, 109, 46);
		frame.getContentPane().add(btnConfirm);
		
		final JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(AliceInfo.class.getResource("/Images/CharArch.jpg")));
		lblNewLabel.setBounds(41, 74, 184, 400);
		frame.getContentPane().add(lblNewLabel);
		
		final JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(AliceInfo.class.getResource("/Images/ArchBishopInfo.jpg")));
		lblNewLabel_2.setBounds(271, 92, 298, 364);
		frame.getContentPane().add(lblNewLabel_2);
		
		final JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(AliceInfo.class.getResource("/Images/ArcBishop_f_front_skill.gif")));
		lblNewLabel_1.setBounds(632, 271, 100, 112);
		frame.getContentPane().add(lblNewLabel_1);
	}
}
