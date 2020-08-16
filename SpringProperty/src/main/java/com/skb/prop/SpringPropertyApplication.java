package com.skb.prop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;

import com.skb.prop.conf.PropertyUsingConfigurationProp;

@SpringBootApplication
@PropertySource(value= {"classpath:application.properties","classpath:custom-msg.properties"})
public class SpringPropertyApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringPropertyApplication.class, args);
		
//		PropertyUsingValue puv = context.getBean(PropertyUsingValue.class);
//		System.out.println(puv.getCustomMsg());
//		System.out.println(puv.getSpringMsg());
		
		
//		PropertyUsingEnvironment propEnv = context.getBean(PropertyUsingEnvironment.class);
//		System.out.println(propEnv.getCustomMsg());
//		System.out.println(propEnv.getSpringMsg());
//		
		PropertyUsingConfigurationProp pucp = context.getBean(PropertyUsingConfigurationProp.class);
		System.out.println(pucp.getMsg());
		
		//System.out.println(PropertyUsingPropertyClass.getCustomMessage("custom.greet"));
	}

}
