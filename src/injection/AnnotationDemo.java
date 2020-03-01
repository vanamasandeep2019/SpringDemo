package injection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemo {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("annotation.xml");
		Coach coach=context.getBean("tenniscoach",Coach.class);
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getFortuneService());
	}

}
