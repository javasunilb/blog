package com.skb.prop.conf;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PropertyUsingValue {
	
	@Value("${spring.properties.val}")
	private String springMsg;
	
	@Value("${custom.msg}")
	private String customMsg;

	public String getSpringMsg() {
		return springMsg;
	}
	public String getCustomMsg() {
		return customMsg;
	}
}
