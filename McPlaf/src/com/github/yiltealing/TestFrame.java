package com.github.yiltealing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import com.github.yiltealing.mcplaf.MFrame;
import com.github.yiltealing.mcplaf.MinecraftLookAndFeel;

public class TestFrame {
	private static MFrame frame;
	
	private static void createWindow() {
		try {
			UIManager.setLookAndFeel(new MinecraftLookAndFeel());
			//UIManager.setLookAndFeel(new WindowsLookAndFeel());
		}
		catch (Exception e) {
			System.out.println("Error!");
		}
		frame = new MFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//TODO Layout
		frame.getContentPane().setLayout(null);
		
		JButton b = new JButton("Test 测试");
		b.setBounds(50, 50, 100, 230);
		
		frame.getContentPane().add(b);
		
		frame.setSize(500, 375);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		//System.out.println(TestFrame.class.getResource("config.txt").getPath());
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				createWindow();
			}
		});
	}
	
	public static JFrame getFrame() {
		return frame;
	}
}
