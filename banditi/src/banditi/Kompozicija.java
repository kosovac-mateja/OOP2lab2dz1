package banditi;

import java.util.LinkedList;
import java.util.List;

import banditi.Bandit.Tim;

public class Kompozicija {
	
	private List<Vagon> vagoni = new LinkedList<>();
	
	public Kompozicija dodajVagon(Vagon v) {
		vagoni.add(v);
		return this;
	}
	
	public Vagon dohvatiVagon(Bandit b) throws GNepostojeciVagon {
		for(Vagon v : vagoni) {
			if(v.sadrziBandita(b))
				return v;
		}
		throw new GNepostojeciVagon();
	}
	
	public Vagon dohvatiSusedniVagon(Vagon v, Smer s) throws GNepostojeciVagon {
		int i = 0;
		for(Vagon vv : vagoni) {
			if(v == vv)
				break;
			i++;
		}
		
		if((i == vagoni.size()-1 && s == Smer.IZA)|| (i == 0 && s == Smer.ISPRED))
			throw new GNepostojeciVagon();
		
		if(s == Smer.ISPRED)
			return vagoni.get(i-1);
		else
			return vagoni.get(i+1);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		int i = 0;
		for(Vagon v : vagoni) {
			sb.append(v);
			if(i != vagoni.size()-1)
				sb.append('_');
			i++;
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		
	}

}
