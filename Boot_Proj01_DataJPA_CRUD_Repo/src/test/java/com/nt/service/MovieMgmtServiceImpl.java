package com.nt.service;




import java.util.ArrayList;
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
		return movieRepo.findById(id).get() ;
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






	@Override 
	public Optional<Movie> gatherMovieById(Integer id) {
		Optional<Movie> opt = movieRepo.findById(id) ;
		if(opt.isEmpty()) return Optional.empty() ;
		return opt ;
	}


	

	@Override
	public String groupMovieRegistration(List<Movie> list) {
		Iterable<Movie> saveMovieList = movieRepo.saveAll(list) ;
 		List<Integer> idsList = new ArrayList<>() ;
 		if(saveMovieList != null && ((List<Movie>) saveMovieList).size() > 0) {
 			saveMovieList.forEach(movie -> idsList.add(movie.getMid()) ) ;
 		}
 		return idsList.toString() + " movies are saved" ;
	}




	@Override
	public String updateMovieById(Integer id, String newYear, Float newRating) {
		Optional<Movie> opt = movieRepo.findById(id) ;
		if(opt.isPresent()) {
			Movie movie = opt.get() ;
			movie.setYear(newYear);
			movie.setRating(newRating);
			movieRepo.save(movie) ;
			return "Movie with " + id +  " is updated" ;
		}
		else return "Movie not found with given id " ;
	}




	@Override
	public String updateMovieCompletely(Movie movie) {
		Optional<Movie> opt = movieRepo.findById(movie.getMid()) ;
		if(opt.isPresent()) {
			movieRepo.save(movie) ;
			return "Movie updated" ;
		}
		else return "Movie with given id not found" ;
	}




	@Override
	public String deleteMovieById(Integer id) {
		Movie movie = movieRepo.findById(id).orElseThrow( () -> new IllegalArgumentException("Movie not found")) ;
		movieRepo.delete(movie);
		return "Movied deleted with given id" + id ;
	}




	@Override
	public String deleteMovie(Movie movie) {
		movieRepo.delete(movie);
		return "Movied deleted with given id" ;
	}




	@Override
	public String deleteAllMovies() {
		long count = movieRepo.count() ;
		movieRepo.deleteAll();
		return "All movies deleted with toal count of" + count ;
	}



	@Override
	public String deleteMoviesById(List<Integer> ids) {
//		for(Integer id : ids) {
//			if(id == null) return "Null found " ;
// 		}
//		Iterable<Movie> movieList = movieRepo.findAllById(ids) ;
//		long count = ((List<Movie>) movieList).size() ;
//		if(count != 0 && count == ids.size()) {
			movieRepo.deleteAllById(ids);
			return   " records are deleted" ;
//		}
//		return "No ids are given to delete or either all or few records are not avilable to delete " ;
	}



	@Override
	public String deleteMoviesByEntityList(List<Movie> list) {
		for(Movie movie : list) {
			if(movie == null) return "Movie cant be null" ;
		}
		
		List<Integer> ids = new ArrayList<>() ;
		list.forEach(movie -> ids.add(movie.getMid()));
		
		Iterable<Movie> movieList = movieRepo.findAllById(ids) ;
		List<Movie> deleteList = new ArrayList<>() ;
		
		for(Movie dbMovie : movieList) {
			for(Movie inputMovie : list) {
				if(dbMovie.getMid().equals(inputMovie.getMid())) {
					if( dbMovie.getMname().equals(inputMovie.getMname()) && 
						dbMovie.getRating().equals(inputMovie.getRating()) &&
						dbMovie.getYear().equals(inputMovie.getYear())  ) 
					{
						deleteList.add(dbMovie) ;
					}
				}
			}
		}
		
		
		long count = deleteList.size() ;
		movieRepo.deleteAll(deleteList);
		return count + " movies are deleted" ;
	}  



}
