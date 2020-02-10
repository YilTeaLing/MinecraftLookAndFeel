package com.github.yiltealing;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import com.github.yiltealing.mcplaf.MFrame;
import com.github.yiltealing.mcplaf.MinecraftLookAndFeel;

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
		JButton b4 = new JButton("Test 测试4");
		b1.setBounds(50, 50, 100, 50);
		b2.setBounds(150, 50, 100, 50);
		b3.setBounds(50, 100, 100, 50);
		b4.setBounds(150, 100, 100, 50);
		frame.getContentPane().add(b1);
		frame.getContentPane().add(b2);
		frame.getContentPane().add(b3);
		frame.getContentPane().add(b4);
		
		
		JTextField txtfield1 = new JTextField();
		txtfield1.setBounds(100,20,165,25);
		txtfield1.setFont(new Font(null, Font.PLAIN, 20));
		frame.getContentPane().add(txtfield1);
		
		
       // frame.add(txtfield1);
		
		
        
		
		
		

		 
		
		
		frame.setSize(500, 375);
		frame.setDefaultCloseOperation(3);
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
