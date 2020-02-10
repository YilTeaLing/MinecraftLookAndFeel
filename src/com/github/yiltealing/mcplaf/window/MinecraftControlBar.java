package com.github.yiltealing.mcplaf.window;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import com.github.yiltealing.mcplaf.MinecraftStyle;

public class MinecraftControlBar extends Container {
	private static final long serialVersionUID = 1L;
	
	public static final int NONE = 0x0;
	public static final int CLOSE = 0x1;
	public static final int MIN = 0x2;
	public static final int MAX = 0x4;
	public static final int HELP = 0x8;
	
	private static final Color CONTROL_FILL = MinecraftStyle.getColor("controlFill");
	private static final Color CONTROL_BORDER = MinecraftStyle.getColor("controlBorder");
	private static final Color CONTROL_HIGHLIGHT = MinecraftStyle.getColor("controlHighlight");
	private static final Color CONTROL_SHADOW = MinecraftStyle.getColor("controlShadow");
	
	private int operation;
	
	public MinecraftControlBar() {
		super();
	}
	
	public MinecraftControlBar(int defaultOperation) {
		super();
		operation = defaultOperation;
	}
	
	public MinecraftControlBar(int width, int height) {
		super();
		super.setSize(width, height);
	}
	
	public MinecraftControlBar(int width, int height, int defaultOperation) {
		super();
		super.setSize(width, height);
		operation = defaultOperation;
	}
	
	public void paint(Graphics g) {
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
}
