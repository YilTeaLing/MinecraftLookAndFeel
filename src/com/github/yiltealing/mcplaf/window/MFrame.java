package com.github.yiltealing.mcplaf.window;

import java.awt.Color;
import java.awt.Container;
import java.awt.GraphicsConfiguration;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JRootPane;

public class MFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	private boolean k = false;
	private int srcX, srcY;
	
	public MFrame() {
		super();
		initialize();
	}
	
	public MFrame(String title) {
		super(title);
		initialize();
	}
	
	public MFrame(GraphicsConfiguration gc) {
		super(gc);
		initialize();
	}
	
	public MFrame(String title, GraphicsConfiguration gc) {
		super(title, gc);
		initialize();
	}
	
	@Override
	public void setContentPane(Container contentPane) {
		
	}
	
	@Override
	public void pack() {
		System.out.println("[MinecraftLookAndFeel] Method pack is not supported at this time.");
	}
	
	private void initialize() {
		setUndecorated(true);
		setBackground(new Color(0, 0, 0, 0));
		setRootPane(new MinecraftRootPane());
		
		addMouseListener(new MouseListener() {
			@Override
			public void mouseReleased(MouseEvent e) {
				k = false;
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				if (e.getButton() == MouseEvent.BUTTON1) {
					srcX = e.getX();
					srcY = e.getY();
					k = true;
				}
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		
		addMouseMotionListener(new MouseMotionListener() {
			@Override
			public void mouseMoved(MouseEvent e) {
				
			}
			
			@Override
			public void mouseDragged(MouseEvent e) {
				if (k) {
					setLocation(e.getLocationOnScreen().x - srcX, e.getLocationOnScreen().y - srcY);
				}
			}
		});
	}
}
