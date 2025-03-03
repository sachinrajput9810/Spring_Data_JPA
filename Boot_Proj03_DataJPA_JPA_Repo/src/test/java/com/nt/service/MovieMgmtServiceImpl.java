package com.nt.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.nt.model.Movie;
import com.nt.repository.IMovieRepo;


@Service("movieService")
public class MovieMgmtServiceImpl implements IMovieMgmtService {
	
	@Autowired
	private IMovieRepo movieRepo ;

	@Override
	public String removeMoviesById(List<Integer> ids) {
		// TODO Auto-generated method stub
		List<Movie> list = movieRepo.findAllById(ids) ;
		long count = list.size() ;
	    movieRepo.deleteAllByIdInBatch(ids);
	    return count + " records are deleted" ;
	}

	@Override
	public List<Movie> getMoviesById(Iterable<Integer> ids) {
		List<Movie> list = movieRepo.findAllById(ids) ;
		return list;
	}

	@Override
	public List<Movie> displayMoviesByMovie(Movie movie, boolean asc, String... props) {
		Example<Movie> example = Example.of(movie) ;
		Sort sort = Sort.by(asc?Direction.ASC:Direction.DESC , props) ;
		List<Movie> movieList = movieRepo.findAll(example, sort) ;
		return movieList;
	}
	
	
	@Override
	public Movie searchMovieById(Integer id) {
		Movie movie = movieRepo.getReferenceById(id)  ;
		System.out.println("classname " + movie.getClass());
		return movie ;
		
	}

	


}
