package com.pa.imovie.controller;

import com.pa.imovie.entity.DetailImage;
import com.pa.imovie.entity.Movie;
import com.pa.imovie.repository.MovieRepository;
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

import static org.hamcrest.Matchers.containsInAnyOrder;

@SpringBootTest
@AutoConfigureMockMvc
public class DetailControllerTest {

    @Autowired
    private MockMvc client;

    @Autowired
    private MovieRepository movieRepository;

    @Autowired
    private DetailController detailController;

    @BeforeEach
    void setUp() {
        movieRepository.deleteAll();
    }

    @Test
    void should_get_an_movie_when_call_getMovieById_api_given_service_is_up() throws Exception {
        // given
        DetailImage detailImage01 = new DetailImage(1, "详情图01", "详情图01url");
        DetailImage detailImage02 = new DetailImage(2, "详情图02", "详情图02url");
        List<DetailImage> detailImageList = Arrays.asList(detailImage01, detailImage02);
        Movie movie = new Movie(2, "电影名字", "图片url", "表演者", "电影介绍", "上映时间", 180, 4d, null, null, detailImageList);
        Movie save = movieRepository.save(movie);
        //then
        client.perform(MockMvcRequestBuilders.get("/detail/{movieId}", save.getMovie_id()))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.movie_id").isNumber())
                .andExpect(MockMvcResultMatchers.jsonPath("$.movie_name").value("电影名字"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.movie_image").value("图片url"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.movie_score").value(4d))
                .andExpect(MockMvcResultMatchers.jsonPath("$.detailImages[*].detailImage_url", containsInAnyOrder("详情图01url", "详情图02url")));
    }

}
