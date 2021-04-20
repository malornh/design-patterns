package observer;

public class AirsoftSubscriber implements Observer {

	private String name;
	private Observable airsoft;
	
	public AirsoftSubscriber(String name) {
		this.name = name;
	}

	@Override
	public void update() {
		
		if(this.airsoft == null) {
			System.out.println(this.getName() + " no ");
			return;
		}

		String latestairsoft = this.airsoft.getUpdate();
		System.out.println(this.getName() + " received an update: " + latestairsoft);

	}

	@Override
	public void setAirsoft(Observable airsoft) {
		this.airsoft = airsoft;
	}

	public String getName() {
		return name;
	}

}
