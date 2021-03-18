package mediatorPattern;

import java.util.ArrayList;
import java.util.List;

public class ChatMediatorImpl implements ChatMediator {

	private List<User> users;
	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	
	@Override
	public void addUser(User user) {
		users.add(user);
	}

	@Override
	public void sendMessage(String msg) {
		for (User u : users) {
			
				u.receive(msg);
			}
		}
	

}
