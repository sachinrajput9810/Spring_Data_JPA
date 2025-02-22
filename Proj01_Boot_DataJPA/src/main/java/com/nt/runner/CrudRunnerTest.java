package com.nt.runner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.model.Movie;
import com.nt.service.IMovieMgmtService;

@Component
public class CrudRunnerTest implements CommandLineRunner {

	@Autowired
	private IMovieMgmtService service ;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		Movie movie = new Movie() ;
//		movie.setMname("Raid ");
//		movie.setRating(9.2f);
//		movie.setYear("2020");
//		try {
//			System.out.println(service.registerMovie(movie));
//			System.out.println("Movie records in DB " + service.moviesCount());
//			Optional<Movie> movie = service.findMovieById(2) ;
//			boolean movieAvilable = service.checkMovieById(2) ;
//			System.out.println("Movie avilability is " + movieAvilable + " and the movie is " + movie);
//		} catch (Exception e) {
//			e.printStackTrace();  
//		}
		
//		try {
//			System.out.println("All movies record ");
//			Iterable<Movie> list = service.fetchAllMovie() ;
// 			for(Movie movie : list) {
// 				System.out.println(movie);
// 			}
// 			System.out.println("----------------");
// 			list.forEach(movie -> System.out.println(movie) );
// 			System.out.println("----------------");
// 			list.forEach(System.out::println);
// 			System.out.println("------------------");
// 			Arrays.asList(list).stream().forEach(System.out::println);
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
		
		
		System.out.println("------------findAllById() -------");
		try {
//			List<Integer> list = new ArrayList<>() ;
//			list.add(1) ; 
//			list.add(2) ;
//			System.out.println("Movies list by id " + service.fetchAllMoviesById(list));
//			System.out.println("---------------");
//			System.out.println("Movie list by id " + service.fetchAllMoviesById(List.of(2)));
//			System.out.println("---------------");
//			System.out.println("Movie list by all ids " + service.fetchAllMoviesById(Arrays.asList(1,2,3)) );
			
			Movie movieById =  service.findMovieById(2) ;
			System.out.println("Fetching movie based on the id :: " + movieById);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		
		
		
		
		
		
		
	}

}
