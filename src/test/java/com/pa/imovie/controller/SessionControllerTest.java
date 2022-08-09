package com.pa.imovie.controller;

import com.pa.imovie.entity.Cinema;
import com.pa.imovie.entity.CinemaMovie;
import com.pa.imovie.entity.CinemaMovieTime;
import com.pa.imovie.entity.Movie;
import com.pa.imovie.repository.CinemaMovieRepository;
import com.pa.imovie.repository.CinemaMovieTimeRepository;
import com.pa.imovie.repository.CinemaRepository;
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
public class SessionControllerTest {

    @Autowired
    private MockMvc client;

    @Autowired
    private CinemaMovieRepository cinemaMovieRepository;

    @Autowired
    private CinemaMovieTimeRepository cinemaMovieTimeRepository;

    @Autowired
    private MovieRepository movieRepository;

    @Autowired
    private CinemaRepository cinemaRepository;

    @BeforeEach
    void setUp() {
        cinemaMovieRepository.deleteAll();
        cinemaMovieTimeRepository.deleteAll();
        cinemaRepository.deleteAll();
        movieRepository.deleteAll();

    }

//    @Test
//    void should_get_an_movie_when_call_getMovieById_api_given_service_is_up() throws Exception {
//        // given
//        CinemaMovieTime cinemaMovieTime01 = new CinemaMovieTime(1, "开始时间1", "结束时间1", 40d);
//        CinemaMovieTime cinemaMovieTime02 = new CinemaMovieTime(2, "开始时间2", "结束时间2", 45d);
//        List<CinemaMovieTime> cinemaMovieTimeList01 = Arrays.asList(cinemaMovieTime01, cinemaMovieTime02);
//        CinemaMovieTime cinemaMovieTime03 = new CinemaMovieTime(3, "开始时间1", "结束时间1", 40d);
//        CinemaMovieTime cinemaMovieTime04 = new CinemaMovieTime(4, "开始时间2", "结束时间2", 45d);
//        List<CinemaMovieTime> cinemaMovieTimeList02 = Arrays.asList(cinemaMovieTime03, cinemaMovieTime04);
//        Cinema cinema01 = new Cinema(1, "影院1名字", "", "");
//        cinemaRepository.save(cinema01);
//        Cinema cinema02 = new Cinema(2, "影院2名字", "", "");
//        cinemaRepository.save(cinema02);
//        CinemaMovie cinemaMovie01 = new CinemaMovie(1, 1, 1, cinemaMovieTimeList01);
//        CinemaMovie cinemaMovie02 = new CinemaMovie(2, 2, 1, cinemaMovieTimeList02);
//        List<CinemaMovie> cinemaMovieList = Arrays.asList(cinemaMovie01, cinemaMovie02);
//        Movie movie = new Movie(1, "电影名字", "电影url", "电影种类", "电影演员", "电影介绍", "电影上映时间", "电影版本", 120, 9d, cinemaMovieList, null, null);
//        Movie save = movieRepository.save(movie);
//        //then
//        client.perform(MockMvcRequestBuilders.get("/session/{movieId}", save.getMovieId()))
//                .andExpect(MockMvcResultMatchers.status().isOk())
//                .andExpect(MockMvcResultMatchers.jsonPath("$[*].cinemaMovieTimeId", containsInAnyOrder(1, 2, 3, 4)))
//                .andExpect(MockMvcResultMatchers.jsonPath("$[*].cinemaMovieTimeWatchtime", containsInAnyOrder("开始时间1", "开始时间2", "开始时间1", "开始时间2")))
//                .andExpect(MockMvcResultMatchers.jsonPath("$[*].cinemaMovieTimePrice", containsInAnyOrder(40d, 45d, 40d, 45d)))
//                .andExpect(MockMvcResultMatchers.jsonPath("$[*].cinemaId", containsInAnyOrder(1, 1, 2, 2)))
//                .andExpect(MockMvcResultMatchers.jsonPath("$[*].cinemaName", containsInAnyOrder("影院1名字", "影院2名字", "影院1名字", "影院2名字")));
//    }
}
