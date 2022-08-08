package com.pa.imovie.repository;

import com.pa.imovie.dto.HomeMovieInfo;
import com.pa.imovie.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface HomePageRepository extends JpaRepository<Movie, Integer> {

}
