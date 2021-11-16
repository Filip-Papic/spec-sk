package users;

public class Privilegije {

	private boolean snimanje, preuzimanje, brisanje, pregled;
	
	//mora hijerarhija 

	public Privilegije(boolean snimanje, boolean preuzimanje, boolean brisanje, boolean pregled) {
		this.snimanje = snimanje;
		this.preuzimanje = preuzimanje;
		this.brisanje = brisanje;
		this.pregled = pregled;
	}

	public boolean isSnimanje() {
		return snimanje;
	}

	public void setSnimanje(boolean snimanje) {
		this.snimanje = snimanje;
	}

	public boolean isPreuzimanje() {
		return preuzimanje;
	}

	public void setPreuzimanje(boolean preuzimanje) {
		this.preuzimanje = preuzimanje;
	}

	public boolean isBrisanje() {
		return brisanje;
	}

	public void setBrisanje(boolean brisanje) {
		this.brisanje = brisanje;
	}

	public boolean isPregled() {
		return pregled;
	}

	public void setPregled(boolean pregled) {
		this.pregled = pregled;
	}

	@Override
	public String toString() {
		return "Privilegije [snimanje=" + snimanje + ", preuzimanje=" + preuzimanje + ", brisanje=" + brisanje
				+ ", pregled=" + pregled + "]";
	}	
}
