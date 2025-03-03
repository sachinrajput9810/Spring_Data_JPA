package com.nt.service;

import java.util.List;
import java.util.Optional;

import com.nt.model.Movie;

public interface IMovieMgmtService {
	public String registerMovie(Movie movie) ;
	public long moviesCount() ;
	public boolean checkMovieById(Integer id) ;
	public Movie findMovieById(Integer id) ;
	public Iterable<Movie> fetchAllMovie() ;
	public Iterable<Movie> fetchAllMoviesById(List<Integer> mIds) ;
	public Optional<Movie> gatherMovieById(Integer id) ;
	public String groupMovieRegistration(List<Movie> list) ;
	public String updateMovieById(Integer id , String newYear , Float newRating) ;
	public String updateMovieCompletely(Movie movie) ;
	public String deleteMovieById(Integer id) ;
	public String deleteMovie(Movie movie) ;
	public String deleteAllMovies() ;
	public String deleteMoviesById(List<Integer> list) ;
	public String deleteMoviesByEntityList(List<Movie> list) ;
}
