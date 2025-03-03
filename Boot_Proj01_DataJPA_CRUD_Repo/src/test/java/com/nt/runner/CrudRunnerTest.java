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
			List<Integer> list = new ArrayList<>() ;
			list.add(13) ; 
			list.add(null) ;
			System.out.println("Movies list by id " + service.fetchAllMoviesById(list).toString());

//			Movie movieById =  service.findMovieById(2) ;
//			System.out.println("Fetching movie based on the id :: " + movieById);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		
		
//		System.out.println("---------gatherById()----------");
//		try {
//			Optional<Movie> opt = service.gatherMovieById(2) ;
//			if(!opt.isEmpty()) {
//				System.out.println("Movie withif 2 : " + opt.get());
//			}
//			else System.out.println("Record not found"); 
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
//		
		
//		System.out.println("------------groupMovieRegistration()----------");
//		try {
//			List<Movie> list = new ArrayList<Movie>() ;
//			list.add(new Movie("Golmaal" , "2018" , 8.3f)) ;
//			list.add(new Movie("Aparichit" , "2013" , 5.3f)) ;
//			list.add(new Movie("De dana dan" , "2014" , 6.3f)) ;
//			list.add(new Movie("Chor machaye shor" , "2015" , 7.2f)) ;
//			String message = service.groupMovieRegistration(list) ;
//			System.out.println(message);
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
		
//		System.out.println("------------updateMovie()-----------");
//		try {
//			String message = service.updateMovieById(1, "2020", 10f) ;
//			System.out.println(message);
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
//		
		
//		System.out.println("------------updateMovieCompletely()-----------");
//		try {
//			Movie movie = new Movie() ;
//			movie.setMname("Doremon");
//			movie.setRating(9f);
//			movie.setYear("2018");
//			movie.setMid(2);
//			String message = service.updateMovieCompletely(movie) ;
//			System.out.println(message);
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
	
//		System.out.println("------------deleteMovieById()-----------");
//		try {
//			Movie movie = new Movie() ;
//			movie.setMid(null);
//			String message = service.deleteMovie(movie) ;
//			System.out.println(message);
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
		
		
//		System.out.println("------------deleteAllMovies()-----------");
//		try {
//			String message = service.deleteAllMovies() ;
//			System.out.println(message);
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
		
//		System.out.println("------------deleteMoviesById()-----------");
//		try {
//			String message = service.deleteMoviesById(new ArrayList<>(Arrays.asList(12,14))) ;
//			System.out.println(message);
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
//		
//		System.out.println("------------deleteMoviesByEntityList()-----------");
//		try {
//			List<Movie> list = new ArrayList<Movie>() ;
//			Movie movie1 = new Movie("3 idiots" , "2016" , 9.4f) ;
//			movie1.setMid(1);
//			list.add(movie1) ;
//			Movie movie2 = new Movie("goa" , "2018" , 5f) ;
//			movie2.setMid(3);
//			list.add(movie2) ;
//			Movie movie3 = new Movie("gssoa" , "2028" , 5f) ;
//			movie3.setMid(3);
//			list.add(movie3) ;
//			String message = service.deleteMoviesByEntityList(list) ;			
//			System.out.println(message);
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
	}

}
