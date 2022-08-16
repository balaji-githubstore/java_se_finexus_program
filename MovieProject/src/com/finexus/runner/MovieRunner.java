package com.finexus.runner;

import java.io.PrintStream;
import java.util.Scanner;

import com.finexus.movie.Movie;

public class MovieRunner {
	
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("Enter Movie Name: ");
		String movieName=scanner.nextLine();

		System.out.print("Enter Actor Name: ");
		String actorName=scanner.nextLine();
		
		System.out.print("Enter Released Year: ");
		int year=scanner.nextInt();

		Movie mov1=new Movie();
		mov1.setMovieName(movieName);
		mov1.setActorName(actorName);
		mov1.setYear(year);
		
		System.out.println("-------------------------Movie Detail---------------------------------");
		System.out.println("Movie Name: "+mov1.getMovieName());
		System.out.println("Actor Name: "+mov1.getActorName());
		System.out.println("Year: "+mov1.getYear());
		
		
	}

}
