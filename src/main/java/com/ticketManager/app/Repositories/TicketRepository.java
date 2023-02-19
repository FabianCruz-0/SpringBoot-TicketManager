package com.ticketManager.app.Repositories;

import com.ticketManager.app.Models.Ticket;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

public interface TicketRepository {

	List<Ticket> getTickets();
	Ticket getTicketById(int id);
	String deleteTicketById(int id);
	String createTicket(Ticket ticket);
}
