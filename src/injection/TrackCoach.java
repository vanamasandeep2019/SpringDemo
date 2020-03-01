package injection;

public class TrackCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Iam a track coach";
	}

	@Override
	public String getFortuneService() {
		return "Fortune for track coach";
	}
	
	//add an init method
	
	public void initMethod(){
		System.out.println("Startup activities");
	}
	
	//add destroy method
	public void destroyMethod(){
		System.out.println("Destroy Activities");
	}
	
}
