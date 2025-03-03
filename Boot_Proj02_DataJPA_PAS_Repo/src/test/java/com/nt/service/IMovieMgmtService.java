package com.nt.service;

import org.springframework.data.domain.Page;

import com.nt.model.Movie;

public interface IMovieMgmtService  {
	
	public Iterable<Movie> displayMoviesByOrder(boolean asc , String... prop) ;
	
	public Page<Movie> generatePage(int pageNo , int pageSize , boolean asc , String... prop ) ;
	
	public void generateMoviesReport(int pageSize , boolean dir) ;
}
