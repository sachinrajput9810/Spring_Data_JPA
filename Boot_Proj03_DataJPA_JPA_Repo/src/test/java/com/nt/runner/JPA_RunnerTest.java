package com.nt.runner;


import java.util.ArrayList;
import java.util.List;

import org.assertj.core.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.model.Movie;
import com.nt.service.IMovieMgmtService;

@Component
public class JPA_RunnerTest implements CommandLineRunner {

	@Autowired
	private IMovieMgmtService service ; 

	@Override
	public void run(String... args) throws Exception {
		
//		System.out.println("----------removeMoviesById()---------");
//		try {
//			String message = service.removeMoviesById(List.of(132,16)) ;
//			System.out.println(message);
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
		
//		System.out.println("-----------getMoviesById()----------");
//		try {
//			List<Integer> ids = new ArrayList<Integer>() ;
//			ids.add(13) ;
//			ids.add(null) ;
//			List<Movie> list = service.getMoviesById(ids) ;
//			list.forEach(System.out::println);
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
		
//		System.out.println("-----------findAll()----------");
//		try {
//			Movie movie = new Movie() ;
////			movie.setMname("baby");
//			movie.setRating(8.3f);
//			List<Movie> list = service.displayMoviesByMovie(movie, true, "year") ;
//			System.out.println(list.size() + " records");
//			list.forEach(System.out::println);
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
	
		System.out.println("-----------getReferenceById()----------");
		try {
			Movie movie = service.searchMovieById(1) ;
			System.out.println(movie.toString());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	
	
}
