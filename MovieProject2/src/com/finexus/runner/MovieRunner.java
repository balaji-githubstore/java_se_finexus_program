package com.finexus.runner;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

import com.finexus.movie.Movie;

public class MovieRunner {
	
	
	public static void moviePredicate(List<Movie> ls,Predicate<Movie> moviePredicate)
	{
		for(Movie m:ls)
		{
			if(moviePredicate.test(m))
			{
				System.out.println(m.getMovieName());
			}
		}
	}
	
	public static void main(String[] args) {
		

		Movie m1=new Movie();
		m1.setMovieName("The Master");
		m1.setActorName("VJ");
		m1.setYear(2000);
		
		Movie m2=new Movie();
		m2.setMovieName("The Blind");
		m2.setActorName("MJ");
		m2.setYear(2000);
		
		Movie m3=new Movie();
		m3.setMovieName("The Tree");
		m3.setActorName("TJ");
		m3.setYear(2022);
		
		
		List<Movie> ls=new ArrayList<Movie>();
		ls.add(m1);
		ls.add(m2);
		ls.add(m3);
		
//		for(Movie m : ls) {
//			System.out.println(m.getMovieName());
//		}
		
		ls.forEach(m->System.out.println(m.getMovieName()));
		
		MovieRunner.moviePredicate(ls, m->m.getYear()==2000);
		
		
		MovieRunner.moviePredicate(ls, m->m.getActorName()=="VJ");
	}

}
