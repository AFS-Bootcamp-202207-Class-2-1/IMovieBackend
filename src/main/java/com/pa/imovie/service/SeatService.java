package com.pa.imovie.service;

import com.pa.imovie.dto.SeatInfo;
import com.pa.imovie.repository.SeatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeatService {

    @Autowired
    SeatRepository seatRepository;

    public List<SeatInfo> getAllSeatByCinemaMovieTimeId(Integer cinemaMovieTimeId){

        return null;
    }

}
