package com.yiibai.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yiibai.config.AppConfig;
import com.yiibai.hello.HelloWorld;

public class App {
	public static void main(String[] args) {
		ApplicationContext contest = new AnnotationConfigApplicationContext(AppConfig.class);
		HelloWorld obj = (HelloWorld) contest.getBean("helloBean");
		obj.printHelloWorld("lizhengxiang");
	}
}
