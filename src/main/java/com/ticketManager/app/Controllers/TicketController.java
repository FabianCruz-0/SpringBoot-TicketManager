package com.ticketManager.app.Controllers;

import com.ticketManager.app.Models.Ticket;
import com.ticketManager.app.Repositories.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TicketController {
	
	@Autowired
	private TicketRepository ticketRepository;
	
	@Autowired
	private Environment env;
	
	@RequestMapping(value="api/")
	public List<Ticket> hello() {
		return ticketRepository.getTickets();
	}
}
