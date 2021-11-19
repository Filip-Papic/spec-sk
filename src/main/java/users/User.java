package users;

import java.util.ArrayList;
import java.util.List;

public class User {
	
	private boolean isRootUser;
	private String ime;
	private String lozinka;
	//private List<PrivilegijeTip> privilegije = new ArrayList<>();
	private List<Privilegije> privilegije = new ArrayList<>();
	
	/**
     * Creates a new user 
     * @param ime - name of the user
     * @param lozinka - password of the user
     */
	public User(String ime, String lozinka) {
		this.ime = ime;
		this.lozinka = lozinka;	
		isRootUser = false;
	}

	/**
     * Creates a new user with privilages
     * @param isRootUser - check if the user is a root user
     * @param ime - name of the user
     * @param lozinka - password of the user
     * @param privilegije - list of privilages that this user has
     */
	public User(boolean isRootUser, String ime, String lozinka, List<Privilegije> privilegije) {
		super();
		this.isRootUser = isRootUser;
		this.ime = ime;
		this.lozinka = lozinka;
		this.privilegije = privilegije;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getLozinka() {
		return lozinka;
	}

	public void setLozinka(String lozinka) {
		this.lozinka = lozinka;
	}

	public ArrayList<Privilegije> getPrivilegije() {
		return (ArrayList<Privilegije>) privilegije;
	}

	public void setPrivilegije(ArrayList<Privilegije> privilegije) {
		this.privilegije = privilegije;
	}

	public boolean isRootUser() {
		return isRootUser;
	}

	public void setRootUser(boolean isRootUser) {
		this.isRootUser = isRootUser;
	}

	@Override
	public String toString() {
		return "User [isRootUser=" + isRootUser + ", ime=" + ime + ", lozinka=" + lozinka
				+ ", privilegije=" + privilegije + "]";
	}
	
	
}
