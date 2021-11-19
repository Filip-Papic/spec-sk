package model;

import users.User;

public interface Directory {

	/**
	 * Create new directory
	 * 
	 * @param path - path where to create
	 * @param name - directory name
	 */
	public void create(String path, String name);
	
	/**
	 * Create multiple new directories
	 * 
	 * @param path - path where to create
	 * @param name - directory name
	 * @param amount - amount of directories to create
	 */
	public void createMultiple(String path, String name, int amount);
	
	/**
	 * Delete directory
	 * 
	 * @param path - path where directory is
	 * @param name - directory name
	 */
	public void delete(String path, String name);
	
	/**
	 * Move directory
	 * 
	 * @param path1 - path from where to move
	 * @param path2 - path where to move
	 */
	public void move(String path1, String path2);
	
	/**
	 * Max number of files allowed
	 * 
	 * @param fileCount - number of files
	 */
	public int fileCount(int fileCount);
	
	/**
	 * Make connection
	 * 
	 * @param user - which user to connect
	 */
	public boolean makeConnection(User user);//nzm gde da stavim
	
	/**
	 * Check privilage
	 * 
	 * @param user - check user privilage for directory
	 */
	public void checkPrivilegeDir(User user);
}
