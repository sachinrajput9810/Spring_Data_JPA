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
public class NativeSQL_Runner_Test implements CommandLineRunner {

	@Autowired
	private IMovieRepo movieRepo ;
	
	@Override
	public void run(String... args) throws Exception {
		
		int result = movieRepo.registerMovie("Raja", 5.3f, "2012") ;
		System.out.println(result == 0 ? "Movie not registered" : "Movie Registered");
	}


}



