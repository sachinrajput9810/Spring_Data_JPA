package com.nt.service;






import static org.mockito.ArgumentMatchers.intThat;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.nt.model.Movie;
import com.nt.repository.IMovieRepo;

@Service("movieService")
public class MovieMgmtServiceImpl implements IMovieMgmtService {

	@Autowired
	private IMovieRepo movieRepo ;

	@Override
	public Iterable<Movie> displayMoviesByOrder(boolean asc, String... prop) {
		Sort sort = Sort.by(asc?Direction.ASC:Direction.DESC , prop) ;
		return movieRepo.findAll(sort) ;
	}

	@Override
	public Page<Movie> generatePage(int pageNo, int pageSize, boolean asc, String... prop) {
		Pageable pageable = PageRequest.of(pageNo, pageSize, Sort.by(asc?Direction.ASC:Direction.DESC, prop)) ;
		Page<Movie> page = movieRepo.findAll(pageable) ;
		return page ;
	}
	
	@Override
	public void generateMoviesReport(int pageSize , boolean dir) {
		long recordcount = movieRepo.count() ;
		long pageCount = recordcount/pageSize ;
		if(recordcount%pageSize != 0) pageCount++ ;
		 
		for(int pageNo=0 ; pageNo<pageCount ; pageNo++) {
			Pageable pageable = PageRequest.of(pageNo, pageSize , Sort.by(dir?Direction.ASC:Direction.DESC, "year")) ;
			Page<Movie> page = movieRepo.findAll(pageable) ;
			System.out.println("Page no " + pageNo + ":::  page size " + pageSize + "::: No of elements " + page.getNumberOfElements()) ;
			List<Movie> list = page.getContent() ;
			list.forEach(movie -> {
				System.out.println(movie.toString());
			});
		}
	}
	
	



}
