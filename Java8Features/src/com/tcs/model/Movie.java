package com.tcs.model;

public class Movie {

	private String movieName;
	private String movieHero;
	private String movieHeroinName;
	
	public Movie(String movieName, String movieHero, String movieHeroinName) {
		super();
		this.movieName = movieName;
		this.movieHero = movieHero;
		this.movieHeroinName = movieHeroinName;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getMovieHero() {
		return movieHero;
	}
	public void setMovieHero(String movieHero) {
		this.movieHero = movieHero;
	}
	public String getMovieHeroinName() {
		return movieHeroinName;
	}
	public void setMovieHeroinName(String movieHeroinName) {
		this.movieHeroinName = movieHeroinName;
	}
	@Override
	public String toString() {
		return "Movie [movieName=" + movieName + ", movieHero=" + movieHero + ", movieHeroinName=" + movieHeroinName
				+ "]";
	}
	
}
