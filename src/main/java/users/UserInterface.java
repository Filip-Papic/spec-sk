package users;

public interface UserInterface {

	/**
	 * Check if user is root user
	 * @param user - check user
	 * @return
	 */
	public boolean isRootUser(User user);
	
	/**
	 * Make connection
	 * @param user - which user to connect
	 */
	public void connect(User user);
	
	/**
	 * Disconnect user
	 * @param user - which user to connect
	 */
	public void disconnect(User user);
	
	/**
	 * Check privilage
	 * @param user - check user privilage
	 */
	public void checkPrivilege(User user);
}
