package com.pa.imovie.repository;

import com.pa.imovie.entity.Seat;
import com.pa.imovie.entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketRepository extends JpaRepository<Ticket,Integer> {

    Ticket findTicketByUsersId(Integer usersId);



}
