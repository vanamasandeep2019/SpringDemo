package helloworld;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import injection.Coach;

public class BeanScopeDemoApp {
	
	public static void main(String[] args) {
		
		//load the spring configuration file
		ClassPathXmlApplicationContext context=
				new ClassPathXmlApplicationContext("beanscope.xml");
		Coach coach=context.getBean("myCoach",Coach.class);
		
		Coach coach1=context.getBean("myCoach",Coach.class);
		
		//Example for singleton scope
		if(coach==coach1){
			System.out.println("Both are equal");
		}else
		{
			System.out.println("Both are not equal");
		}
		
		
		Coach coach3=context.getBean("myCoach1",Coach.class);
		
		Coach coach4=context.getBean("myCoach1",Coach.class);
		//retrieve bean from spring container
		
		
		// Example for prototype scope
		if(coach3==coach4){
			System.out.println("Both are equal");
		}else
		{
			System.out.println("Both are not equal");
		}
		
		
	}

}
