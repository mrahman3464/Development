package com.mkseries.list;

import java.util.Comparator;

public class PopulationComparator implements Comparator<Country> {

	@Override
	public int compare(Country cn1, Country cn2) {

    if(cn1.population==cn2.population){
    	return 0;
    }else if(cn1.population>cn2.population){
    	return 1;
    }else
		return -1;
	}

}
