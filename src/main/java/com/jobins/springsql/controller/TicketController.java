package com.jobins.springsql.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.jobins.springsql.data.TicketData;
import com.jobins.springsql.model.Ticket;

@RestController
@RequestMapping("/ticket")
public class TicketController {
	@Autowired
	private TicketData data;

	@PostMapping("/bookTickets")
	public  String bookTicket(@RequestBody List<Ticket> tickets) {
	 data.saveAll(tickets);
	 return "tickets booked :"+tickets.size();
		
	}

	@GetMapping("/getTickets")
	public List<Ticket> getTickets() {
		return (List<Ticket>) data.findAll();
	}

}