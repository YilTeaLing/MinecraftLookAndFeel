package com.github.yiltealing.mcplaf;

import javax.swing.plaf.basic.BasicTextFieldUI;

import sun.awt.AppContext;

import java.awt.AlphaComposite;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.image.BufferedImage;
import javax.swing.AbstractButton;
import javax.swing.BoundedRangeModel;
import javax.swing.JComponent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.AbstractBorder;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicButtonUI;


public class MinecraftTextFieldUI  extends BasicTextFieldUI {
	private static final Object MINECRAFT_TEXT_FIELD_UI = new Object();
	
	public static ComponentUI createUI(JComponent c)
	{
		AppContext appContext = AppContext.getAppContext();
		MinecraftTextFieldUI minecraftbuttonui = (MinecraftTextFieldUI) appContext.get(MINECRAFT_TEXT_FIELD_UI);
		if (minecraftbuttonui == null) {
			minecraftbuttonui = new MinecraftTextFieldUI();
			appContext.put(MINECRAFT_TEXT_FIELD_UI, minecraftbuttonui);
		}
		return minecraftbuttonui;
	}
	
	
}
