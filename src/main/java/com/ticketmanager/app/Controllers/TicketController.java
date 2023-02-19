package com.ticketmanager.app.Controllers;

import com.ticketmanager.app.Models.Ticket;
import com.ticketmanager.app.Repositories.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TicketController {
	
	@Autowired
	private TicketRepository ticketRepository;
	
	@Autowired
	private Environment env;
	
	@GetMapping(value="api/tickets")
	public List<Ticket> getTickets() {
		return ticketRepository.getTickets();
	}

	@GetMapping(value = "api/ticket/{id}")
	public Ticket getTicketById(@PathVariable int id) { return  ticketRepository.getTicketById(id); }

	@DeleteMapping(value = "api/ticket/delete/{id}")
	public String deleteTicketById(@PathVariable int id) { return  ticketRepository.deleteTicketById(id); }

	@PostMapping(value = "api/ticket/create")
	public String deleteTicketById(@RequestBody Ticket ticket) { return  ticketRepository.createTicket(ticket); }
}
