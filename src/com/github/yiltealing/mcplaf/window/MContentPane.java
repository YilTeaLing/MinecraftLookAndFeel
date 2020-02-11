package com.github.yiltealing.mcplaf.window;

import java.awt.Container;
import java.awt.Graphics;

public class MContentPane extends Container {
	private static final long serialVersionUID = 1L;
	
	@Override
	public void paint(Graphics g) {
		paintComponents(g);
	}
}
