package injection;

public class CricketCoach implements Coach{
	
	private FortuneService fortuneService;
	
	public CricketCoach(){
		
	}
	
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	

	@Override
	public String getDailyWorkout() {
		return "Cricket workout";
	}

	@Override
	public String getFortuneService() {
		return fortuneService.getFortune();
	}

}
