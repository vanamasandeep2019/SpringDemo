package injection;

public class BaseBallCoach implements Coach{
	
	private FortuneService fortuneService;
	
	 public BaseBallCoach(FortuneService fortuneService) {
		this.fortuneService=fortuneService;
	}
	@Override
	public String getDailyWorkout() {
		return "Spend 20 Minutes";
	}
	
	public String getFortuneService() {
		return fortuneService.getFortune();
	}

}
