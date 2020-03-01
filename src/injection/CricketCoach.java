package injection;

public class CricketCoach implements Coach{
	
	private FortuneService fortuneService;
	
	private String emailAddress;
	
	private String team;
	
	public CricketCoach(){
		
	}
	
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	

	@Override
	public String getDailyWorkout() {
		return "Cricket workout";
	}
	
	
	public void setTeam(String team) {
		System.out.println("Setting Team");
		this.team = team;
		System.out.println("Email address="+team);
	}
	
	public void setEmailAddress(String emailAddress) {
		System.out.println("Setting email address");
		this.emailAddress = emailAddress;
		System.out.println("Email address="+emailAddress);
	}
	
	public String getEmail() {
		System.out.println("Setting Email");
		return emailAddress;
	}
	
	public String getTeam() {
		return team;
	}

	@Override
	public String getFortuneService() {
		System.out.println("Iam inside Setter method");
		return fortuneService.getFortune();
	}

}
