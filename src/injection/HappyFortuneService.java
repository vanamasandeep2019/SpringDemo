package injection;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is great";
	}

}
