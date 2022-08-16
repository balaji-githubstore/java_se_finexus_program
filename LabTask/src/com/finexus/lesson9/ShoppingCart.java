/* Copyright © 2016 Oracle and/or its affiliates. All rights reserved. */

package com.finexus.lesson9;

public class ShoppingCart {
	
    public static void main(String[] args) 
    {
        // Declare, instantiate, and initialize a Customer object.
    	Customer customer=new Customer("Kem", "SSN0233");
    	//customer.setName("Ken");
    	
        
        // Print the customer object name.
    	String name=customer.getName();
    	System.out.println(name);
        
    }    
}
