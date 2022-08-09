package com.pa.imovie.service;

import com.pa.imovie.dto.BuyInfo;
import com.pa.imovie.dto.SeatInfo;
import com.pa.imovie.entity.Seat;
import com.pa.imovie.entity.Users;
import com.pa.imovie.repository.SeatRepository;
import com.pa.imovie.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SeatService {

    @Autowired
    SeatRepository seatRepository;

    @Autowired
    UsersRepository usersRepository;

    public List<SeatInfo> getAllSeatByCinemaMovieTimeId(Integer cinemaMovieTimeId){
        List<Seat> seatList = seatRepository.findByCinemaMovieTimeId(cinemaMovieTimeId);
        List<SeatInfo> seatInfoList = new ArrayList<>();
        for (Seat seat : seatList) {
            if (seat.getUsersId() != null){
                Users users = usersRepository.findById(seat.getUsersId()).get();
                seatInfoList.add(new SeatInfo(seat.getSeatId(), seat.getSeatName(), seat.getSeatRow(), seat.getSeatCol(), seat.getSeatReserve(), users.getUsersGender()));
            }else {
                seatInfoList.add(new SeatInfo(seat.getSeatId(), seat.getSeatName(), seat.getSeatRow(), seat.getSeatCol(), seat.getSeatReserve(), null));
            }
        }
        return seatInfoList;
    }

    public List<Seat> buySeat(BuyInfo buyInfo) {
        List<Seat> seatList = new ArrayList<>();
        for (Integer i : buyInfo.getBoughtSeatIdList()) {
            Seat seat = seatRepository.findById(i).get();
            seat.setUsersId(buyInfo.getUsersId());
            seat.setSeatReserve(true);
            Seat updatedSeat = seatRepository.save(seat);
            seatList.add(updatedSeat);
        }
        return seatList;
    }
}
