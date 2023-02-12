package com.ticketManager.app.Repositories;

import com.ticketManager.app.Models.Ticket;
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
	
	@Override
	@Transactional
	public List<Ticket> getTickets() {
		String query = "FROM Ticket"; //class name, not db table name
		return em.createQuery(query).getResultList();

	}

}
