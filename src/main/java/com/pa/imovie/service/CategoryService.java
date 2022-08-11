package com.pa.imovie.service;

import com.pa.imovie.dto.CategoryMoviePageInfo;
import com.pa.imovie.dto.CategoryMovieInfo;
import com.pa.imovie.entity.Category;
import com.pa.imovie.entity.Movie;
import com.pa.imovie.entity.MovieCategory;
import com.pa.imovie.repository.CategoryRepository;
import com.pa.imovie.repository.MovieCategoryRepository;
import com.pa.imovie.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    @Autowired
    MovieCategoryRepository movieCategoryRepository;

    @Autowired
    MovieRepository movieRepository;

    public List<Category> getAllCategory() {
        return categoryRepository.findAll();
    }

    public CategoryMoviePageInfo getAllMovieByCategory(Integer category_id, Integer page, Integer pageSize) {
        List<MovieCategory> allMovieCategoryList = movieCategoryRepository.findByCategoryId(category_id);
        PageRequest pageRequest = PageRequest.of(page - 1, pageSize);
        List<MovieCategory> movieCategoryList = movieCategoryRepository.findByCategoryId(category_id, pageRequest);
        List<CategoryMovieInfo> movieList = new ArrayList<>();
        for (MovieCategory movieCategory : movieCategoryList) {
            Movie movie = movieRepository.findById(movieCategory.getMovieId()).get();
            movieList.add(new CategoryMovieInfo(movie.getMovieId(), movie.getMovieName(), movie.getMovieImage(), movie.getMovieScore()));
        }
        return new CategoryMoviePageInfo(allMovieCategoryList.size(), movieList);
    }


}
