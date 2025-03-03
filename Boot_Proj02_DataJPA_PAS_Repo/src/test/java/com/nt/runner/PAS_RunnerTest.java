package com.nt.runner;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import com.nt.model.Movie;
import com.nt.service.IMovieMgmtService;

@Component
public class PAS_RunnerTest implements CommandLineRunner {

	@Autowired
	private IMovieMgmtService service ;

	@Override
	public void run(String... args) throws Exception {
		
//		System.out.println("----------displayMoviesByOrder()---------------");
//		Iterable<Movie> it = service.displayMoviesByOrder(false , "mname") ;
//		it.forEach(System.out::println);
		
		System.out.println("--------generatePage()-----------");
		
		
//		try {
//			Page<Movie> page = service.generatePage(0, 3, true, "year") ;
//			System.out.println("Get no of elements in page " + page.getNumberOfElements()); // no of elements
//			System.out.println("Total elements in page "  + page.getTotalElements());
//			System.out.println("Page no " + page.getNumber());
//			System.out.println("Page count " + page.getTotalPages());	
//			System.out.println("Is first " + page.isFirst());
//			System.out.println("Is Last " + page.isLast() );
//			
//			if(!page.isEmpty()) {
//				List<Movie> list = page.getContent() ;
//				list.forEach(System.out::println);
//			}
//			else System.out.println("record not found");
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
		
		try {
			service.generateMoviesReport(3 , true);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
	}
	
	
}
