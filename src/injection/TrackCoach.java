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

}
