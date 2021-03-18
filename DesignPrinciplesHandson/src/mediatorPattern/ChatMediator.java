package mediatorPattern;

public interface ChatMediator {

	public void sendMessage(String msg);

	void addUser(User user);
}
