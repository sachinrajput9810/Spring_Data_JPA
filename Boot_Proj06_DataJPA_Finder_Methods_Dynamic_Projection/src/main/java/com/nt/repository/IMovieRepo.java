package com.nt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.models.Movie;
import com.nt.view.ResultView;
import com.nt.view.ResultView1;
import com.nt.view.View;

public interface IMovieRepo extends JpaRepository<Movie, Integer> {
	
	public <T extends View> List<T> findByMnameIn(List<String> list , Class<T> clazz) ;
	
}
