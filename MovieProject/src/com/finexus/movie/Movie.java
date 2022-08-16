package com.finexus.movie;

public class Movie {

	private String movieName;
	private String actorName;
	private int year;

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getActorName() {
		return actorName;
	}

	public void setActorName(String actorName) {
		this.actorName = actorName;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		if(String.valueOf(year).length()==4)
			this.year = year;
	}

}
