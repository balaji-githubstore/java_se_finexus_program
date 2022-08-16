/* Copyright © 2016 Oracle and/or its affiliates. All rights reserved. */

package exercise_13_2;

import java.util.ArrayList;
import java.util.Arrays;

public class TestClass {
    public static void main(String[] args) {
        String[] days = {"monday","saturday","tuesday","sunday","friday"};

        // Convert the days array into an ArrayList
        var daysList=new ArrayList<String>(Arrays.asList(days));
        
        // Loop through the ArrayList, printing out "sunday" elements in 
        //   upper case (use toUpperCase() method of String class) 
        // Print all other days in lower case 
        // Print out the ArrayList  

        System.out.println(daysList);

        for(var day : daysList)
        {
        	if(day.equals("sunday"))
        	{
        		System.out.println(day.toUpperCase());
        	}
        	else
        	{
        		System.out.println(day.toLowerCase());
        	}
        }
//        var daysList1=Arrays.asList(days);
//        System.out.println(daysList);
    }    
}
