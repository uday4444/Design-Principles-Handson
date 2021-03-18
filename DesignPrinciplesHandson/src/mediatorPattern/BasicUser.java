package mediatorPattern;

public class BasicUser implements User {
	public static ChatMediator mediator;
	public static String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BasicUser(ChatMediator med, String name) {
		super();
		BasicUser.mediator = med;
		this.name = name;

	}

	@Override
	public void send(String msg) {
		System.out.println(msg + ":Sending message");
		mediator.sendMessage(msg);

	}

	@Override
	public void receive(String msg) {
		System.out.println(msg + ": Received Message to " + name);

	}

}
