package RTH;

import java.awt.EventQueue;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;
import java.io.InputStream;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.UIManager;

import javax.swing.ImageIcon;

public class MainMenu {

	private JFrame frame;
	private final JButton btnQuit = new JButton("QUIT");

	/**
	 * Launch the application.
	 */
	public static void main(String args[]) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenu window = new MainMenu();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public static void appear(){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenu window = new MainMenu();
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
	public MainMenu() {
		initialize();
		File Sound = new File ("MP/Resource/Music/T1.wav");
		PlaySound(Sound);
		PlaySound(Sound);
		
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(MainMenu.class.getResource("/Images/Logo.jpg")));
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(125, 0, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		
		JLabel lblRoadToHell = new JLabel("Road To Hades");
		lblRoadToHell.setForeground(Color.WHITE);
		lblRoadToHell.setFont(new Font("Diablo", Font.ITALIC, 60));
		lblRoadToHell.setBounds(124, 105, 552, 60);
		frame.getContentPane().add(lblRoadToHell);
		
		JButton btnNewGame = new JButton("New Game");
		btnNewGame.setFont(new Font("Diablo", Font.ITALIC, 16));
		btnNewGame.setForeground(Color.WHITE);
		btnNewGame.setBackground(Color.DARK_GRAY);
		btnNewGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				NewGame ng = new NewGame();
				ng.appear();
				frame.dispose();
			}
			
		});
		btnNewGame.setBounds(544, 243, 186, 52);
		frame.getContentPane().add(btnNewGame);
		
		JButton btnLoadGame = new JButton("Load Game");
		btnLoadGame.setFont(new Font("Diablo", Font.ITALIC, 15));
		btnLoadGame.setForeground(Color.WHITE);
		btnLoadGame.setBackground(Color.DARK_GRAY);
		btnLoadGame.setBounds(544, 322, 186, 52);
		frame.getContentPane().add(btnLoadGame);
		
		JButton btnCredits = new JButton("Credits");
		btnCredits.setFont(new Font("Diablo", Font.ITALIC, 15));
		btnCredits.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Credits cr = new Credits();
				cr.appear();
				frame.dispose();
			}
		});
		btnCredits.setForeground(Color.WHITE);
		btnCredits.setBackground(Color.DARK_GRAY);
		btnCredits.setBounds(544, 400, 186, 52);
		frame.getContentPane().add(btnCredits);
		btnQuit.setFont(new Font("Diablo", Font.ITALIC, 15));
		btnQuit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnQuit.setBackground(Color.DARK_GRAY);
		btnQuit.setForeground(Color.WHITE);
		btnQuit.setBounds(10, 506, 120, 44);
		frame.getContentPane().add(btnQuit);
		
		final JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(MainMenu.class.getResource("/Images/MainMenuBg.jpg")));
		lblNewLabel.setBounds(0, 0, 800, 600);
		frame.getContentPane().add(lblNewLabel);
	}
	
	
 static void PlaySound(File Sound)
	{
		try{
			Clip clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(Sound));
			clip.start();
			
		}catch (Exception e){}
	}
}



