package RTH;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.Toolkit;

import javax.swing.JButton;

import java.awt.Font;
import java.util.Random;

import javax.swing.JLabel;

import java.awt.Color;

import javax.swing.ImageIcon;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JPanel;
import javax.swing.JTree;

public class ThanaFight8 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */

	public static int nRand = 0 ;
	Random random  = new Random();
	boolean bBlind = false;
	int nCtr = 0;
	boolean bTemp = bBlind;
	int Abyssal = 200000;
	int JackFrost = 150000;
	int SoulStrike = 50000;
	int Stacks = 0;
	int MaxStacks = 10;
	
	int TetraVortex = 1000000;
	int Inferno = 100000;
	
	public static void appear() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ThanaFight8 window = new ThanaFight8();
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
	public ThanaFight8() {

		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
	
		
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(AliceFighting1.class.getResource("/Images/Logo.jpg")));
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		final JButton btnExit = new JButton("Exit");
		final JButton btnRetry = new JButton("Retry");
		final JButton btnConfirm = new JButton("Confirm");
		
		final JLabel lblMessageBox = new JLabel("");
		lblMessageBox.setForeground(Color.WHITE);
		lblMessageBox.setFont(new Font("Diablo", Font.ITALIC, 20));
		lblMessageBox.setBounds(463, 472, 311, 78);
		frame.getContentPane().add(lblMessageBox);
		
		final JLabel lblNewLabel_2 = new JLabel("Thana");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Diablo", Font.ITALIC, 40));
		lblNewLabel_2.setBounds(35, 40, 195, 31);
		frame.getContentPane().add(lblNewLabel_2);
		
		final JLabel lblAliceHP = new JLabel("800000");
		lblAliceHP.setForeground(Color.WHITE);
		lblAliceHP.setFont(new Font("Diablo", Font.ITALIC, 35));
		lblAliceHP.setBounds(35, 100, 195, 31);
		frame.getContentPane().add(lblAliceHP);
		
		final JLabel lblNewLabel_3 = new JLabel("Beelzebub");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Diablo", Font.ITALIC, 40));
		lblNewLabel_3.setBounds(474, 40, 269, 31);
		frame.getContentPane().add(lblNewLabel_3);
		
		final JLabel lblNewLabel_4 = new JLabel("VS.");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Diablo", Font.ITALIC, 30));
		lblNewLabel_4.setBounds(319, 36, 51, 45);
		frame.getContentPane().add(lblNewLabel_4);
		
		final JLabel lblMammonHP = new JLabel("6000000");
		lblMammonHP.setForeground(Color.WHITE);
		lblMammonHP.setFont(new Font("Diablo", Font.ITALIC, 35));
		lblMammonHP.setBounds(494, 100, 195, 31);
		frame.getContentPane().add(lblMammonHP);
		
		final JLabel lblStage = new JLabel("Stage 8");
		lblStage.setForeground(Color.WHITE);
		lblStage.setFont(new Font("Diablo", Font.ITALIC, 25));
		lblStage.setBounds(576, 433, 126, 31);
		frame.getContentPane().add(lblStage);
		
		JLabel lblStacks = new JLabel("0");
		lblStacks.setForeground(Color.WHITE);
		lblStacks.setFont(new Font("Diablo", Font.ITALIC, 13));
		lblStacks.setBounds(267, 410, 24, 15);
		frame.getContentPane().add(lblStacks);
		
		JButton btnHolyLight = new JButton("Soul Strike");
		btnHolyLight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sAliceHP = lblAliceHP.getText();
				Integer nAliceHP = 0;
				nAliceHP = nAliceHP.parseInt(sAliceHP);
				
				String sMammonHP = lblMammonHP.getText();
				Integer nMammonHP = 0 ;
				nMammonHP = nMammonHP.parseInt(sMammonHP);
				
				nMammonHP -= SoulStrike + (10000*Stacks);
				sMammonHP = nMammonHP.toString();
				lblMammonHP.setText(sMammonHP);
				lblMessageBox.setText("Thana casts Soul Strke!");
				
				if(nCtr % 4 == 0){
					nAliceHP -= 300000;
					sAliceHP = nAliceHP.toString();
					lblAliceHP.setText(sAliceHP);
					lblMessageBox.setText("Beelzebub used Special Attack!");
					lblMessageBox.setText("Unholy Eater!");
				}else{
					nAliceHP -= 500000;
	                nCtr++;
					sAliceHP = nAliceHP.toString();
					lblAliceHP.setText(sAliceHP);
					lblMessageBox.setText("Beelzebub used Deadly Swarm!");
				}	
					
					if (nAliceHP <= 0){
						
						JOptionPane.showMessageDialog(frame , "You Lose");
						btnExit.setVisible(true);
						btnRetry.setVisible(true);
						
					} if (nMammonHP <= 0){
						
						JOptionPane.showMessageDialog(frame , "You WIN!");
						btnExit.setVisible(true);
						btnConfirm.setVisible(true);	
	                }
				
				
				
			}
		});
		btnHolyLight.setForeground(Color.WHITE);
		btnHolyLight.setFont(new Font("Diablo", Font.ITALIC, 15));
		btnHolyLight.setBackground(Color.DARK_GRAY);
		btnHolyLight.setBounds(35, 372, 133, 53);
		frame.getContentPane().add(btnHolyLight);
		btnConfirm.setVisible(false);
		
		final JButton btnAliceSkill1 = new JButton("Soul Link");
		btnAliceSkill1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				nRand = random.nextInt();
				
				String sStacks = lblStacks.getText();
				Integer nStacks = 0;
				nStacks = nStacks.parseInt(sStacks);
				
				String sAliceHP = lblAliceHP.getText();
				Integer nAliceHP = 0;
				nAliceHP = nAliceHP.parseInt(sAliceHP);
				
				String sMammonHP = lblMammonHP.getText();
				Integer nMammonHP = 0 ;
				nMammonHP = nMammonHP.parseInt(sMammonHP);
				
				
				if(Stacks == MaxStacks){
			    	JOptionPane.showMessageDialog(frame, "Exceeded Conection");
			    }else{
			    	Stacks += 1;
			    	nStacks += 1;
			    }
				sStacks = nStacks.toString();
				lblStacks.setText(sStacks);
				
				nAliceHP += (Stacks * 100000); 
				sAliceHP = nAliceHP.toString();
				lblAliceHP.setText(sAliceHP);
				lblMessageBox.setText("Thana calls upon Souls!");
				
				
				if (nAliceHP <= 0){
					
					JOptionPane.showMessageDialog(frame , "You Lose");
					btnExit.setVisible(true);
					btnRetry.setVisible(true);
					
				} if (nMammonHP <= 0){
					
					JOptionPane.showMessageDialog(frame , "You WIN!");
					btnExit.setVisible(true);
					btnConfirm.setVisible(true);	
                }
					
				
				
			}
		});
		btnAliceSkill1.setForeground(Color.WHITE);
		btnAliceSkill1.setBackground(Color.DARK_GRAY);
		btnAliceSkill1.setFont(new Font("Diablo", Font.ITALIC, 15));
		btnAliceSkill1.setBounds(35, 433, 195, 53);
		frame.getContentPane().add(btnAliceSkill1);
		
		final JButton btnAliceSkill2 = new JButton("Transmission");
		btnAliceSkill2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Stacks == 0){
					JOptionPane.showMessageDialog(frame, "No Connection!");
				}else{
			String sMammonHP = lblMammonHP.getText();
			nRand = random.nextInt();
			String sAliceHP = lblAliceHP.getText();
			Integer nAliceHP = 0;
			nAliceHP = nAliceHP.parseInt(sAliceHP);
			
			Integer nMammonHP = 0 ;
			nMammonHP = nMammonHP.parseInt(sMammonHP);
			
			if ( nRand < 16000){
		    bBlind = true;
			nMammonHP -= JackFrost + (Stacks*20000);
			sMammonHP = nMammonHP.toString();
			lblMammonHP.setText(sMammonHP);
			lblMessageBox.setText("Thana uses Transmission!");
			lblMessageBox.setText("Transmission stuns Beezlebub!");
			String sStacks = lblStacks.getText();
			Integer nStacks = 0;
			nStacks = nStacks.parseInt(sStacks);
			
			Stacks -= 1;
			nStacks -= 1;
			
			sStacks = nStacks.toString();
			lblStacks.setText(sStacks);
			lblMessageBox.setText("Transmission complete!");
			lblMessageBox.setText("Lost one connection!");
			}
			
			else {
				nMammonHP -= JackFrost + (Stacks*20000);
				sMammonHP = nMammonHP.toString();
				lblMammonHP.setText(sMammonHP);
				lblMessageBox.setText("Thana uses Transmisson!");
				String sStacks = lblStacks.getText();
				Integer nStacks = 0;
				nStacks = nStacks.parseInt(sStacks);
				
				Stacks -= 1;
				nStacks -= 1;
				
				sStacks = nStacks.toString();
				lblStacks.setText(sStacks);
				lblMessageBox.setText("Transmission complete!");
				lblMessageBox.setText("Lost one connection!");
			}
			
			if ( bBlind == true){
				nAliceHP -= 0;
				nCtr++;
				sAliceHP = nAliceHP.toString();
				lblAliceHP.setText(sAliceHP);
				lblMessageBox.setText("Beelzebub used Deadly Swarm!");
				lblMessageBox.setText("But Beelzebub was stunned!");
				}
				
				else{
					nAliceHP -= 500000;
	                nCtr++;
					sAliceHP = nAliceHP.toString();
					lblAliceHP.setText(sAliceHP);
					lblMessageBox.setText("Beelzebub used Deadly Swarm!");
				}
			
			if (nCtr % 4 == 0){
				nAliceHP -= 650000;
				sAliceHP = nAliceHP.toString();
				lblAliceHP.setText(sAliceHP);
				lblMessageBox.setText("Beelzebub used Special Attack!");
				lblMessageBox.setText("Unholy Eater!");
			}
			
			if (nAliceHP <= 0){
				
				JOptionPane.showMessageDialog(frame , "You Lose");
				btnExit.setVisible(true);
				btnRetry.setVisible(true);
				
			} if (nMammonHP <= 0){
				
				JOptionPane.showMessageDialog(frame , "You WIN!");
				btnExit.setVisible(true);
				btnConfirm.setVisible(true);	
            }
			
			
				}
			
			
			}
		});
		btnAliceSkill2.setForeground(Color.WHITE);
		btnAliceSkill2.setBackground(Color.DARK_GRAY);
		btnAliceSkill2.setFont(new Font("Diablo", Font.ITALIC, 15));
		btnAliceSkill2.setBounds(35, 497, 195, 53);
		frame.getContentPane().add(btnAliceSkill2);
		
		final JButton btnAliceSkill3 = new JButton("Soul Expansion");
		btnAliceSkill3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Stacks == 0){
					JOptionPane.showMessageDialog(frame, "No Connection!");
				}else{
				String sAliceHP = lblAliceHP.getText();
				Integer nAliceHP = 0;
				nAliceHP = nAliceHP.parseInt(sAliceHP);
				
				
				String sMammonHP = lblMammonHP.getText();
				Integer nMammonHP = 0 ;
				nMammonHP -= Inferno * Stacks;
				lblMessageBox.setText("Thana casts Soul Expansion!");
				
				String sStacks = lblStacks.getText();
				Integer nStacks = 0;
				nStacks = nStacks.parseInt(sStacks);
				
				Stacks -= Stacks;
				nStacks -= nStacks;
				
				sStacks = nStacks.toString();
				lblStacks.setText(sStacks);
				
				lblMessageBox.setText("Expansion causes the Links");
				lblMessageBox.setText("To break!");
				
				
				nMammonHP = nMammonHP.parseInt(sMammonHP);
				if(nCtr % 4 == 0){
					nAliceHP -= 420000;
					sAliceHP = nAliceHP.toString();
					lblAliceHP.setText(sAliceHP);
					lblMessageBox.setText("Beelzebub used Special Attack!");
					lblMessageBox.setText("Unholy Eater!");
				}else{
					nAliceHP -= 500000;
	                nCtr++;
					sAliceHP = nAliceHP.toString();
					lblAliceHP.setText(sAliceHP);
					lblMessageBox.setText("Beelzebub used Deadly Swarm!");
				}
				
				if (nAliceHP <= 0){
					
					JOptionPane.showMessageDialog(frame , "You Lose");
					btnExit.setVisible(true);
					btnRetry.setVisible(true);
					
				}
				if (nMammonHP <= 0){
					
					JOptionPane.showMessageDialog(frame , "You WIN!");
					btnExit.setVisible(true);
					btnConfirm.setVisible(true);	
}
				}
			}
		});
		btnAliceSkill3.setBackground(Color.DARK_GRAY);
		btnAliceSkill3.setForeground(Color.WHITE);
		btnAliceSkill3.setFont(new Font("Diablo", Font.ITALIC, 15));
		btnAliceSkill3.setBounds(240, 433, 195, 53);
		frame.getContentPane().add(btnAliceSkill3);
		
		final JButton btnAliceSkill4 = new JButton("Mass Networking");
		btnAliceSkill4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sAliceHP = lblAliceHP.getText();
				Integer nAliceHP = 0;
				nAliceHP = nAliceHP.parseInt(sAliceHP);
				
				String sMammonHP = lblMammonHP.getText();
				Integer nMammonHP = 0 ;
				nMammonHP = nMammonHP.parseInt(sMammonHP);
				
				String sStacks = lblStacks.getText();
				Integer nStacks = 0;
				nStacks = nStacks.parseInt(sStacks);
				
				Stacks = MaxStacks;
				nStacks = MaxStacks;
				
				if(Stacks != MaxStacks){
					Stacks = MaxStacks;
				}
				
				if(nStacks != MaxStacks){
					nStacks = MaxStacks;
				}
				
				sStacks = nStacks.toString();
				lblStacks.setText(sStacks);
			    
			    sAliceHP = nAliceHP.toString();
			    lblAliceHP.setText(sAliceHP);
			    
				
				lblMessageBox.setText("Thana links all souls in Hell!");
				lblMessageBox.setText("Creating a mass network of Souls!");
				
				if(nCtr % 4 == 0){
					nAliceHP -= 420000;
					sAliceHP = nAliceHP.toString();
					lblAliceHP.setText(sAliceHP);
					lblMessageBox.setText("Beelzebub used Special Attack!");
					lblMessageBox.setText("Unholy Eater!");
				}else{
					nAliceHP -= 500000;
	                nCtr++;
					sAliceHP = nAliceHP.toString();
					lblAliceHP.setText(sAliceHP);
					lblMessageBox.setText("Beelzebub used Deadly Swarm!");
				}
				
				if (nAliceHP <= 0){
					
					JOptionPane.showMessageDialog(frame , "You Lose");
					btnExit.setVisible(true);
					btnRetry.setVisible(true);
					
				}
				if (nMammonHP <= 0){
					
					JOptionPane.showMessageDialog(frame , "You WIN!");
					btnExit.setVisible(true);
					btnConfirm.setVisible(true);	
					}
				
				btnAliceSkill4.setEnabled(false);
			    
			}
		});
		btnAliceSkill4.setBackground(Color.DARK_GRAY);
		btnAliceSkill4.setForeground(Color.WHITE);
		btnAliceSkill4.setFont(new Font("Diablo", Font.ITALIC, 15));
		btnAliceSkill4.setBounds(240, 497, 195, 53);
		frame.getContentPane().add(btnAliceSkill4);
		
		final JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(AliceFighting1.class.getResource("/Images/b_SoulLinker.gif")));
		lblNewLabel.setBounds(178, 214, 108, 176);
		frame.getContentPane().add(lblNewLabel);
		
		final JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(AliceFighting1.class.getResource("/Images/Beelzebub.gif")));
		lblNewLabel_1.setBounds(504, 214, 215, 186);
		frame.getContentPane().add(lblNewLabel_1);
		
		
		btnRetry.setBackground(Color.DARK_GRAY);
		btnRetry.setForeground(Color.WHITE);
		btnRetry.setFont(new Font("Diablo", Font.ITALIC, 15));
		btnRetry.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AliceFighting1 a1 = new AliceFighting1();
				a1.appear();
				frame.dispose();
				
			}
		});
		btnRetry.setBounds(240, 180, 89, 53);
		frame.getContentPane().add(btnRetry);
		btnRetry.setVisible(false);
		
		
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				MainMenu mm = new MainMenu();
				mm.appear();
				frame.dispose();
				
			}
		});
		btnExit.setVisible(false);
		
		btnExit.setFont(new Font("Diablo", Font.ITALIC, 15));
		btnExit.setBackground(Color.DARK_GRAY);
		btnExit.setForeground(Color.WHITE);
		btnExit.setBounds(405, 180, 89, 53);
		frame.getContentPane().add(btnExit);
		
		
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AliceMap am = new AliceMap();
				am.appear();
				frame.dispose();
			}
		});
		btnConfirm.setFont(new Font("Diablo", Font.ITALIC, 15));
		btnConfirm.setBackground(Color.DARK_GRAY);
		btnConfirm.setForeground(Color.WHITE);
		btnConfirm.setBounds(240, 180, 108, 53);
		frame.getContentPane().add(btnConfirm);
		
		JLabel lblNewLabel_5 = new JLabel("Souls linked:");
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setFont(new Font("Diablo", Font.ITALIC, 11));
		lblNewLabel_5.setBounds(178, 401, 91, 31);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\acer\\Documents\\Eclipse\\MP\\Resource\\Images\\8th.jpg"));
		lblNewLabel_6.setBounds(0, 0, 784, 562);
		frame.getContentPane().add(lblNewLabel_6);
		
	
		
		
		
		
	}
}
