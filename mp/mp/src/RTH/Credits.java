package RTH;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;

public class Credits {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void appear() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Credits window = new Credits();
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
	public Credits() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\acer\\Documents\\Eclipse\\MP\\Resource\\Images\\GroupPic.jpg"));
		lblNewLabel.setBounds(10, 127, 764, 304);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblGroupNameJavanessa = new JLabel("Javanessa Hudgens");
		lblGroupNameJavanessa.setForeground(Color.WHITE);
		lblGroupNameJavanessa.setFont(new Font("Diablo", Font.PLAIN, 40));
		lblGroupNameJavanessa.setBounds(182, 62, 592, 38);
		frame.getContentPane().add(lblGroupNameJavanessa);
		
		JLabel lblNewLabel_1 = new JLabel("Leader: Loven Sindol");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Diablo", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(250, 473, 303, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Members: Pau Sauco");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Diablo", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(235, 491, 226, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Alexander Alvero III");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Diablo", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(334, 505, 250, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Pamela Arabit");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Diablo", Font.PLAIN, 18));
		lblNewLabel_4.setBounds(334, 521, 226, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\acer\\Documents\\Eclipse\\MP\\Resource\\Images\\MainMenuBg.jpg"));
		lblNewLabel_5.setBounds(0, 0, 784, 562);
		frame.getContentPane().add(lblNewLabel_5);
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
