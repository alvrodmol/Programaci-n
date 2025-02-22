package model;

import java.util.Comparator;

public class OrdenAutor implements Comparator<Agrupacion> {

	@Override
	public int compare(Agrupacion o1, Agrupacion o2) {
		int r = 0;
		if (o1 != null && o2 != null && o1.getAutor() != null && o2.getAutor() != null)
			r = o1.getAutor().compareTo(o2.getAutor());
		return r;
	}

}
