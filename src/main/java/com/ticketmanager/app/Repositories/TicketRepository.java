package com.ticketmanager.app.Repositories;

import com.ticketmanager.app.Models.Ticket;

import java.util.List;

public interface TicketRepository {

	List<Ticket> getTickets();
	Ticket getTicketById(int id);
	String deleteTicketById(int id);
	String createTicket(Ticket ticket);
}
