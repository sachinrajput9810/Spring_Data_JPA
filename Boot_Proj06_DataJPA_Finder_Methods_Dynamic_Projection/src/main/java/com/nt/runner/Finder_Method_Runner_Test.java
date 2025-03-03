package com.nt.runner;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.repository.IMovieRepo;
import com.nt.view.ResultView;
import com.nt.view.ResultView1;
import com.nt.view.ResultView2;
import com.nt.view.ResultView3;

@Component
public class Finder_Method_Runner_Test implements CommandLineRunner {

	@Autowired
	private IMovieRepo movieRepo ;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Repo Inmemory proxy class" + movieRepo.getClass());
		
		System.out.println("----------ResultView1-------------");

		List<ResultView1> list = movieRepo.findByMnameIn(List.of("Dilwale" , "baby") , ResultView1.class) ;
		list.forEach( resultView1 -> {
			System.out.println("Mid :: " + resultView1.getMid() +"-----  Mname :: " + resultView1.getMname());
		});
		
		System.out.println("----------ResultView2-------------");
		
		List<ResultView2> list2 = movieRepo.findByMnameIn(List.of("Dilwale" , "baby"), ResultView2.class) ;
		list2.forEach(resultView2 -> {
			System.out.println("Mid :: " + resultView2.getMid() +"-----  Mname :: " + resultView2.getMname() + "---- Ratings :: " + resultView2.getRating());
		});
		
		System.out.println("------------ResultView3-------------");
		
		List<ResultView3> list3 = movieRepo.findByMnameIn(List.of("Dilwale" , "baby"), ResultView3.class) ;
		list3.forEach(resultView3 -> {
			System.out.println("Mid :: " + resultView3.getMid() +"-----  Mname :: " + resultView3.getMname() + "   ----- year :: " + resultView3.getYear() ) ;
		});
		
		
		
		
	}

}
