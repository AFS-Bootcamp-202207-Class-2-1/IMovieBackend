package com.pa.imovie.service;

import com.pa.imovie.dto.CommentInfo;
import com.pa.imovie.entity.Comment;
import com.pa.imovie.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class CommentService {

    @Autowired
    CommentRepository commentRepository;

    static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");

    public String addComment(CommentInfo commentInfo) {
        commentRepository.save(new Comment(0,sdf.format(new Date()),commentInfo.getCommentContent(),commentInfo.getUsersId(),commentInfo.getMovieId()));
        return "add comment successfully";

    }
}
