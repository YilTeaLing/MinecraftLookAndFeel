package com.github.yiltealing.mcplaf;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

public class MFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	private static boolean k = false;
	private static int srcX, srcY;
	
	private static final Color WINDOW_FILL = MinecraftStyle.getColor("windowFill");
	private static final Color WINDOW_BORDER = MinecraftStyle.getColor("windowBorder");
	private static final Color WINDOW_HIGHLIGHT = MinecraftStyle.getColor("windowHighlight");
	private static final Color WINDOW_SHADOW = MinecraftStyle.getColor("windowShadow");
	
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
		setBackground(new Color(255, 0, 255, 254));
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
	
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setStroke(new BasicStroke(2));
		
		g2d.setColor(WINDOW_FILL);
		g2d.fill(new Rectangle(6, 6, getWidth() - 12, getHeight() - 12));
		g2d.drawRect(getWidth() - 5, 5, 0, 0);
		
		g2d.setColor(WINDOW_BORDER);
		g2d.drawLine(7, 1, getWidth() - 7, 1);
		g2d.drawLine(1, 7, 1, getHeight() - 7);
		g2d.drawLine(7, getHeight() - 1, getWidth() - 7, getHeight() - 1);
		g2d.drawLine(getWidth() - 1, 7, getWidth() - 1, getHeight() - 7);
		
		g2d.draw(new Rectangle(5, 3, 0, 0));
		g2d.draw(new Rectangle(3, 5, 0, 0));
		g2d.draw(new Rectangle(getWidth() - 5, 3, 0, 0));
		g2d.draw(new Rectangle(getWidth() - 3, 5, 0, 0));
		g2d.draw(new Rectangle(3, getHeight() - 5, 0, 0));
		g2d.draw(new Rectangle(5, getHeight() - 3, 0, 0));
		g2d.draw(new Rectangle(getWidth() - 5, getHeight() - 3, 0, 0));
		g2d.draw(new Rectangle(getWidth() - 3, getHeight() - 5, 0, 0));
		
		g2d.setColor(WINDOW_HIGHLIGHT);
		g2d.fill(new Rectangle(6, 2, getWidth() - 12, 4));
		g2d.fill(new Rectangle(2, 6, 4, getHeight() - 12));
		g2d.fill(new Rectangle(4, 4, 4, 4));
	}
}
