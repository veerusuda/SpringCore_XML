package com.spring.learning.springxml;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.learning.springxml.Mobile;

@SpringBootApplication
public class SpringxmlApplication {

	public static void main(String[] args) {
		
		/*Resource res = new ClassPathResource("spring.xml");
        BeanFactory context = new XmlBeanFactory(res);*/
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		//Mobile mobile = (Mobile) context.getBean("mobile1");
		Mobile mobile = (Mobile) context.getBean("mobile");
		mobile.getMobileDetails();
	}
}

