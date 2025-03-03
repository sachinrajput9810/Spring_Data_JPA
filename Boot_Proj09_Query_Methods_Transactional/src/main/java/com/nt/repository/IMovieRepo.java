package com.nt.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.nt.models.Movie;

@Transactional
public interface IMovieRepo extends JpaRepository<Movie, Integer> {
	
	
	@Query("update Movie set rating = :rating where mname = :name")
	@Modifying
//	@Transactional
	public int updateRatingByMovieName(float rating , String name) ;
	
	@Modifying
//	@Transactional
	@Query("Delete from Movie where year >= :start and year <= :end ")
	public int deleteMovieByYearRange(String start , String end) ;

}




