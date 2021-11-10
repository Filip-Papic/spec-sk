package users;

import java.util.ArrayList;

public class User {
	
	private boolean isRootUser;
	private String ime;
	private String lozinka;
  //private ArrayList<Privilegije> privilegije;
	private ArrayList<PrivilegijeTip> privilegije;
	
	public User(String ime, String lozinka) {
		this.ime = ime;
		this.lozinka = lozinka;	
		isRootUser = false;
	}

	public User(boolean isRootUser, String ime, String lozinka, ArrayList<PrivilegijeTip> privilegije) {
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

	public ArrayList<PrivilegijeTip> getPrivilegije() {
		return privilegije;
	}

	public void setPrivilegije(ArrayList<PrivilegijeTip> privilegije) {
		this.privilegije = privilegije;
	}

	public boolean isRootUser() {
		return isRootUser;
	}

	public void setRootUser(boolean isRootUser) {
		this.isRootUser = isRootUser;
	}
}
