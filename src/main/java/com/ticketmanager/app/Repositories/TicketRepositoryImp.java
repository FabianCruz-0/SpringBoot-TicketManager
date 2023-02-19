package com.ticketmanager.app.Repositories;

import com.ticketmanager.app.Models.Ticket;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public class TicketRepositoryImp implements TicketRepository {

	@PersistenceContext
	private EntityManager em;
	String query;
	
	@Override
	@Transactional
	public List<Ticket> getTickets() {
		query = "FROM Ticket"; //class name, not db table name
		return em.createQuery(query).getResultList();

	}

	@Override
	@Transactional
	public Ticket getTicketById(int id) {
		query = "FROM Ticket WHERE id = :id";
		List<Ticket> tickets = em.createQuery(query).setParameter("id",id).getResultList();
		return tickets.get(0);
	}

	@Override
	public String deleteTicketById(int id) {
		query = "DELETE FROM Ticket WHERE id = :id";
		em.createQuery(query).setParameter("id",id).executeUpdate();
		return "DELETED";

		/*
		Ticket ticket = em.find(Ticket.class, id);
		entityManager.remove(ticket);
		 */
	}

	@Override
	public String createTicket(Ticket ticket) {
		em.merge(ticket);
		return "CREATED";
	}

}
