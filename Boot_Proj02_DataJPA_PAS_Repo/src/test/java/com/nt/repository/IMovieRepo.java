package com.nt.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.nt.model.Movie;

public interface IMovieRepo extends PagingAndSortingRepository<Movie, Integer> , CrudRepository<Movie, Integer> {

}
