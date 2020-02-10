package com.github.yiltealing.mcplaf.window;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import javax.swing.JRootPane;

import com.github.yiltealing.mcplaf.MinecraftStyle;

public class MinecraftRootPane extends JRootPane {
	private static final long serialVersionUID = 1L;
	
	private static final Color WINDOW_FILL = MinecraftStyle.getColor("windowFill");
	private static final Color WINDOW_BORDER = MinecraftStyle.getColor("windowBorder");
	private static final Color WINDOW_HIGHLIGHT = MinecraftStyle.getColor("windowHighlight");
	private static final Color WINDOW_SHADOW = MinecraftStyle.getColor("windowShadow");
	
	public MinecraftRootPane() {
		setContentPane(new MinecraftContentPane());
	}
	
	public void paint(Graphics g) {
		setBackground(new Color(0, 0, 0, 0));
		Graphics2D g2d = (Graphics2D) g;
		g2d.setStroke(new BasicStroke(2));

		g2d.setColor(WINDOW_FILL);
		//Background color
		g2d.fill(new Rectangle(6, 6, getWidth() - 12, getHeight() - 12));
		//The transition block at top right
		g2d.drawRect(getWidth() - 5, 5, 0, 0);
		
		g2d.setColor(WINDOW_BORDER);
		//Top
		g2d.drawLine(7, 1, getWidth() - 7,1);
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
		
		paintChildren(g);
	}
}
