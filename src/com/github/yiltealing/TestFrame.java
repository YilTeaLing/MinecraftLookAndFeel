package com.github.yiltealing;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import com.github.yiltealing.mcplaf.MinecraftLookAndFeel;
import com.github.yiltealing.mcplaf.window.MFrame;

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
		frame.setLayout(new FlowLayout());
		JButton b1 = new JButton("Test 测试1");
		JButton b2 = new JButton("Test 测试2");
		JButton b3 = new JButton("Test 测试3");
		frame.getContentPane().add(b1);
		frame.getContentPane().add(b2);
		frame.getContentPane().add(b3);
		frame.pack();
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
