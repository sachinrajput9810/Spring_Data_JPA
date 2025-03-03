package com.nt.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.nt.models.Movie;

@Transactional
public interface IMovieRepo extends JpaRepository<Movie, Integer> {
	
	@Modifying
	@Query(value =  "INSERT INTO SPRING_JPA_MOVIE VALUES (MOVIE_SEQ.NEXTVAL, ? ,? ,?)" , nativeQuery = true) 
	public int registerMovie(String name , float rating , String year) ;
	
	
}




