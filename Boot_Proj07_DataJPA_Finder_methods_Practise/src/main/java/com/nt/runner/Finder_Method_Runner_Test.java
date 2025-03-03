package com.nt.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.models.Movie;
import com.nt.repository.IMovieRepo;
import com.nt.view.ResultView1;
import com.nt.view.ResultView2;
import com.nt.view.View;

@Component
public class Finder_Method_Runner_Test implements CommandLineRunner {

	@Autowired
	private IMovieRepo movieRepo ;
	
	@Override
	public void run(String... args) throws Exception {
//		System.out.println("-------------ResultView1");
//		movieRepo.findByMnameIn(List.of("Goa" , "baby"), ResultView1.class).forEach( v -> {
//			System.out.println("Mname :: " + v.getMname() + "  Rating :: " + v.getRating() );
//		});
//		
//		System.out.println("-------------ResultView2");
//		movieRepo.findByMnameIn(List.of("baby",  "Goa"), ResultView2.class).forEach(v -> {
//			System.out.println("Mname :: " + v.getMname() + " Year :: " + v.getYear() + "  Rating :: " + v.getRating());
//		});
		
		Movie movie = new Movie() ;
		movie.setMname("Raja Hindustani");
		movie.setYear("2007") ;
		movie.setRating(8.5f);
		System.out.println(movieRepo.save(movie).getMid());

		
		
	}
}
