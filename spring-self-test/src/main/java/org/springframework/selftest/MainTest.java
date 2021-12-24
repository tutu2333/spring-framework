package org.springframework.selftest;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.selftest.config.AppConfig;
import org.springframework.selftest.service.HelloService;

public class MainTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		HelloService helloService = ac.getBean(HelloService.class);
		helloService.hello();
	}

}
