//program to display that are given by list
package com.tcs.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import com.tcs.model.Movie;

public class ConsumerProgram2 {
	public static void main(String[] args) {
List<Movie> list=new ArrayList<Movie>();
populate(list);
Consumer<Movie> movieDetails=movie->{
	System.out.println("movie name::"+movie.getMovieName());
	System.out.println("movie hero name::"+movie.getMovieHero());
	System.out.println("movie heroin name::"+movie.getMovieHeroinName());
	System.out.println();
};
list.forEach(movie->{
	movieDetails.accept(movie);
});
}

	private static void populate(List<Movie> list) {

		list.add(new Movie("ChandraMukhi", "Rajni Kanth", "Soundarya"));
		list.add(new Movie("Tagore", "chiranjeevi", "Shreya"));
		list.add(new Movie("vikramarkudu", "Ravi Teja", "Anushka Shetty"));
	}
}
