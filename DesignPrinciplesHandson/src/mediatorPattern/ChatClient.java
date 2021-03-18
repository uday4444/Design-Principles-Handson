package mediatorPattern;

import java.util.ArrayList;

public class ChatClient {

	public static void main(String[] args) {
		ChatMediatorImpl chatMediator = new ChatMediatorImpl();
		chatMediator.setUsers(new ArrayList<User>());

		BasicUser bUser = new BasicUser(chatMediator, "Basic User");
		PremiumUser pUser = new PremiumUser(chatMediator, "Premium User");

		chatMediator.addUser(bUser);
		chatMediator.addUser(pUser);

		chatMediator.sendMessage("Hi How are you!!");
	}

}