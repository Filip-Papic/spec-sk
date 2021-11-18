package model;

import users.User;

public interface Storage {

	public void createDir(String path, String name);
	public void deleteDir(String path, String name);
	public void moveDir(String path1, String path2);
	
	public String getPath();
	public String getName();
	public User getUser();
	public boolean auth(String username, String password);
	
	public int setSize(int size);
	//public boolean noMemory(String error);
	
	public Directory rootDirectory(String path);
}
