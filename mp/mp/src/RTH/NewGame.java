package RTH;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class NewGame {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void appear() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewGame window = new NewGame();
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
	public NewGame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(NewGame.class.getResource("/Images/Logo.jpg")));
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblPleaseChooseA = new JLabel("Please Choose A Character :");
		lblPleaseChooseA.setBackground(Color.WHITE);
		lblPleaseChooseA.setFont(new Font("Diablo", Font.ITALIC, 28));
		lblPleaseChooseA.setBounds(132, 11, 500, 52);
		frame.getContentPane().add(lblPleaseChooseA);
		
		JButton btnAlice = new JButton("Alice , The Arch Bishop");
		btnAlice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				AliceInfo al = new AliceInfo();
				al.appear();
				frame.dispose();
			}
		});
		btnAlice.setFont(new Font("Diablo", Font.ITALIC, 11));
		btnAlice.setForeground(Color.WHITE);
		btnAlice.setBackground(Color.DARK_GRAY);
		btnAlice.setBounds(10, 487, 184, 63);
		frame.getContentPane().add(btnAlice);
		
		JButton btnThana = new JButton("Thana , Soul Linker");
		btnThana.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
			 ThanaInfo th = new ThanaInfo();
			 th.appear();
			 frame.dispose();
			}
		});
		btnThana.setFont(new Font("Diablo", Font.ITALIC, 11));
		btnThana.setForeground(Color.WHITE);
		btnThana.setBackground(Color.DARK_GRAY);
		btnThana.setBounds(398, 487, 184, 63);
		frame.getContentPane().add(btnThana);
		
		JButton btnHarry = new JButton("Harry , The Warlock");
		btnHarry.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				HarryInfo ha = new HarryInfo();
				ha.appear();
				frame.dispose();
			}
		});
		btnHarry.setFont(new Font("Diablo", Font.ITALIC, 11));
		btnHarry.setForeground(Color.WHITE);
		btnHarry.setBackground(Color.DARK_GRAY);
		btnHarry.setBounds(204, 487, 184, 63);
		frame.getContentPane().add(btnHarry);
		
		JButton btnVictoria = new JButton("Victoria S.,The Gypsy");
		btnVictoria.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				VictoriaInfo vi = new VictoriaInfo();
				vi.appear();
				frame.dispose();
			}
		});
		btnVictoria.setFont(new Font("Diablo", Font.ITALIC, 11));
		btnVictoria.setForeground(Color.WHITE);
		btnVictoria.setBackground(Color.DARK_GRAY);
		btnVictoria.setBounds(590, 487, 184, 63);
		frame.getContentPane().add(btnVictoria);
		
		final JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(NewGame.class.getResource("/Images/CharArch.jpg")));
		lblNewLabel.setBounds(10, 76, 184, 400);
		frame.getContentPane().add(lblNewLabel);
		
		final JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(NewGame.class.getResource("/Images/Warlock.jpg")));
		lblNewLabel_1.setBounds(204, 74, 184, 400);
		frame.getContentPane().add(lblNewLabel_1);
		
		final JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(NewGame.class.getResource("/Images/CharSoul.jpg")));
		lblNewLabel_2.setBounds(398, 74, 184, 400);
		frame.getContentPane().add(lblNewLabel_2);
		
		final JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon(NewGame.class.getResource("/Images/Gypsy.jpg")));
		lblNewLabel_3.setBounds(590, 76, 184, 400);
		frame.getContentPane().add(lblNewLabel_3);
		
		final JButton btnBack = new JButton("Back");
		btnBack.setForeground(Color.WHITE);
		btnBack.setBackground(Color.DARK_GRAY);
		btnBack.setFont(new Font("Diablo", Font.ITALIC, 15));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				MainMenu mm = new MainMenu();
				mm.appear();
				frame.dispose();
			}
		});
		btnBack.setBounds(685, 11, 89, 33);
		frame.getContentPane().add(btnBack);
	}
}
