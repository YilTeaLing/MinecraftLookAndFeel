package com.github.yiltealing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRootPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import com.github.yiltealing.mcplaf.MFrame;
import com.github.yiltealing.mcplaf.MinecraftLookAndFeel;
import com.sun.java.swing.plaf.windows.WindowsLookAndFeel;

public class TestFrame {
	private static MFrame frame;
	public static int i = 0;
	
	private static void createWindow() {
		try {
			UIManager.setLookAndFeel(new MinecraftLookAndFeel());
			//UIManager.setLookAndFeel(new WindowsLookAndFeel());
		}
		catch (Exception e) {
			System.out.println("Error!");
		}
		frame = new MFrame();
		//TODO Layout
		frame.getContentPane().setLayout(null);
		
		JButton b1 = new JButton("Test 测试1");
		JButton b2 = new JButton("Test 测试2");
		JButton b3 = new JButton("Test 测试3");
		b1.setBounds(50, 50, 100, 50);
		b2.setBounds(150, 50, 100, 50);
		b3.setBounds(50, 100, 100, 50);
		frame.getContentPane().add(b1);
		frame.getContentPane().add(b2);
		frame.getContentPane().add(b3);
		
		frame.setSize(500, 375);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
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
