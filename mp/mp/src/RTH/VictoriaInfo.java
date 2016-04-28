package RTH;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class VictoriaInfo {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void appear() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VictoriaInfo window = new VictoriaInfo();
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
	public VictoriaInfo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.WHITE);
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(VictoriaInfo.class.getResource("/Images/Logo.jpg")));
		frame.setBounds(100, 100, 800 , 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		final JLabel lblVictoriaS = new JLabel("Victoria S. , The Gypsy");
		lblVictoriaS.setFont(new Font("Diablo", Font.ITALIC, 35));
		lblVictoriaS.setBounds(140, 11, 495, 53);
		frame.getContentPane().add(lblVictoriaS);
		
		final JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				NewGame ng = new NewGame();
				ng.appear();
				frame.dispose();
			}
		});
		btnBack.setFont(new Font("Diablo", Font.ITALIC, 15));
		btnBack.setForeground(Color.WHITE);
		btnBack.setBackground(Color.DARK_GRAY);
		btnBack.setBounds(10, 504, 89, 46);
		frame.getContentPane().add(btnBack);
		
		final JButton btnConfirm = new JButton("CONFIRM");
		btnConfirm.setFont(new Font("Diablo", Font.ITALIC, 15));
		btnConfirm.setForeground(Color.WHITE);
		btnConfirm.setBackground(Color.DARK_GRAY);
		btnConfirm.setBounds(665, 504, 109, 46);
		frame.getContentPane().add(btnConfirm);
		
		final JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(VictoriaInfo.class.getResource("/Images/Gypsy.jpg")));
		lblNewLabel.setBounds(41, 74, 184, 400);
		frame.getContentPane().add(lblNewLabel);
		
		final JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(VictoriaInfo.class.getResource("/Images/GypsyInfo.jpg")));
		lblNewLabel_1.setBounds(271, 92, 298, 364);
		frame.getContentPane().add(lblNewLabel_1);
		
		final JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(VictoriaInfo.class.getResource("/Images/f_Gypsy.gif")));
		lblNewLabel_2.setBounds(632, 271, 38, 100);
		frame.getContentPane().add(lblNewLabel_2);
	}
}
