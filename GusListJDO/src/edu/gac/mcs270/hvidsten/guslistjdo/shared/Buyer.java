package edu.gac.mcs270.hvidsten.guslistjdo.shared;

import java.io.Serializable;


public class Buyer  implements Serializable{
	private static final long serialVersionUID = 1L;
	private String name="";
	
	public Buyer() {}
	
	public Buyer(String string) {
		name = string;
	}

}
