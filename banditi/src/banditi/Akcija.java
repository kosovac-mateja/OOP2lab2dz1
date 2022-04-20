package banditi;

public abstract class Akcija {
	
	protected Kompozicija kompozicija;
	
	public Akcija(Kompozicija kompozicija) {
		this.kompozicija = kompozicija;
	}
	
	public abstract void izvrsi(Bandit b) throws GNepostojeciVagon;
}
