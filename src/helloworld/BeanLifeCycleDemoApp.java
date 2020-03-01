package helloworld;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import injection.Coach;

public class BeanLifeCycleDemoApp {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context=
				new ClassPathXmlApplicationContext("beanlifecycle.xml");
		Coach coach=context.getBean("myCoach",Coach.class);
		context.close();
		
		
	}

}
