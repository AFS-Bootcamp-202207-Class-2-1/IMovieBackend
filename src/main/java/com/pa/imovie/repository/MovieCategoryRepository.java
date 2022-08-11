package com.pa.imovie.repository;

import com.pa.imovie.entity.MovieCategory;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MovieCategoryRepository extends JpaRepository<MovieCategory, Integer> {

    List<MovieCategory> findByCategoryId(Integer CategoryId, PageRequest pageRequest);

}
