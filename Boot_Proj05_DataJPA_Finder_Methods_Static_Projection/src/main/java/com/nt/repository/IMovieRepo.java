package com.nt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.models.Movie;
import com.nt.view.ResultView;

public interface IMovieRepo extends JpaRepository<Movie, Integer> {
	
	public List<ResultView> findByMidGreaterThanEqualAndMidLessThanEqual(int start , int end) ;
	
}
