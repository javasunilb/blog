package com.skb.prop.conf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class PropertyUsingEnvironment {

	@Autowired
	private Environment env;
	
	public String getCustomMsg() {
		return env.getProperty("custom.msg");
	}
	
	public String getSpringMsg() {
		return env.getProperty("spring.properties.val");
	}
}
