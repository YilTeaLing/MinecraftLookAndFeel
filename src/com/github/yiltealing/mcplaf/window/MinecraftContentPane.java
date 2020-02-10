package com.github.yiltealing.mcplaf.window;

import java.awt.Container;
import java.awt.Graphics;
import java.awt.LayoutManager;

public class MinecraftContentPane extends Container {
	private static final long serialVersionUID = 1L;
	
	private MinecraftControlBar controlBar;
	
	public MinecraftContentPane() {
		setLayout(null);
		controlBar = new MinecraftControlBar();
		add(controlBar);
	}
	
	@Override
	public void setLayout(LayoutManager mgr) {
		System.out.println("[MinecraftLookAndFeel] Method setLayout is not supported at this time.");
	}
	
	@Override
	public void paint(Graphics g) {
		paintComponents(g);
	}
}
