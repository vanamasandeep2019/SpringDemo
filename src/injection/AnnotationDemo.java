package injection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemo {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("annotation.xml");
		//When we use @Component spring will create default component id starting with small letter.
	//	We can explicitly specify component Id or spring will create default id as below.
		Coach coach=context.getBean("tennisCoach",Coach.class);
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getFortuneService());
	}

}
