package com.nt.service;

import java.util.List;

import com.nt.model.Movie;

public interface IMovieMgmtService {
	public String registerMovie(Movie movie) ;
	public long moviesCount() ;
	public boolean checkMovieById(Integer id) ;
	public Movie findMovieById(Integer id) ;
	public Iterable<Movie> fetchAllMovie() ;
	public Iterable<Movie> fetchAllMoviesById(List<Integer> mIds) ;
}
