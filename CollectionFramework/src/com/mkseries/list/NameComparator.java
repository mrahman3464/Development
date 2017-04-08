package com.mkseries.list;

import java.util.Comparator;

public class NameComparator implements Comparator<Country>{

	@Override
	public int compare(Country cn1, Country cn2) {
		
		
		return cn1.name.compareTo(cn2.name);
	}

}
