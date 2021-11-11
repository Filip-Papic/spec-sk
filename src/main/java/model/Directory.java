package model;

import users.User;

public interface Directory {

	public void create(String path, String name);
	public void delete(String path, String name);
	public int fileCount(int fileCount);
	
	public boolean makeConnection(User user);//nzm gde da stavim
	
	public void checkPrivilegeDir(User user);
}
