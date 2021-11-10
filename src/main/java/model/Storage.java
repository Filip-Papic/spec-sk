package model;

import users.User;

public interface Storage {

	public String getPath();
	public String getName();
	public User getUser();
	public boolean auth(String username, String password);
}
