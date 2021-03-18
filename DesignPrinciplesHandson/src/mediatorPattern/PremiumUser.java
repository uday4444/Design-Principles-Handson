package mediatorPattern;

public class PremiumUser implements User {
	private ChatMediator mediator;
	private String name;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public PremiumUser() {
		super();
	}

	
	public PremiumUser(ChatMediator chatMediator, String name) {
		super();
		this.mediator = chatMediator;
		this.name = name;
	}

	@Override
	public void send(String msg) {
		mediator.sendMessage(msg);

	}

	@Override
	public void receive(String msg) {
		System.out.println(msg+": Received Message from premium user:"+ name);

	}

}
