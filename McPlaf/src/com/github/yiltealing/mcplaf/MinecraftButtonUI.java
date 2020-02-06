package com.github.yiltealing.mcplaf;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import javax.swing.AbstractButton;
import javax.swing.JComponent;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicButtonUI;

import sun.awt.AppContext;

public class MinecraftButtonUI extends BasicButtonUI {
	private static final Object MINECRAFT_BUTTON_UI_KEY = new Object();
	
	private static final Color BUTTON_PLAIN = MinecraftStyle.getColor("plain");
	private static final Color BUTTON_HIGHLIGHT = MinecraftStyle.getColor("highlight");
	private static final Color BUTTON_SHADOW = MinecraftStyle.getColor("shadow");
	private static final Color ACTIVE_BUTTON_BORDER = MinecraftStyle.getColor("activeBorder");
	private static final Color INACTIVE_BUTTON_BORDER = MinecraftStyle.getColor("inactiveBorder");
	private static final Color TRANSITION_HIGH = MinecraftStyle.getColor("transitionHigh");
	private static final Color TRANSITION_MIDDLE = MinecraftStyle.getColor("transitionMiddle");
	private static final Color TRANSITION_LOW = MinecraftStyle.getColor("transitionLow");
	
	public static ComponentUI createUI(JComponent c) {
		AppContext appContext = AppContext.getAppContext();
		MinecraftButtonUI minecraftButtonUI = (MinecraftButtonUI) appContext.get(MINECRAFT_BUTTON_UI_KEY);
		if (minecraftButtonUI == null) {
			minecraftButtonUI = new MinecraftButtonUI();
			appContext.put(MINECRAFT_BUTTON_UI_KEY, minecraftButtonUI);
		}
		return minecraftButtonUI;
	}
	
	@Override
	protected void installDefaults(AbstractButton b) {
		super.installDefaults(b);
	}
	
	@Override
	protected void paintFocus(Graphics g, AbstractButton b, Rectangle viewRect, Rectangle textRect, Rectangle iconRect) {
		Graphics2D g2d = (Graphics2D) g;
		g2d.setStroke(new BasicStroke(2));
		g2d.setColor(ACTIVE_BUTTON_BORDER);
		//g2d.drawRect(1, 1, b.getWidth() - 2, b.getHeight() - 2);
	}
	
	@Override
	protected void paintButtonPressed(Graphics g, AbstractButton b) {
		Graphics2D g2d = (Graphics2D) g;
		g2d.setStroke(new BasicStroke(5));
		g2d.setColor(Color.RED);
		g2d.drawLine(0, 0, 20, 0);
	}
	
	public void paint(Graphics g, JComponent c) {
		Graphics2D g2d = (Graphics2D) g;
		g2d.setStroke(new BasicStroke(2));
		g2d.setColor(BUTTON_PLAIN);
		g2d.fill(new Rectangle(0, 0, c.getWidth(), c.getHeight()));
		g2d.setColor(INACTIVE_BUTTON_BORDER);
		g2d.drawRect(1, 1, c.getWidth() - 2, c.getHeight() - 2);
		g2d.setColor(BUTTON_HIGHLIGHT);
		g2d.drawLine(3, 3, c.getWidth() - 3, 3);
		g2d.drawLine(3, 3, 3, c.getHeight() - 3);
		g2d.setColor(BUTTON_SHADOW);
		g2d.drawLine(c.getWidth() - 3, 3, c.getWidth() - 3, c.getHeight() - 3);
		g2d.drawLine(3, c.getHeight() - 3, c.getWidth() - 3, c.getHeight() - 3);
		g2d.setColor(TRANSITION_HIGH);
		g2d.drawRect(3, 3, 0, 0);
		g2d.setColor(TRANSITION_MIDDLE);
		g2d.drawRect(c.getWidth() - 3, 3, 0, 0);
		g2d.drawRect(3, c.getHeight() - 3, 0, 0);
		g2d.setColor(TRANSITION_LOW);
		g2d.drawRect(c.getWidth() - 3, c.getHeight() - 3, 0, 0);
		super.paint(g, c);
	}
}
