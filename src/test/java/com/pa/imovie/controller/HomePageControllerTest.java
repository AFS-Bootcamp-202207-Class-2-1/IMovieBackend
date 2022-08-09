package com.pa.imovie.controller;

import com.pa.imovie.entity.DetailImage;
import com.pa.imovie.entity.Movie;
import com.pa.imovie.repository.DetailImageRepository;
import com.pa.imovie.repository.HomePageRepository;
import com.pa.imovie.repository.MovieRepository;
import com.pa.imovie.service.HomePageService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.hasSize;

@SpringBootTest
@AutoConfigureMockMvc
class HomePageControllerTest {

    @Autowired
    private MockMvc client;


    @Autowired
    private MovieRepository movieRepository;

    @Autowired
    private DetailImageRepository detailImageRepository;

    @BeforeEach
    void setUp() {
        movieRepository.deleteAll();
        detailImageRepository.deleteAll();
    }

    @Test
    void should_get_all_movies_when_call_api_given_service_is_up() throws Exception {
        //given
        DetailImage detailImage01 = new DetailImage(1, "详情图01", "详情图01url");
        DetailImage detailImage02 = new DetailImage(2, "详情图02", "详情图02url");
        List<DetailImage> detailImageList = Arrays.asList(detailImage01, detailImage02);
        Movie movie = new Movie(2, "电影名字", "图片url", "分类01,分类02", "表演者", "电影介绍", "上映时间", "电影版本", 180, 4d, null, null, detailImageList);
//        when
        movieRepository.save(movie);
        //then
        client.perform(MockMvcRequestBuilders.get("/home/movieInfo"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$", hasSize(1)))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].movieId").isNumber())
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].movieName").value("电影名字"))
                .andExpect(MockMvcResultMatchers.jsonPath("$[0].movieImage").value("图片url"));
    }

}