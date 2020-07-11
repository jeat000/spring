package com.demo.test;

import com.demo.AppConfig;
import com.demo.service.IndexService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author chenjian
 * @desc
 * @date Created in 2020/7/3 16:18
 */
public class MyTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		IndexService indexService = applicationContext.getBean(IndexService.class);
		indexService.say("hello spring");
	}
}
