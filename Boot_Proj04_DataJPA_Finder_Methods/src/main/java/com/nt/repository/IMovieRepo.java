package com.nt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.models.Movie;

public interface IMovieRepo extends JpaRepository<Movie, Integer> {
	
	public List<Movie> findByMname(String name);
	public List<Movie> findByMnameIs(String name) ;
	public List<Movie> findByMnameEquals(String name) ;
	
	public List<Movie> findByMnameStartingWith(String initChar) ;
	public Iterable<Movie> findByMnameStartsWith(String start) ;
	
	public List<Movie> findByYear(String year) ;
	
	public List<Movie> findByMnameEndingWith(String end);
	
	public List<Movie> findByMnameContaining(String str) ;
	
	public List<Movie> findByMnameContainingIgnoreCase(String str) ;
	
	public List<Movie> findByMnameLike(String str) ;
	
	public List<Movie> findByMidGreaterThanEqualAndRatingLessThanAndYearGreaterThan(int startId , float endRating , String year) ;
	
	public List<Movie> findByMnameStartsWithOrRatingLessThan(String start , float rating) ;
	
	public List<Movie> findByRatingBetween(float rating1 , float rating2) ;

	
}
