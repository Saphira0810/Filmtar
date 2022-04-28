package Filmtar.Filmtar;

import java.util.Comparator;

public class YearComparator implements Comparator<Videoanyag>{
	public int compare(Videoanyag v1, Videoanyag v2) {
		return v1.getEv()-(v2.getEv());
	}

}
