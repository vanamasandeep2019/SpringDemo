package injection;

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
		System.out.println(coach.getFortuneService());
		
		Coach trackCoach=context.getBean("myTrackCoach",Coach.class);
		System.out.println(trackCoach.getDailyWorkout());
	}

}
