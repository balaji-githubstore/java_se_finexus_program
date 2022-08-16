/* Copyright © 2016 Oracle and/or its affiliates. All rights reserved. */

package com.finexus.lesson9;



public class Customer {
    private String name;
    private String ssn;
    
    //add custom constructor to intialize the fields/state/attributes
    public Customer(String name,String ssn)
    {
    	this.name=name;
    	this.ssn=ssn;
    }
    
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSsn() {
		return ssn;
	}
   
    

}
