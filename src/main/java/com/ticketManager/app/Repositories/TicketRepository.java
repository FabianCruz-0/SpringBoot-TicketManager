package com.ticketManager.app.Repositories;

import com.ticketManager.app.Models.Ticket;

import java.util.List;

public interface TicketRepository {

	List<Ticket> getTickets();
}
