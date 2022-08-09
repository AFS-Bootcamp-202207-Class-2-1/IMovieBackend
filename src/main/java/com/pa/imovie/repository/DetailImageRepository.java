package com.pa.imovie.repository;

import com.pa.imovie.entity.DetailImage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetailImageRepository extends JpaRepository<DetailImage, Integer> {
}
