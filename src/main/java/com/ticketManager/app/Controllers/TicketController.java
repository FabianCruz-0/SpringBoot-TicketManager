package com.ticketManager.app.Controllers;

import com.ticketManager.app.Models.Ticket;
import com.ticketManager.app.Repositories.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@RestController
public class TicketController {
	
	@Autowired
	private TicketRepository ticketRepository;
	
	@Autowired
	private Environment env;
	
	@RequestMapping(value="api/tickets",method = RequestMethod.GET)
	public List<Ticket> getTickets() {
		return ticketRepository.getTickets();
	}

	@RequestMapping(value = "api/ticket/{id}", method = RequestMethod.GET)
	public Ticket getTicketById(@PathVariable int id) { return  ticketRepository.getTicketById(id); }

	@RequestMapping(value = "api/ticket/delete/{id}", method = RequestMethod.DELETE)
	public String deleteTicketById(@PathVariable int id) { return  ticketRepository.deleteTicketById(id); }

	@RequestMapping(value = "api/ticket/create", method = RequestMethod.POST)
	public String deleteTicketById(@RequestBody Ticket ticket) { return  ticketRepository.createTicket(ticket); }
}
