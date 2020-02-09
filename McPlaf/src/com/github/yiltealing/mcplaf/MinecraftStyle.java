package com.github.yiltealing.mcplaf;

import java.awt.Color;
import java.util.HashMap;

public class MinecraftStyle {
	private static HashMap<String, Color> colorMap;
	private static final Color UNKNOWN_COLOR = new Color(255, 0, 255);
	
	protected static void updateColorMap() {
		initialize();
	}
	
	private static void initialize() {
		colorMap = new HashMap<String, Color>();
		
		colorMap = new HashMap<String, Color>();
		//Window
		colorMap.put("windowFill", new Color(198, 198, 198));
		colorMap.put("windowBorder", new Color(0, 0, 0));
		colorMap.put("windowHighlight", new Color(255, 255, 255));
		colorMap.put("windowShadow", new Color(85, 85, 85));
		
		//ControlBar
		colorMap.put("controlFill", new Color(72, 72, 72));
		colorMap.put("controlBorder", new Color(0, 0, 0));
		colorMap.put("controlHighlight", new Color(115, 115, 115));
		colorMap.put("controlShadow", new Color(46, 45, 48));
		
		//Button
		colorMap.put("buttonFill", new Color(198, 198, 198));
		colorMap.put("buttonActiveBorder", new Color(255, 255, 255));
		colorMap.put("buttonInactiveBorder", new Color(19, 19, 19));
		colorMap.put("buttonHighlight", new Color(247, 247, 247));
		colorMap.put("buttonShadow", new Color(101, 100, 101));
		colorMap.put("buttonActiveText", new Color(255, 255, 255));
		colorMap.put("buttonInactiveText", new Color(76, 76, 76));
		colorMap.put("buttonTransitionHigh", new Color(254, 254, 254));
		colorMap.put("buttonTransitionMiddle", new Color(192, 191, 192));
		colorMap.put("buttonTransitionLow", new Color(89, 87, 89));
		colorMap.put("buttonPressedFill", new Color(139, 139, 139));
		
	}
	
	protected static Color getColor(String key) {
		return colorMap.get(key) != null ? colorMap.get(key) : UNKNOWN_COLOR;
	}
}
