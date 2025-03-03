package com.nt.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.nt.model.Movie;

public interface IMovieMgmtService  {
	
	public String removeMoviesById(List<Integer> list) ; 
	
	public List<Movie> getMoviesById(Iterable<Integer> ids) ;
	
	public List<Movie> displayMoviesByMovie(Movie movie , boolean asc , String... props) ;
	
	public Movie searchMovieById(Integer id) ;
}
