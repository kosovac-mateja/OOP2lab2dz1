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
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bandit other = (Bandit) obj;
		return tim == other.tim && zlatnici == other.zlatnici;
	}

	@Override
	public String toString() {
		return tim.toString()+zlatnici;
	}

	public static void main(String[] args) {
		Bandit b = new Bandit(Bandit.Tim.B);
		System.out.println(b);

	}

}
