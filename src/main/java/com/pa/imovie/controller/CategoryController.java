package com.pa.imovie.controller;

import com.pa.imovie.dto.CategoryMovieInfo;
import com.pa.imovie.entity.Category;
import com.pa.imovie.service.CategoryService;
import com.pa.imovie.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    CategoryService categoryService;

    @Autowired
    MovieService movieService;

    @GetMapping("")
    public List<Category> getAllCategory() {
        return categoryService.getAllCategory();
    }

    @GetMapping(path = "/{category_id}", params = {"page", "pageSize"})
    public List<CategoryMovieInfo> getAllMovieByCategory(@PathVariable Integer category_id, @RequestParam Integer page, @RequestParam Integer pageSize) {
        return categoryService.getAllMovieByCategory(category_id, page, pageSize);
    }

    @GetMapping(params = {"page", "pageSize"})
    public List<CategoryMovieInfo> getAllMovieLimited(@RequestParam Integer page, @RequestParam Integer pageSize){
        return movieService.getAllMovieLimited(page, pageSize);
    }

    @GetMapping("/search")
    public List<CategoryMovieInfo> findByNameLike(@RequestParam String name, @RequestParam Integer page, @RequestParam Integer pageSize) {
        return movieService.findByNameLike("%"+name+"%", page, pageSize);
    }

}
