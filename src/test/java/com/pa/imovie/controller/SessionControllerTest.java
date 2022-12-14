package com.pa.imovie.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.pa.imovie.dto.BuyInfo;
import com.pa.imovie.entity.*;
import com.pa.imovie.repository.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.ArrayList;
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

    @Autowired
    private SeatRepository seatRepository;

    @Autowired
    private UsersRepository usersRepository;

    @BeforeEach
    void setUp() {
        cinemaMovieRepository.deleteAll();
        cinemaMovieTimeRepository.deleteAll();
        cinemaRepository.deleteAll();
        movieRepository.deleteAll();
        seatRepository.deleteAll();
        usersRepository.deleteAll();
    }

//    @Test
//    void should_get_all_movie_session_when_call_getCinemaMovieTimeList_api_given_service_is_up() throws Exception {
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

//    @Test
//    void should_get_all_movie_session_when_call_getCinemaMovieTimeListByDate_api_given_service_is_up() throws Exception {
//        // given
//        CinemaMovieTime cinemaMovieTime01 = new CinemaMovieTime(1, "2022-01-02 12:30", "结束时间1", 40d);
//        CinemaMovieTime cinemaMovieTime02 = new CinemaMovieTime(2, "2022-01-03 14:30", "结束时间2", 45d);
//        List<CinemaMovieTime> cinemaMovieTimeList01 = Arrays.asList(cinemaMovieTime01, cinemaMovieTime02);
//        CinemaMovieTime cinemaMovieTime03 = new CinemaMovieTime(3, "2022-01-04 12:30", "结束时间1", 40d);
//        CinemaMovieTime cinemaMovieTime04 = new CinemaMovieTime(4, "2022-01-02 12:30", "结束时间2", 45d);
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
//        String dateJsonStr = "2022-01-02";
//        //then
//        client.perform(MockMvcRequestBuilders.post("/session/{movieId}", save.getMovieId())
//                    .contentType(MediaType.APPLICATION_JSON)
//                    .content(dateJsonStr))
//                .andExpect(MockMvcResultMatchers.status().isOk())
//                .andExpect(MockMvcResultMatchers.jsonPath("$[*].cinemaMovieTimeId", containsInAnyOrder(1, 4)))
//                .andExpect(MockMvcResultMatchers.jsonPath("$[*].cinemaMovieTimeWatchtime", containsInAnyOrder("2022-01-02 12:30", "2022-01-02 12:30")))
//                .andExpect(MockMvcResultMatchers.jsonPath("$[*].cinemaMovieTimePrice", containsInAnyOrder(40d, 45d)))
//                .andExpect(MockMvcResultMatchers.jsonPath("$[*].cinemaId", containsInAnyOrder(1, 2)))
//                .andExpect(MockMvcResultMatchers.jsonPath("$[*].cinemaName", containsInAnyOrder("影院1名字", "影院2名字")));
//    }

//    @Test
//    void should_get_all_session_seat_when_call_getSeatList_api_given_service_is_up() throws Exception {
//        // given
//        List<Seat> seatList = new ArrayList<>();
//        for (int i = 0; i < 24; i++) {
//            if (i == 0){
//                Seat seat = new Seat(0, "座位编号", 0, 0, true);
//                List<Seat> UsersSeatList = Arrays.asList(seat);
//                Users users = new Users(1, "", "", "男", UsersSeatList, null);
//                usersRepository.save(users);
//            }else {
//                seatList.add(new Seat(0, "座位编号", i / 6, i % 6, false));
//            }
//        }
//        CinemaMovieTime cinemaMovieTime = new CinemaMovieTime(1, "电影开始时间", "电影结束时间", 30d, null, null,seatList);
//        CinemaMovieTime save = cinemaMovieTimeRepository.save(cinemaMovieTime);
//        seatRepository.save(new Seat(1, "座位编号", 0, 0, true, 1, 1));
//        //then
//        client.perform(MockMvcRequestBuilders.get("/seat/{cinemaMovieTime_id}", save.getCinemaMovieTimeId()))
//                .andExpect(MockMvcResultMatchers.status().isOk())
//                .andExpect(MockMvcResultMatchers.jsonPath("$[0].seatRow").value(0))
//                .andExpect(MockMvcResultMatchers.jsonPath("$[0].seatCol").value(1))
//                .andExpect(MockMvcResultMatchers.jsonPath("$[23].usersGender").value("男"));
//    }

//    @Test
//    void should_buy_ticket_when_call_buySeat_api_given_service_is_up() throws Exception {
//        // given
//        List<Seat> seatList = new ArrayList<>();
//        for (int i = 0; i < 24; i++) {
//            seatList.add(new Seat(0, "座位编号", i / 6, i % 6, false));
//        }
//        CinemaMovieTime cinemaMovieTime = new CinemaMovieTime(1, "电影开始时间", "电影结束时间", 30d, null, null,seatList);
//        CinemaMovieTime save = cinemaMovieTimeRepository.save(cinemaMovieTime);
//        BuyInfo buyInfo = new BuyInfo(73, 1, 1, 1, save.getCinemaMovieTimeId(), Arrays.asList(2, 3));
//        String buyInfoJsonStr = new ObjectMapper().writeValueAsString(buyInfo);
//        //then
//        client.perform(MockMvcRequestBuilders.post("/seat")
//                        .contentType(MediaType.APPLICATION_JSON)
//                        .content(buyInfoJsonStr))
//                .andExpect(MockMvcResultMatchers.status().isOk())
//                .andExpect(MockMvcResultMatchers.jsonPath("$[0].seatReserve").value(true))
//                .andExpect(MockMvcResultMatchers.jsonPath("$[1].seatReserve").value(true));
//    }

}
