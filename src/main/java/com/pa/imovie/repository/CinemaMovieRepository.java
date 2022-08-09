package com.pa.imovie.repository;

import com.pa.imovie.entity.CinemaMovie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CinemaMovieRepository extends JpaRepository<CinemaMovie, Integer> {

    List<CinemaMovie> findByMovieId(Integer cinemaMovie_id);

}
