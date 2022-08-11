package com.pa.imovie.controller;


import com.pa.imovie.dto.CommentInfo;
import com.pa.imovie.entity.Comment;
import com.pa.imovie.entity.Users;
import com.pa.imovie.service.CommentService;
import com.pa.imovie.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/comment")
//@CrossOrigin(origins = "*")
public class CommentController {

    @Autowired
    CommentService commentService;


    @PostMapping("addComment")
    public Comment addComment (@RequestBody CommentInfo commentInfo){
        return commentService.addComment(commentInfo);
    }





}
