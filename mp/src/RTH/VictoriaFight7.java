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

public class VictoriaFight7 {

	private JFrame frame;
	public static int nRand = 0 ;
	Random random  = new Random();
	boolean bBlind = false;
	int nCtr = 0;
	public int lash = 80000;
	public int Moon = 100000;
	public int Circle = 100000;
	public int Siren = 100000;
	public int Fever() {
		Moon += 200000;
		Circle += 200000;
		Siren += 200000;
		return 0;
	}


	/**
	 * Launch the application.
	 */

	
	
	public static void appear() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VictoriaFight7 window = new VictoriaFight7();
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
	public VictoriaFight7() {

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
		
		final JLabel lblNewLabel_2 = new JLabel("Victoria");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Diablo", Font.ITALIC, 40));
		lblNewLabel_2.setBounds(35, 40, 236, 31);
		frame.getContentPane().add(lblNewLabel_2);
		
		final JLabel lblAliceHP = new JLabel("800000");
		lblAliceHP.setForeground(Color.WHITE);
		lblAliceHP.setFont(new Font("Diablo", Font.ITALIC, 35));
		lblAliceHP.setBounds(35, 100, 195, 31);
		frame.getContentPane().add(lblAliceHP);
		
		final JLabel lblNewLabel_3 = new JLabel("Luifer");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Diablo", Font.ITALIC, 40));
		lblNewLabel_3.setBounds(474, 40, 215, 31);
		frame.getContentPane().add(lblNewLabel_3);
		
		final JLabel lblNewLabel_4 = new JLabel("VS.");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Diablo", Font.ITALIC, 30));
		lblNewLabel_4.setBounds(319, 36, 51, 45);
		frame.getContentPane().add(lblNewLabel_4);
		
		final JLabel lblMammonHP = new JLabel("4500000");
		lblMammonHP.setForeground(Color.WHITE);
		lblMammonHP.setFont(new Font("Diablo", Font.ITALIC, 35));
		lblMammonHP.setBounds(494, 100, 195, 31);
		frame.getContentPane().add(lblMammonHP);
		
		final JLabel lblStage = new JLabel("Stage 7");
		lblStage.setForeground(Color.WHITE);
		lblStage.setFont(new Font("Diablo", Font.ITALIC, 25));
		lblStage.setBounds(576, 433, 126, 31);
		frame.getContentPane().add(lblStage);
		
		JButton btnHolyLight = new JButton("Deadly Lash");
		btnHolyLight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sAliceHP = lblAliceHP.getText();
				Integer nAliceHP = 0;
				nAliceHP = nAliceHP.parseInt(sAliceHP);
				
				String sMammonHP = lblMammonHP.getText();
				Integer nMammonHP = 0 ;
				nMammonHP = nMammonHP.parseInt(sMammonHP);
				
				nMammonHP -= lash;
				sMammonHP = nMammonHP.toString();
				lblMammonHP.setText(sMammonHP);
				lblMessageBox.setText("Victoria uses Deadly Lash!");
				
				if(nCtr % 4 == 0){
					nAliceHP += nAliceHP;
					if (nCtr == 8){
						nAliceHP -=nAliceHP;
						
					}
				
					sAliceHP = nAliceHP.toString();
					lblAliceHP.setText(sAliceHP);
					nMammonHP -= 250000;
			        sMammonHP = nMammonHP.toString();
					lblMessageBox.setText("Lucifer used Special attack!");
					lblMessageBox.setText("False Blessing!");
				}else{
					nAliceHP -= 385000;
					nCtr ++;
					sAliceHP = nAliceHP.toString();
					lblAliceHP.setText(sAliceHP);
					lblMessageBox.setText("Lucifer used Wraithful Smite!");
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
		
		final JButton btnAliceSkill1 = new JButton("Moonlight Waltz");
		final JButton btnAliceSkill2 = new JButton("Circle of Nature");
		final JButton btnAliceSkill3 = new JButton("Siren's Voice");
		final JButton btnAliceSkill4 = new JButton("S.N.F.");
		
		btnAliceSkill1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				nRand = random.nextInt();
				
				
				String sAliceHP = lblAliceHP.getText();
				Integer nAliceHP = 0;
				nAliceHP = nAliceHP.parseInt(sAliceHP);
				
				String sMammonHP = lblMammonHP.getText();
				Integer nMammonHP = 0 ;
				nMammonHP = nMammonHP.parseInt(sMammonHP);
				
				
				nMammonHP -= lash + Moon;
				sMammonHP = nMammonHP.toString();
				lblMammonHP.setText(sMammonHP);
				lblMessageBox.setText("Victoria performs!");
				lblMessageBox.setText("Moonlight Waltz!");
				
				btnAliceSkill1.setEnabled(false);
			    btnAliceSkill2.setEnabled(true);
			    btnAliceSkill3.setEnabled(true);
			    btnAliceSkill4.setEnabled(true);
			   
				
				
				
				if(nCtr % 4 == 0){
					nAliceHP += nAliceHP;
					if (nCtr == 8){
						nAliceHP -=nAliceHP;
						
					}
				
					sAliceHP = nAliceHP.toString();
					lblAliceHP.setText(sAliceHP);
					nMammonHP -= 250000;
			        sMammonHP = nMammonHP.toString();
					lblMessageBox.setText("Lucifer used Special attack!");
					lblMessageBox.setText("False Blessing!");
				}else{
					nAliceHP -= 385000;
					nCtr ++;
					sAliceHP = nAliceHP.toString();
					lblAliceHP.setText(sAliceHP);
					lblMessageBox.setText("Lucifer used Wraithful Smite!");
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
		btnAliceSkill1.setForeground(Color.WHITE);
		btnAliceSkill1.setBackground(Color.DARK_GRAY);
		btnAliceSkill1.setFont(new Font("Diablo", Font.ITALIC, 15));
		btnAliceSkill1.setBounds(35, 433, 195, 53);
		frame.getContentPane().add(btnAliceSkill1);
		
		
		btnAliceSkill2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {String sMammonHP = lblMammonHP.getText();
			
			String sAliceHP = lblAliceHP.getText();
			Integer nAliceHP = 0;
			nAliceHP = nAliceHP.parseInt(sAliceHP);
			nAliceHP += Circle; 
			
			sAliceHP = nAliceHP.toString();
			lblAliceHP.setText(sAliceHP);
			Integer nMammonHP = 0 ;
			nMammonHP = nMammonHP.parseInt(sMammonHP);
			nMammonHP -= lash;
			sMammonHP = nMammonHP.toString();
			lblMammonHP.setText(sMammonHP);
			lblMessageBox.setText("Victoria performs!");
			lblMessageBox.setText("Circle of Nature!");
			
			btnAliceSkill1.setEnabled(true);
		    btnAliceSkill2.setEnabled(false);
		    btnAliceSkill3.setEnabled(true);
		    btnAliceSkill4.setEnabled(true);
			
			if(nCtr % 4 == 0){
				nAliceHP += nAliceHP;
				if (nCtr == 8){
					nAliceHP -=nAliceHP;
					
				}
			
				sAliceHP = nAliceHP.toString();
				lblAliceHP.setText(sAliceHP);
				nMammonHP -= 250000;
		        sMammonHP = nMammonHP.toString();
				lblMessageBox.setText("Lucifer used Special attack!");
				lblMessageBox.setText("False Blessing!");
			}else{
				nAliceHP -= 385000;
				nCtr ++;
				sAliceHP = nAliceHP.toString();
				lblAliceHP.setText(sAliceHP);
				lblMessageBox.setText("Lucifer used Wraithful Smite!");
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
		});
		btnAliceSkill2.setForeground(Color.WHITE);
		btnAliceSkill2.setBackground(Color.DARK_GRAY);
		btnAliceSkill2.setFont(new Font("Diablo", Font.ITALIC, 15));
		btnAliceSkill2.setBounds(35, 497, 195, 53);
		frame.getContentPane().add(btnAliceSkill2);
		
		
		btnAliceSkill3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String sAliceHP = lblAliceHP.getText();
				Integer nAliceHP = 0;
				nAliceHP = nAliceHP.parseInt(sAliceHP);
				
				String sMammonHP = lblMammonHP.getText();
				Integer nMammonHP = 0 ;
				nMammonHP = nMammonHP.parseInt(sMammonHP);
				
				lblMessageBox.setText("Victoria Performs!");
				lblMessageBox.setText("Siren's Voice!");
				
				btnAliceSkill1.setEnabled(true);
			    btnAliceSkill2.setEnabled(true);
			    btnAliceSkill3.setEnabled(false);
			    btnAliceSkill4.setEnabled(true);
				
				
				   if(nCtr % 4 == 0){
				        nAliceHP += nAliceHP;
				        if (nCtr == 8){
				        nAliceHP -= nAliceHP;
				       }
						sAliceHP = nAliceHP.toString();
						lblAliceHP.setText(sAliceHP);
				        sMammonHP = nMammonHP.toString();
						lblMessageBox.setText("Lucifer used Special attack!");
						lblMessageBox.setText("False Blessing!");
					}else{
						nAliceHP -= 385000 - Siren - lash;
						nCtr++;
						sAliceHP = nAliceHP.toString();
						lblAliceHP.setText(sAliceHP);
						lblMessageBox.setText("Lucifer used Wraithful Smite!");
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
		});
		btnAliceSkill3.setBackground(Color.DARK_GRAY);
		btnAliceSkill3.setForeground(Color.WHITE);
		btnAliceSkill3.setFont(new Font("Diablo", Font.ITALIC, 15));
		btnAliceSkill3.setBounds(240, 433, 195, 53);
		frame.getContentPane().add(btnAliceSkill3);
		
		
		btnAliceSkill4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sAliceHP = lblAliceHP.getText();
				Integer nAliceHP = 0;
				nAliceHP = nAliceHP.parseInt(sAliceHP);
				
				String sMammonHP = lblMammonHP.getText();
				Integer nMammonHP = 0 ;
				nMammonHP = nMammonHP.parseInt(sMammonHP);
				nMammonHP -= lash + Moon;
				nAliceHP += Circle; 
				nMammonHP -= lash;
				
			    
			    
			    sAliceHP = nAliceHP.toString();
			    lblAliceHP.setText(sAliceHP);
			    
			    sMammonHP = nMammonHP.toString();
				lblMammonHP.setText(sMammonHP);
				
				lblMessageBox.setText("Victoria Performs!");
				lblMessageBox.setText("Saturday Night Fever!");
				
				btnAliceSkill1.setEnabled(true);
			    btnAliceSkill2.setEnabled(true);
			    btnAliceSkill3.setEnabled(true);
			    int cDown = 5;
			    if(cDown > 0){
			    btnAliceSkill4.setEnabled(false);
			    --cDown;
			    }
			    
			    if(cDown == 0){
			    btnAliceSkill4.setEnabled(true);	
			    }
				
				
				if(nCtr % 4 == 0){
					if(nCtr % 4 == 0){
						nAliceHP += nAliceHP;
						if (nCtr == 8){
							nAliceHP -=nAliceHP;
							
						}
					
						sAliceHP = nAliceHP.toString();
						lblAliceHP.setText(sAliceHP);
						nMammonHP -= 250000;
				        sMammonHP = nMammonHP.toString();
						lblMessageBox.setText("Lucifer used Special attack!");
						lblMessageBox.setText("False Blessing!");
					}else{
						nAliceHP -= 385000 - Siren - lash;
						nCtr ++;
						sAliceHP = nAliceHP.toString();
						lblAliceHP.setText(sAliceHP);
						lblMessageBox.setText("Lucifer used Wraithful Smite!");
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
		btnAliceSkill4.setBackground(Color.DARK_GRAY);
		btnAliceSkill4.setForeground(Color.WHITE);
		btnAliceSkill4.setFont(new Font("Diablo", Font.ITALIC, 15));
		btnAliceSkill4.setBounds(240, 497, 195, 53);
		frame.getContentPane().add(btnAliceSkill4);
		
		final JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(AliceFighting1.class.getResource("/Images/b_Gypsy.gif")));
		lblNewLabel.setBounds(178, 214, 108, 176);
		frame.getContentPane().add(lblNewLabel);
		
		final JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(AliceFighting1.class.getResource("/Images/Lucifer.gif")));
		lblNewLabel_1.setBounds(504, 214, 185, 176);
		frame.getContentPane().add(lblNewLabel_1);
		
		
		btnRetry.setBackground(Color.DARK_GRAY);
		btnRetry.setForeground(Color.WHITE);
		btnRetry.setFont(new Font("Diablo", Font.ITALIC, 15));
		btnRetry.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VictoriaFight7 v7 = new VictoriaFight7();
				v7.appear();
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
				VictoriaMap vm = new VictoriaMap();
				vm.appear();
				frame.dispose();
			}
		});
		btnConfirm.setFont(new Font("Diablo", Font.ITALIC, 15));
		btnConfirm.setBackground(Color.DARK_GRAY);
		btnConfirm.setForeground(Color.WHITE);
		btnConfirm.setBounds(240, 180, 108, 53);
		frame.getContentPane().add(btnConfirm);
		
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setIcon(new ImageIcon(VictoriaFight7.class.getResource("/Images/7th.jpg")));
		lblNewLabel_6.setBounds(0, 0, 784, 562);
		frame.getContentPane().add(lblNewLabel_6);
		
		}
}
