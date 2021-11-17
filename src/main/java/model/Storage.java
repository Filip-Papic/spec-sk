package model;

import users.User;

public interface Storage {

	public void create(String path, String name);
	
	public String getPath();
	public String getName();
	public User getUser();
	public boolean auth(String username, String password);
	
	public int setSize(int size);
	//public boolean noMemory(String error);
	
	public Directory rootDirectory(String path);
}
