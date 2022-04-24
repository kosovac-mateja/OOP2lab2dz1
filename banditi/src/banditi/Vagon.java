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
			if(b == bb)
				return true;
		}
		return false;
	}
	
	public Vagon ukloniBandita(Bandit b) {
		if(sadrziBandita(b))
			banditi.remove(b);
		return this;
	}
	
	public int dohvatiBrojBandita() {
		return banditi.size();
	}
	
	public Bandit dohvatiBandita(int i){
		return banditi.get(i);
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
		
	}

}
