package banditi;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Vagon {

	private List<Bandit> banditi = new LinkedList<>(); 
	
	public Vagon dodajBandita(Bandit b) {
		banditi.add(b);
		return this;
	}
	
	public boolean sadrziBandita(Bandit b) {
		for(Bandit bb : banditi) {
			if(b.equals(bb))
				return true;
		}
		return false;
	}
	
	public Vagon ukloniBandita(Bandit b) {
		int i = 0;
		for(Bandit bb : banditi) {
			if(b.equals(bb)) {
				banditi.remove(i);
				return this;
			}
			i++;
		}
		return this;
	}
	
	public int dohvatiBrojBandita() {
		return banditi.size();
	}
	
	public Bandit dohvatiBandita(int i){
		return banditi.get(i);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vagon other = (Vagon) obj;
		if (this.dohvatiBrojBandita() != other.dohvatiBrojBandita())
			return false;
		int i = 0;
		for(Bandit b : banditi) {
			if(!b.equals(other.dohvatiBandita(i)))
				return false;
			i++;
		}
		return true;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		int i = 0;
		for(Bandit b : banditi) {
			sb.append(b.toString());
			if(i != banditi.size()-1)
				sb.append(",");
			i++;
		}
		sb.append("]");
		
		return sb.toString();
	}

	public static void main(String[] args) {
		Vagon v = new Vagon();
		Bandit b = new Bandit(Bandit.Tim.B);
		v.dodajBandita(new Bandit(Bandit.Tim.B));
		v.dodajBandita(b);
		v.dodajBandita(new Bandit(Bandit.Tim.B));
		v.ukloniBandita(b);
		System.out.println(v);
		System.out.println(v.dohvatiBrojBandita());
	}

}
