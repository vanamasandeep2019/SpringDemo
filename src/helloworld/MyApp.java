package helloworld;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
	
	public static void main(String[] args) {
		
		// create the object
		/*Coach coach=new TrackCoach();
		System.out.println(coach.getDailyWorkout());*/
		
		ClassPathXmlApplicationContext context=
				new ClassPathXmlApplicationContext("beans.xml");
		
		Coach coach=context.getBean("myCoach",Coach.class);
		System.out.println(coach.getDailyWorkout());
		
		Coach trackCoach=context.getBean("myTrackCoach",Coach.class);
		System.out.println(trackCoach.getDailyWorkout());
	}

}
