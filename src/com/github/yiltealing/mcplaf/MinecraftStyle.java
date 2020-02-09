package com.github.yiltealing.mcplaf;

import java.awt.Color;
import java.util.HashMap;

public class MinecraftStyle {
	private static HashMap<String, Color> colorMap;
	private static HashMap<String, Color> javaColorMap;
	private static HashMap<String, Color> bedrockColorMap;
	private static final Color UNKNOWN_COLOR = new Color(136, 72, 152);
	
	private static Resolution resolution;
	
	protected static void updateColorMap() {
		initialize();
	}
	
	private static void initialize() {
		javaColorMap = new HashMap<String, Color>();
		
		bedrockColorMap = new HashMap<String, Color>();
		//Window
		bedrockColorMap.put("windowFill", new Color(198, 198, 198));
		bedrockColorMap.put("windowBorder", new Color(0, 0, 0));
		bedrockColorMap.put("windowHighlight", new Color(255, 255, 255));
		bedrockColorMap.put("windowShadow", new Color(85, 85, 85));
		
		//ControlBar
		bedrockColorMap.put("controlFill", new Color(72, 72, 72));
		bedrockColorMap.put("controlBorder", new Color(0, 0, 0));
		bedrockColorMap.put("controlHighlight", new Color(115, 115, 115));
		bedrockColorMap.put("controlShadow", new Color(46, 45, 48));
		
		//Button
		bedrockColorMap.put("buttonFill", new Color(198, 198, 198));
		bedrockColorMap.put("buttonActiveBorder", new Color(255, 255, 255));
		bedrockColorMap.put("buttonInactiveBorder", new Color(19, 19, 19));
		bedrockColorMap.put("buttonHighlight", new Color(247, 247, 247));
		bedrockColorMap.put("buttonShadow", new Color(101, 100, 101));
		bedrockColorMap.put("buttonActiveText", new Color(255, 255, 255));
		bedrockColorMap.put("buttonInactiveText", new Color(76, 76, 76));
		bedrockColorMap.put("buttonTransitionHigh", new Color(254, 254, 254));
		bedrockColorMap.put("buttonTransitionMiddle", new Color(192, 191, 192));
		bedrockColorMap.put("buttonTransitionLow", new Color(89, 87, 89));
		
		colorMap = bedrockColorMap;
		resolution = Resolution.AUTO;
	}
	
	protected static Color getColor(String key) {
		return colorMap.get(key) != null ? colorMap.get(key) : UNKNOWN_COLOR;
	}
	
	protected void setResolution(Resolution r) {
		resolution = r;
	}
	enum Edition {
		JAVA_EDITION, BEDROCK_EDITION
	}
	
	enum Resolution {
		LOW, MIDDLE, HIGH, AUTO
	}
}
