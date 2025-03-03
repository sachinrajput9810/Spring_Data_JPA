package com.nt.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.models.Movie;
import com.nt.repository.IMovieRepo;

@Component
public class Finder_Method_Runner_Test implements CommandLineRunner {

	@Autowired
	private IMovieRepo movieRepo ;
	
	@Override
	public void run(String... args) throws Exception {
//		List<Movie> list = movieRepo.findByMname("baby") ;
//		list.forEach(System.out::println);
		
//		System.out.println(movieRepo.findByMnameEquals("Dilwale"));
//		System.out.println(movieRepo.findByMnameIs("Golmaal"));
		
//		movieRepo.findByMnameStartingWith("b").forEach(System.out::println); 
//		movieRepo.findByMnameStartsWith("b").forEach(System.out::println);
		
//		movieRepo.findByYear("2014").forEach(System.out::println);
//		movieRepo.findByMnameEndingWith("a").forEach(System.out::println);
		
//		movieRepo.findByMnameContainingIgnoreCase("a ").forEach(System.out::println); 
		
//		movieRepo.findByMnameLike("___").forEach(System.out::println);
		
//		movieRepo.findByMidGreaterThanEqualAndRatingLessThanAndYearGreaterThan(7, 8.5f , "2018").forEach(System.out::println); 
		
//		movieRepo.findByMnameStartsWithOrRatingLessThan("b", 6.4f).forEach(System.out::println);
		
		movieRepo.findByRatingBetween(8.5f, 9f).forEach(System.out::println);
		
	}

}
