package com.nt.runner;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.repository.IMovieRepo;
import com.nt.view.ResultView;

@Component
public class Finder_Method_Runner_Test implements CommandLineRunner {

	@Autowired
	private IMovieRepo movieRepo ;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Repo Inmemory proxy class" + movieRepo.getClass());
		List<ResultView> list = movieRepo.findByMidGreaterThanEqualAndMidLessThanEqual(4, 7) ;
		list.forEach(View -> {
			System.out.println("static projection Inmemory proxy class " +  View.getClass());
			System.out.println(View.getMid() + "----" + View.getMname());
		});
	}

}
