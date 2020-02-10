package com.github.yiltealing.mcplaf;

import java.awt.Color;
import java.awt.GraphicsConfiguration;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

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
	
	private void initialize() {
		setUndecorated(true);
		setBackground(new Color(0, 0, 0, 0));
		setContentPane(new MinecraftPane());
		
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
