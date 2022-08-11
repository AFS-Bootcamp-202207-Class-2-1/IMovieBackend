package com.pa.imovie.repository;

import com.pa.imovie.dto.CommentInfo;
import com.pa.imovie.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<Comment,Integer> {


}
