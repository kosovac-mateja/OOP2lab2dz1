package banditi;

public class Pomeranje extends Akcija {
	
	private Smer s;
	
	public Pomeranje(Kompozicija kompozicija, Smer s) {
		super(kompozicija);
		this.s = s;
	}

	@Override
	public void izvrsi(Bandit b){
		Vagon vStari;
		try {
			vStari = kompozicija.dohvatiVagon(b);
			Vagon vNovi = kompozicija.dohvatiSusedniVagon(vStari, s);
			vStari.ukloniBandita(b);
			vNovi.dodajBandita(b);
		} catch (GNepostojeciVagon e) {
			
		}
		
	}
	
	@Override
	public String toString() {
		return "Pomeranje: "+s;
	}

	public static void main(String[] args) {

	}

}
