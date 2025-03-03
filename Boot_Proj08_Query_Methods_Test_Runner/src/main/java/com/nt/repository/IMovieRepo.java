package com.nt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.nt.models.Movie;

public interface IMovieRepo extends JpaRepository<Movie, Integer> {
	
//	@Query(" from Movie where mid>=?1 and mid<=?2")
	
//	@Query("from Movie where mid>=:min and mid<=:max")
//	public List<Movie> searchMoviesInIDRange(@Param("min") int start ,@Param("max") int end) ;
	
	@Query("from Movie where mid>=?1 and mid<=?2")
	public List<Movie> searchMoviesInIDRange(int min  , int max) ;
	
	@Query("from Movie where mname In(:name1 , :name2 , :name3) order By mname asc")
	public List<Movie> searchMoviesByMnames(String name1 , String name2 , String name3) ;
	
	@Query("from Movie where mname In(?1 , ?2 , ?3) order By mname asc")
	public List<Movie> searchMoviesByMnames1(String name1 , String name2 , String name3) ;
	
	@Query("select mid , mname , year from Movie where rating >= :rat and year = :yr  ")
	public List<Object[]> searchMoviesByRatingAndYear(float rat , String yr)  ;
	
	@Query("select mname from Movie where year > :yr1 and year <= :yr2 order by mname desc" )
	public List<Object> selectMoviesByYearRange(String yr1 , String yr2) ;
	
	

}




