package com.skb.prop.conf;

import java.util.Properties;

public class PropertyUsingPropertyClass {
	private static final Properties customProp = new Properties();
	
	static {
		try {
			customProp.load(PropertyUsingPropertyClass.class.getResourceAsStream("/custom-msg.properties"));
		}catch(Exception ex) {
			System.out.println("Exception during loading property file");
		}
	}
	
	public static String getCustomMessage(String key) {
		return customProp.getProperty(key);
	}
}
