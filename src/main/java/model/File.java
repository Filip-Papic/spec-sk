package model;

import java.util.Date;

import users.User;

public interface File {
	
	/**
	 * Create new file
	 * 
	 * @param path - path where to create
	 * @param name - file name
	 */
	public void create(String path, String name);
	
	/**
	 * Create multiple new files
	 * 
	 * @param path - path where to create
	 * @param name - file name
	 * @param amount - amount of files to create
	 */
	public void createMultiple(String path, String name, int amount);
	
	/**
	 * Delete file
	 * 
	 * @param path - path where directory is
	 * @param name - file name
	 */
	public void delete(String path, String name);
	
	/**
	 * Move file
	 * 
	 * @param path1 - path from where to move
	 * @param path2 - path where to move
	 */
	public void move(String path1, String path2);
	
	/**
	 * Upload file
	 * 
	 * @param path - path to file
	 * @param dest - path to upload file to 
	 */
	public void upload(String path, String dest);
	
	/**
	 * Download file
	 * 
	 * @param path - path to download file from
	 */
	public void download(String path);
	
	/**
	 * Download file from Google Drive
	 * 
	 * @param name - file name
	 * @param id - path to download file from
	 */
	public void downloadDrive(String name, String id);
	
	/**
	 * Upload file to Google Drive
	 * 
	 * @param name - file name
	 * @param id - path to upload file to
	 */
	public void uploadDrive(String name, String id);
	
	/**
	 * Find file
	 * 
	 * @param path - path to location where to look
	 * @param name - file name to look for
	 * @return
	 */
	public java.io.File[] lookup(String path, String name);

	/**
	 * Return all file names in directory
	 * 
	 * @param path - path to directory where to look
	 */
	public void lookupAllFilesinDir(String path);
	
	/**
	 * Find all file names in directory
	 * 
	 * @param path - path to directory where to look
	 * @param name - file name to look for
	 */
	public void lookupAllFilesInWholeDir(String path, String name);
	
	/**
	 * Find all file names in directory with specific extension
	 * 
	 * @param path - path to directory where to look
	 * @param ext - extension to look for
	 */
	public void lookupAllFilesWithExtension(String path, String ext);
	
	/**
	 * Return all file names in directory sorted a-z
	 * 
	 * @param path - path to directory where to look
	 */
	public void lookupAllFilesSortedName(String path);
	
	/**
	 * Return all file names in directory sorted by date
	 * 
	 * @param path - path to directory where to look
	 */
	public void lookupAllFilesSortedDate(String path);
	
	/**
	 * Return all file names in directory sorted by modification date
	 * 
	 * @param path - path to directory where to look
	 */
	public void lookupAllFilesSortedEdit(String path);
	
	/**
	 * Return all file names in directory which were created or modified in specified date
	 * 
	 * @param path - path to directory where to look
	 * @param date - date on which files were modified/created
	 */
	public void lookupAllFilesInDate(String path, Date date);
	
	/**
	 * Check privilage
	 * 
	 * @param user - check user privilage for file
	 */
	public void checkPrivilegeFile(User user);
}
