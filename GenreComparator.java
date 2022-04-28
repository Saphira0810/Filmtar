package Filmtar.Filmtar;

import java.util.Comparator;

public class GenreComparator implements Comparator<Videoanyag> {
	public int compare(Videoanyag v1, Videoanyag v2) {
		return v1.getMufaj().compareTo(v2.getMufaj());
	}

}
