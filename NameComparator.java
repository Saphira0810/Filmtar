package Filmtar.Filmtar;

import java.util.Comparator;

public class NameComparator implements Comparator<Videoanyag>{
	public int compare(Videoanyag v1,Videoanyag v2) {
		return v1.getCim().compareTo(v2.getCim());
	}
}

