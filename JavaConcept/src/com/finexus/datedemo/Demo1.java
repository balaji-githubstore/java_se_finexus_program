package com.finexus.datedemo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Demo1 {

	public static void main(String[] args) {

		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);
		
		System.out.println(LocalDateTime.now());
		
		System.out.println(LocalDateTime.now().toLocalDate());
		System.out.println(LocalDateTime.now().toLocalTime());
		
		System.out.println(LocalDateTime.now().getHour());
		
		System.out.println(LocalDateTime.now().getMinute());
		
		
		System.out.println(LocalDateTime.now().plusDays(10).toLocalDate());
		
		
		DateTimeFormatter format=DateTimeFormatter.ofPattern("dd-MM-YYYY HH:mm:ss");
		
		String d=LocalDateTime.now().format(format);
		System.out.println(d);
	}

}
