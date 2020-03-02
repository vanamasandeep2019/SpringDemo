package injection;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{

	@Override
	public String getDailyWorkout() {
		return "Tennis Daily Workout";
	}

	@Override
	public String getFortuneService() {
		return "Tennis FortuneService";
	}
	
	

}
