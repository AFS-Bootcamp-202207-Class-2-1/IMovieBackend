package com.pa.imovie.service;

import com.pa.imovie.entity.Cinema;
import com.pa.imovie.dto.CinemaMovieItem;
import com.pa.imovie.entity.CinemaMovie;
import com.pa.imovie.entity.CinemaMovieTime;
import com.pa.imovie.repository.CinemaMovieRepository;
import com.pa.imovie.repository.CinemaMovieTimeRepository;
import com.pa.imovie.repository.CinemaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CinemaMovieTimeService {

    @Autowired
    CinemaMovieRepository cinemaMovieRepository;

    @Autowired
    CinemaMovieTimeRepository cinemaMovieTimeRepository;

    @Autowired
    CinemaRepository cinemaRepository;

    public List<CinemaMovieItem> getCinemaMovieTimeListByMovieId(Integer movie_id) {
        List<CinemaMovie> cinemaMovieList = cinemaMovieRepository.findByMovieId(movie_id);
        List<CinemaMovieTime> cinemaMovieTimeList = new ArrayList<>();
        List<CinemaMovieItem> cinemaMovieItemList = new ArrayList<>();
        for (CinemaMovie cinemaMovie : cinemaMovieList) {
            Cinema cinema = cinemaRepository.findById(cinemaMovie.getCinemaId()).get();
            cinemaMovieTimeList = cinemaMovieTimeRepository.findByCinemaMovieId(cinemaMovie.getCinemaId());
            for (CinemaMovieTime cinemaMovieTime : cinemaMovieTimeList){
                cinemaMovieItemList.add(new CinemaMovieItem(cinemaMovieTime.getCinemaMovieTimeId(), cinemaMovieTime.getCinemaMovieTimeWatchtime(), cinemaMovieTime.getCinemaMovieTimeEndtime(), cinemaMovieTime.getCinemaMovieTimePrice(), cinema.getCinemaId(), cinema.getCinemaName()));
            }
        }
        return cinemaMovieItemList;
    }

    public List<CinemaMovieItem> getCinemaMovieTimeListByMovieIdAndDate(Integer movie_id, String cinemaMovieTime_watchtime) {
        List<CinemaMovieItem> cinemaMovieItemList = getCinemaMovieTimeListByMovieId(movie_id);
        List<CinemaMovieItem> updatedCinemaMovieItemList = new ArrayList<>();
        for (CinemaMovieItem cinemaMovieItem : cinemaMovieItemList) {
            String startTime = cinemaMovieItem.getCinemaMovieTimeWatchtime();
            String startDate = startTime.substring(0, startTime.indexOf(' '));
            if (startDate.equals(cinemaMovieTime_watchtime)){
                updatedCinemaMovieItemList.add(cinemaMovieItem);
            }
        }
        return updatedCinemaMovieItemList;
    }
}
