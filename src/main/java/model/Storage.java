package model;

import users.User;

public interface Storage {

	/**
	 * Create new directory
	 * 
	 * @param path - path where to create
	 * @param name - directory name
	 */
	public void createDir(String path, String name);
	
	/**
	 * Create multiple new directories
	 * 
	 * @param path - path where to create
	 * @param name - directory name
	 * @param i - amount of directories to create
	 */
	public void createMultipleDirs(String path, String name, int i);
	
	/**
	 * Delete directory
	 * 
	 * @param path - path where directory is
	 * @param name - directory name
	 */
	public void deleteDir(String path, String name);
	
	/**
	 * Move directory
	 * 
	 * @param path1 - path from where to move
	 * @param path2 - path where to move
	 */
	public void moveDir(String path1, String path2);
	
	/**
	 * Upload file
	 * 
	 * @param dest - path to upload file/files to
	 * @param paths - paths of files to upload
	 */
	public void uploadFile(String dest, String... paths);
	
	/**
	 * Download file
	 * 
	 * @param paths - path/paths to download file from
	 */
	public void downloadFile(String... paths);
	
	/**
	 * Return all file names
	 * 
	 * @param fileID - path/id to directory where to look
	 */
	public void listFilesInDir(String fileID);
	
	/**
	 * Return all directory names in directory
	 * 
	 * @param fileID - path to directory where to look
	 */
	public void listDirsInDir(String fileID);
	

	public void findFIlesByName(String name);
	public void listFilesByCreationDate(String operator, String date);
	


	/**
	 * Create new file
	 * 
	 * @param path - path where to create
	 * @param name - file name
	 */

	public void createFile(String path, String name);
	
	/**
	 * Create multiple new files
	 * 
	 * @param path - path where to create
	 * @param name - file name
	 * @param i - amount of files to create
	 */
	public void createMultipleFiles(String path, String name, int i);
	
	/**
	 * Delete file
	 * 
	 * @param path - path where directory is
	 * @param name - file name
	 */
	public void deleteFile(String path, String name);
	
	/**
	 * Move file
	 * 
	 * @param path1 - path from where to move
	 * @param path2 - path where to move
	 */
	public void moveFile(String path1, String path2);
	
	/**
	 * return path
	 * 
	 * @return
	 */
	public String getPath();
	
	/**
	 * return name
	 * 
	 * @return
	 */
	public String getName();
	
	/**
	 * return user
	 * 
	 * @return
	 */
	public User getUser();
	
	/**
	 * User authentication to storage
	 * 
	 * @param username - users unique username
	 * @param password - users password
	 * @return
	 */
	public boolean auth(String username, String password);
	
	/**
	 * Set max size of directory
	 * 
	 * @param size - max number of files in directory
	 * @return
	 */
	public int setSize(int size);
	
	/**
	 * Return path to root directory
	 * 
	 * @return
	 */
	public Directory rootDirectory();
}
