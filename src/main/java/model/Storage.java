package model;

import users.User;

public interface Storage {

	public void createDir(String path, String name);
	public void createMultipleDirs(String path, String name, int i);
	public void deleteDir(String path, String name);
	public void moveDir(String path1, String path2);
	
	public void uploadFile(String dest, String... paths);
	public void downloadFile(String... paths);
	
	public void listFilesInDir(String fileID);
	public void listDirsInDir(String fileID);
	
	public void createFile(String path, String name);
	public void createMultipleFiles(String path, String name, int i);
	public void deleteFile(String path, String name);
	public void moveFile(String path1, String path2);
	
	public String getPath();
	public String getName();
	public User getUser();
	public boolean auth(String username, String password);
	
	public int setSize(int size);
	//public boolean noMemory(String error);
	
	public Directory rootDirectory(String path);
}
