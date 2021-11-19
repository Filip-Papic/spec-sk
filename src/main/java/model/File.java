package model;

import users.User;

public interface File {

	public void create(String path, String name);
	public void createMultiple(String path, String name, int amount);
	
	public void delete(String path, String name);
	public void move(String path1, String path2);
	
	public void upload(String path, String dest);
	public void download(String path);
	
	public java.io.File[] lookup(String path, String name);
	
	public void downloadDrive(String name, String id);
	public void uploadDrive(String name, String id);

	public void lookupAllFilesinDir(String path, String name);
	public void lookupAllFilesInWholeDir(String path, String name);
	public void lookupAllFilesWithExtension(String path, String name);
	public void lookupAllFilesSortedName(String path, String name);
	public void lookupAllFilesSortedDate(String path, String name);
	public void lookupAllFilesSortedEdit(String path, String name);
	public void lookupAllFilesInDate(String path, String name);
	
	public void checkPrivilegeFile(User user);
}
