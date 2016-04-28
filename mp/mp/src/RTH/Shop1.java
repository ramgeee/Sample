package RTH;

import java.awt.EventQueue;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JButton;

import java.awt.Toolkit;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.UIManager;

public class Shop1 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void appear() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Shop1 window = new Shop1();
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
	public Shop1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblShopName = new JLabel("Shop (Alice)");
		lblShopName.setFont(new Font("Diablo", Font.ITALIC, 30));
		lblShopName.setBounds(162, 11, 217, 52);
		frame.getContentPane().add(lblShopName);
		
		JLabel lblOrgin = new JLabel("Stone of Orgins");
		lblOrgin.setFont(new Font("Diablo", Font.ITALIC, 14));
		lblOrgin.setBounds(4, 88, 148, 23);
		frame.getContentPane().add(lblOrgin);
		
		JButton btnNewButton = new JButton("50");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.DARK_GRAY);
		btnNewButton.setFont(new Font("Diablo", Font.PLAIN, 11));
		btnNewButton.setBounds(162, 89, 82, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Midas' Heart");
		lblNewLabel.setFont(new Font("Diablo", Font.ITALIC, 14));
		lblNewLabel.setBounds(20, 148, 109, 31);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblI = new JLabel("Info: a rare stone that said \r\nto came from a mysterious meteor\r\n");
		lblI.setFont(new Font("Diablo", Font.ITALIC, 10));
		lblI.setBounds(10, 98, 414, 39);
		frame.getContentPane().add(lblI);
		
		JLabel lblIncreasesAllOf = new JLabel("Increases all of your base stats by 1.5%");
		lblIncreasesAllOf.setFont(new Font("Diablo", Font.PLAIN, 10));
		lblIncreasesAllOf.setBounds(10, 112, 271, 31);
		frame.getContentPane().add(lblIncreasesAllOf);
		
		JButton btnNewButton_1 = new JButton("100");
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBackground(Color.DARK_GRAY);
		btnNewButton_1.setFont(new Font("Diablo", Font.PLAIN, 11));
		btnNewButton_1.setBounds(162, 153, 82, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("Info: Extrated heart of King Midas");
		lblNewLabel_1.setFont(new Font("Diablo", Font.ITALIC, 10));
		lblNewLabel_1.setBounds(10, 163, 234, 39);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblIncreasesMaxHealth = new JLabel("Increases max health and base attack by 3.5%");
		lblIncreasesMaxHealth.setFont(new Font("Diablo", Font.PLAIN, 10));
		lblIncreasesMaxHealth.setBounds(10, 181, 296, 31);
		frame.getContentPane().add(lblIncreasesMaxHealth);
		
		JLabel lblNewLabel_2 = new JLabel("Ruby of Cleopatra");
		lblNewLabel_2.setFont(new Font("Diablo", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(10, 268, 200, 50);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton_2 = new JButton("100");
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.setBackground(Color.DARK_GRAY);
		btnNewButton_2.setFont(new Font("Diablo", Font.PLAIN, 11));
		btnNewButton_2.setBounds(175, 283, 82, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel_3 = new JLabel("Info: Ruined gem of once great queen, now imbuned with corrupted lust");
		lblNewLabel_3.setFont(new Font("Diablo", Font.PLAIN, 10));
		lblNewLabel_3.setBounds(10, 300, 473, 39);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Reduces damage of Demons by 180,000 for 3 turns");
		lblNewLabel_4.setFont(new Font("Diablo", Font.PLAIN, 10));
		lblNewLabel_4.setBounds(10, 321, 322, 31);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Lamp of Homer");
		lblNewLabel_5.setFont(new Font("Diablo", Font.PLAIN, 14));
		lblNewLabel_5.setBounds(10, 329, 200, 50);
		frame.getContentPane().add(lblNewLabel_5);
		
		JButton btnNewButton_3 = new JButton("100");
		btnNewButton_3.setFont(new Font("Diablo", Font.PLAIN, 11));
		btnNewButton_3.setBounds(136, 344, 82, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		JLabel lblNewLabel_6 = new JLabel("Info: Lamp used by Homer in his descent in Hell, now glowing with life");
		lblNewLabel_6.setFont(new Font("Diablo", Font.PLAIN, 10));
		lblNewLabel_6.setBounds(10, 357, 445, 39);
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Restores health by 200,000");
		lblNewLabel_7.setFont(new Font("Diablo", Font.PLAIN, 10));
		lblNewLabel_7.setBounds(10, 378, 200, 31);
		frame.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Pope's lost cross");
		lblNewLabel_8.setFont(new Font("Diablo", Font.PLAIN, 14));
		lblNewLabel_8.setBounds(10, 392, 200, 39);
		frame.getContentPane().add(lblNewLabel_8);
		
		JButton btnNewButton_4 = new JButton("100");
		btnNewButton_4.setFont(new Font("Diablo", Font.PLAIN, 11));
		btnNewButton_4.setBounds(162, 401, 82, 23);
		frame.getContentPane().add(btnNewButton_4);
		
		JLabel lblNewLabel_9 = new JLabel("Info: Cross of an unamed Pope, full of lost prayers");
		lblNewLabel_9.setFont(new Font("Diablo", Font.PLAIN, 10));
		lblNewLabel_9.setBounds(10, 419, 333, 39);
		frame.getContentPane().add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Deals 250,000 damage to Demons \r\n");
		lblNewLabel_10.setFont(new Font("Diablo", Font.PLAIN, 10));
		lblNewLabel_10.setBounds(10, 442, 224, 31);
		frame.getContentPane().add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Active Items");
		lblNewLabel_11.setFont(new Font("Diablo", Font.PLAIN, 30));
		lblNewLabel_11.setBounds(162, 223, 261, 50);
		frame.getContentPane().add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Ptolemy's watch");
		lblNewLabel_12.setFont(new Font("Diablo", Font.PLAIN, 14));
		lblNewLabel_12.setBounds(10, 469, 200, 31);
		frame.getContentPane().add(lblNewLabel_12);
		
		JButton btnNewButton_5 = new JButton("100");
		btnNewButton_5.setFont(new Font("Diablo", Font.PLAIN, 11));
		btnNewButton_5.setBounds(162, 469, 82, 23);
		frame.getContentPane().add(btnNewButton_5);
		
		JLabel lblNewLabel_13 = new JLabel("Info: Pocket watch of Ptolemy, radiating with immense magic");
		lblNewLabel_13.setFont(new Font("Diablo", Font.PLAIN, 10));
		lblNewLabel_13.setBounds(10, 479, 414, 50);
		frame.getContentPane().add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("Reduces cooldowns by 1");
		lblNewLabel_14.setFont(new Font("Diablo", Font.PLAIN, 10));
		lblNewLabel_14.setBounds(10, 509, 234, 31);
		frame.getContentPane().add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("Prayers of Hope");
		lblNewLabel_15.setFont(new Font("Diablo", Font.PLAIN, 14));
		lblNewLabel_15.setBounds(496, 74, 200, 50);
		frame.getContentPane().add(lblNewLabel_15);
		
		JButton btnNewButton_6 = new JButton("100");
		btnNewButton_6.setFont(new Font("Diablo", Font.PLAIN, 11));
		btnNewButton_6.setBounds(640, 78, 134, 39);
		frame.getContentPane().add(btnNewButton_6);
		
		JLabel lblNewLabel_16 = new JLabel("Info: Prayers which sings about Hope");
		lblNewLabel_16.setFont(new Font("Diablo", Font.PLAIN, 10));
		lblNewLabel_16.setBounds(496, 112, 255, 31);
		frame.getContentPane().add(lblNewLabel_16);
		
		JLabel lblNewLabel_17 = new JLabel("Increases Adoramus damage by 100,000");
		lblNewLabel_17.setFont(new Font("Diablo", Font.PLAIN, 10));
		lblNewLabel_17.setBounds(496, 130, 255, 32);
		frame.getContentPane().add(lblNewLabel_17);
		
		JLabel lblNewLabel_18 = new JLabel("Prayers of Life");
		lblNewLabel_18.setFont(new Font("Diablo", Font.PLAIN, 14));
		lblNewLabel_18.setBounds(496, 148, 200, 50);
		frame.getContentPane().add(lblNewLabel_18);
		
		JButton btnNewButton_7 = new JButton("100");
		btnNewButton_7.setFont(new Font("Diablo", Font.PLAIN, 11));
		btnNewButton_7.setBounds(640, 156, 134, 39);
		frame.getContentPane().add(btnNewButton_7);
		
		JLabel lblNewLabel_19 = new JLabel("Info: Prayers that worship life");
		lblNewLabel_19.setFont(new Font("Diablo", Font.PLAIN, 10));
		lblNewLabel_19.setBounds(496, 189, 200, 31);
		frame.getContentPane().add(lblNewLabel_19);
		
		JLabel lblNewLabel_20 = new JLabel("Increase Highness Heal by 100,000");
		lblNewLabel_20.setFont(new Font("Diablo", Font.PLAIN, 10));
		lblNewLabel_20.setBounds(496, 206, 224, 31);
		frame.getContentPane().add(lblNewLabel_20);
		
		JLabel lblNewLabel_21 = new JLabel("Prayers of Piety");
		lblNewLabel_21.setFont(new Font("Diablo", Font.PLAIN, 14));
		lblNewLabel_21.setBounds(496, 223, 148, 50);
		frame.getContentPane().add(lblNewLabel_21);
		
		JButton btnNewButton_8 = new JButton("100");
		btnNewButton_8.setFont(new Font("Diablo", Font.PLAIN, 11));
		btnNewButton_8.setBounds(640, 233, 134, 39);
		frame.getContentPane().add(btnNewButton_8);
		
		JLabel lblNewLabel_22 = new JLabel("Info: Prayers that gives devotion to God");
		lblNewLabel_22.setFont(new Font("Diablo", Font.PLAIN, 10));
		lblNewLabel_22.setBounds(496, 268, 278, 31);
		frame.getContentPane().add(lblNewLabel_22);
		
		JLabel lblNewLabel_23 = new JLabel("Increases Assumptio's effects by 50,000");
		lblNewLabel_23.setFont(new Font("Diablo", Font.PLAIN, 10));
		lblNewLabel_23.setBounds(496, 283, 278, 31);
		frame.getContentPane().add(lblNewLabel_23);
		
		JLabel lblNewLabel_24 = new JLabel("Prayers of Love");
		lblNewLabel_24.setFont(new Font("Diablo", Font.PLAIN, 14));
		lblNewLabel_24.setBounds(496, 293, 200, 50);
		frame.getContentPane().add(lblNewLabel_24);
		
		JButton btnNewButton_9 = new JButton("150");
		btnNewButton_9.setFont(new Font("Diablo", Font.PLAIN, 11));
		btnNewButton_9.setBounds(640, 302, 134, 37);
		frame.getContentPane().add(btnNewButton_9);
		
		JLabel lblNewLabel_25 = new JLabel("Info: Prayers that speaks God's love");
		lblNewLabel_25.setFont(new Font("Diablo", Font.PLAIN, 10));
		lblNewLabel_25.setBounds(496, 340, 278, 31);
		frame.getContentPane().add(lblNewLabel_25);
		
		JLabel lblNewLabel_26 = new JLabel("Increases the duration of Epiclesis by 1");
		lblNewLabel_26.setFont(new Font("Diablo", Font.PLAIN, 10));
		lblNewLabel_26.setBounds(496, 361, 271, 31);
		frame.getContentPane().add(lblNewLabel_26);
		
		JLabel lblNewLabel_27 = new JLabel("Gold: 0");
		lblNewLabel_27.setFont(new Font("Diablo", Font.PLAIN, 20));
		lblNewLabel_27.setBounds(10, 13, 200, 50);
		frame.getContentPane().add(lblNewLabel_27);
		
		JButton btnNewButton_10 = new JButton("Next Demon: X");
		btnNewButton_10.setFont(new Font("Diablo", Font.PLAIN, 12));
		btnNewButton_10.setBounds(496, 479, 278, 50);
		frame.getContentPane().add(btnNewButton_10);
		
		JLabel lblNewLabel_28 = new JLabel("Skill Upgrades");
		lblNewLabel_28.setFont(new Font("Diablo", Font.PLAIN, 20));
		lblNewLabel_28.setBounds(552, 14, 199, 50);
		frame.getContentPane().add(lblNewLabel_28);
	    
		//Shop Background is given >w<
		JLabel lblNewLabel_29 = new JLabel("");
		lblNewLabel_29.setIcon(new ImageIcon(Shop1.class.getResource("/Images/ShopBg.jpg.jpg")));
		lblNewLabel_29.setBounds(0, 0, 800, 600);
		frame.getContentPane().add(lblNewLabel_29);
	}
}
