package com.mkseries.list;

public class Country implements Comparable<Country> {
     public int population;
     public String name;
     
    
     public Country(String nm){
    	 this.name=nm;
     }
     
     public Country(String nm, int p){
    	 this.name=nm;
    	 this.population=p;
     }

	@Override
	public int compareTo(Country cn) {
		if(this.population==cn.population){
	    	return 0;
	    }else if(this.population>cn.population){
	    	return 1;
	    }else
			return -1;
		}
	 
     
     
     
     
     
     public Country(int p, String n){
    	 this.population=p;
    	 this.name=n;
    	 }
	
    //*************************************************************************************************
     
     //For HashSet
     
     @Override
     public int hashCode(){
    	int a=2;
    	return 2;
     }
 
     @Override
	public boolean equals(Object o){
    	 boolean flag=false;
    	 Country cn=(Country)o;
    	 //compare both population and country name
    	 if(this.population==cn.population && this.name.equalsIgnoreCase(cn.name)){
    		 return true;
    	 }
    	 return flag;
    	 
    }
}
