package com.nt.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.model.Movie;
import com.nt.repository.IMovieRepo;

@Service("movieService")
public class MovieMgmtServiceImpl implements IMovieMgmtService {

	@Autowired
	private IMovieRepo movieRepo ;
	
	
	
	@Override
	public String registerMovie(Movie movie) {
		// TODO Auto-generated method stub
		System.out.println("Proxy Implemented class:: " +  movieRepo.getClass() + " and Implemented Interfaces :: " + Arrays.toString(movieRepo.getClass().getInterfaces()));
		System.out.println("Movie before save :: " + movie);
		Movie movie1 = movieRepo.save(movie) ;
		System.out.println("Movie after save :: " + movie1 + " with id :: " + movie1.getMid());
		return "Registered movie" ;
	}
	



	@Override
	public long moviesCount() {
		// TODO Auto-generated method stub
		long movieCnt = movieRepo.count() ;
		return movieCnt ;
	}




	@Override
	public boolean checkMovieById(Integer id) {
		boolean checkMovie = movieRepo.existsById(id) ;
		return checkMovie;
	}




//	@Override
//	public Movie findMovieById(Integer id) {
//		Optional<Movie> opt = movieRepo.findById(id) ;
//		if(opt.isPresent()) {
//			return opt.get() ;
//		}
//		else throw new IllegalArgumentException("Record not found") ;
//	}

//	@Override
//	public Movie findMovieById(Integer id) {
//		return movieRepo.findById(id).orElseThrow( () -> new IllegalArgumentException("Record not found")  ) ;
//	}

	
	@Override
	public Movie findMovieById(Integer id) {
		return movieRepo.findById(id).orElse(new Movie()) ;
	}



	@Override
	public Iterable<Movie> fetchAllMovie() {
		// TODO Auto-generated method stub
		return null;
	}




	@Override
	public Iterable<Movie> fetchAllMoviesById(List<Integer> mIds) {
		Iterable<Movie> list = movieRepo.findAllById(mIds) ;
		return list;
	}




	

}
