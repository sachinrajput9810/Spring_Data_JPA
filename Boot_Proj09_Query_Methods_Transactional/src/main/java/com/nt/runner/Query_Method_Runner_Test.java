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
		
//		System.out.println(movieRepo.updateRatingByMovieName(8.11f, "Dilwale"));
		
		System.out.println(movieRepo.deleteMovieByYearRange("2001", "2008"));
	}

}



