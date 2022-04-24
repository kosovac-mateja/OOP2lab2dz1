package banditi;

public class Bandit {

	public enum Tim {
		A, B;
	}
	
	private Tim tim;
	
	private int zlatnici;
	
	public Bandit(Tim tim) {
		this.tim = tim;
		this.zlatnici = 50;
	}
	
	public Tim dohvatiTim() {
		return tim;
	}

	public int dohvatiBrojZlatnika() {
		return zlatnici;
	}
	
	public void promeniBrojZlatnika(int x) {
		this.zlatnici += x;
	}

	@Override
	public String toString() {
		return tim.toString()+zlatnici;
	}

	public static void main(String[] args) {

	}

}
