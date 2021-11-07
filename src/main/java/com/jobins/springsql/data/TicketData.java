package com.jobins.springsql.data;

import org.springframework.data.repository.CrudRepository;

import com.jobins.springsql.model.Ticket;

public interface TicketData extends CrudRepository<Ticket,Integer> {

}
