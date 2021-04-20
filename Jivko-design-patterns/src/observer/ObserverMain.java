package observer;

public class ObserverMain {

	public static void main(String[] args) {


		Airsoft airsoft = new Airsoft();
		
		Observer obs1 = new AirsoftSubscriber("Airsofter1");
		Observer obs2 = new AirsoftSubscriber("Airsofter2");
		Observer obs3 = new AirsoftSubscriber("Airsofter3");
		
		airsoft.subscribe(obs1);
		airsoft.subscribe(obs2);
		airsoft.subscribe(obs3);
		
		airsoft.setAirsoft("Breaking news: Airsoft event");	
		airsoft.setAirsoft("Breaking news: Airsoft summer event");

	}

}
