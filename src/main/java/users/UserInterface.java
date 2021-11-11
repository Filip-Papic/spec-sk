package users;

public interface UserInterface {

	public boolean isRootUser(User user);
	public void connect(User user);
	public void disconnect(User user);
	public void checkPrivilege(User user);
}
