package com.github.yiltealing.mcplaf;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import com.github.yiltealing.TestFrame;

public class MinecraftPane extends Container {
	private static final long serialVersionUID = 1L;
	
	private ControlBar control;
	
	private static final Color WINDOW_FILL = MinecraftStyle.getColor("windowFill");
	private static final Color WINDOW_BORDER = MinecraftStyle.getColor("windowBorder");
	private static final Color WINDOW_HIGHLIGHT = MinecraftStyle.getColor("windowHighlight");
	private static final Color WINDOW_SHADOW = MinecraftStyle.getColor("windowShadow");
	
	@Override
	public void paint(Graphics g) {
		paint2x(g);
		super.paint(g);
	}
	
	public void paint2x(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		g2d.setStroke(new BasicStroke(2));
		
		g2d.setColor(WINDOW_FILL);
		//Background color
		g2d.fill(new Rectangle(6, 6, getWidth() - 12, getHeight() - 12));
		//The transition block at top right
		g2d.drawRect(getWidth() - 5, 5, 0, 0);
		
		g2d.setColor(WINDOW_BORDER);
		//Top
		g2d.drawLine(7, 1, getWidth() - 7, 1);
		//Left
		g2d.drawLine(1, 7, 1, getHeight() - 7);
		//Bottom
		g2d.drawLine(7, getHeight() - 1, getWidth() - 7, getHeight() - 1); 
		//Right
		g2d.drawLine(getWidth() - 1, 7, getWidth() - 1, getHeight() - 7);
		
		//Top left
		g2d.draw(new Rectangle(5, 3, 0, 0));
		g2d.draw(new Rectangle(3, 5, 0, 0));
		//Top right
		g2d.draw(new Rectangle(getWidth() - 5, 3, 0, 0));
		g2d.draw(new Rectangle(getWidth() - 3, 5, 0, 0));
		//Bottom left
		g2d.draw(new Rectangle(3, getHeight() - 5, 0, 0));
		g2d.draw(new Rectangle(5, getHeight() - 3, 0, 0));
		//Bottom right
		g2d.draw(new Rectangle(getWidth() - 5, getHeight() - 3, 0, 0));
		g2d.draw(new Rectangle(getWidth() - 3, getHeight() - 5, 0, 0));
		
		g2d.setColor(WINDOW_HIGHLIGHT);
		//Top
		g2d.fill(new Rectangle(6, 2, getWidth() - 12, 4));
		//Left
		g2d.fill(new Rectangle(2, 6, 4, getHeight() - 12));
		//The transition block at top left
		g2d.fill(new Rectangle(4, 4, 4, 4));
		
		g2d.setColor(WINDOW_SHADOW);
		//Bottom
		g2d.fill(new Rectangle(6, getHeight() - 6, getWidth() - 12, 4));
		//Right
		g2d.fill(new Rectangle(getWidth() - 6, 6, 4, getHeight() - 12));
		//The transition block at bottom left
		g2d.drawRect(5, getHeight() - 5, 0, 0);
		//The shadow block at bottom right
		g2d.fill(new Rectangle(getWidth() - 8, getHeight() - 8, 4, 4));
		
	}
	
	public void paint4x(Graphics g) {
		
	}
}

class ControlBar {
	public static final int NONE = 0x0;
	public static final int CLOSE = 0x1;
	public static final int MIN = 0x2;
	public static final int MAX = 0x4;
	public static final int HELP = 0x8;
	
	private static final Color CONTROL_FILL = MinecraftStyle.getColor("controlFill");
	private static final Color CONTROL_BORDER = MinecraftStyle.getColor("controlBorder");
	private static final Color CONTROL_HIGHLIGHT = MinecraftStyle.getColor("controlHighlight");
	private static final Color CONTROL_SHADOW = MinecraftStyle.getColor("controlShadow");
	
	private int windowWidth, windowHeight;
	private int width, height;
	private int operation;
	
	public ControlBar() {
		
	}
	
	public ControlBar(int defaultOperation) {
		operation = defaultOperation;
	}
	
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}
	
	protected void setSize(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public void paint(Graphics g, int windowWidth, int windowHeight) {
		paint2x(g);
	}
	public void paint2x(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		g2d.setStroke(new BasicStroke(2));
		g2d.setColor(CONTROL_FILL);
		//Background color
		g2d.fill(new Rectangle(6, 6, getWidth() - 12, getHeight() - 6));
		//The transition block at top right
		g2d.drawRect(getWidth() - 5, 5, 0, 0);
		
		g2d.setColor(CONTROL_BORDER);
		//Top
		g2d.drawLine(7, 1, getWidth() - 7, 1);
		//Left
		g2d.drawLine(1, 7, 1, getHeight() - 1);
		//Right
		g2d.drawLine(getWidth() - 1, 7, getWidth() - 1, getHeight() - 1);
		
		//Top left
		g2d.draw(new Rectangle(5, 3, 0, 0));
		g2d.draw(new Rectangle(3, 5, 0, 0));
		//Top right
		g2d.draw(new Rectangle(getWidth() - 5, 3, 0, 0));
		g2d.draw(new Rectangle(getWidth() - 3, 5, 0, 0));
		
		g2d.setColor(CONTROL_HIGHLIGHT);
		//Top
		g2d.fill(new Rectangle(6, 2, getWidth() - 12, 4));
		//Left
		g2d.fill(new Rectangle(2, 6, 4, getHeight() - 6));
		//The transition block at top left
		g2d.fill(new Rectangle(4, 4, 4, 4));
		
		g2d.setColor(CONTROL_SHADOW);
		//Right
		g2d.fill(new Rectangle(getWidth() - 6, 6, 4, getHeight() - 6));
	}
	
	public void paint4x(Graphics g) {
		
	}
}
