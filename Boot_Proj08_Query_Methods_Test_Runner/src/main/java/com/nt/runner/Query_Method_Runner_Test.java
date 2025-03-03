package com.nt.runner;


import java.sql.RowId;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.models.Movie;
import com.nt.repository.IMovieRepo;
import com.nt.view.ResultView;

@Component
public class Query_Method_Runner_Test implements CommandLineRunner {

	@Autowired
	private IMovieRepo movieRepo ;
	
	@Override
	public void run(String... args) throws Exception {
//		List<Movie> list = movieRepo.searchMoviesInIDRange(1, 3) ;
//		list.forEach(System.out::println);
		
//		movieRepo.searchMoviesByMnames1("Goa", "baby", "Dilwale").forEach(System.out::println);
		
//		movieRepo.searchMoviesByRatingAndYear(8.3f, "2017").forEach( row -> {
//			for(Object obj : row) {
//				System.out.print(obj + " ") ;
//			}
//			System.out.println();
//		});
		
		movieRepo.selectMoviesByYearRange("2015", "2020").forEach(System.out::println);
		
		
	}

}



