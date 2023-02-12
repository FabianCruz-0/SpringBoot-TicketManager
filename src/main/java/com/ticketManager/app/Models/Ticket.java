package com.ticketManager.app.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor 
@Entity
@Table(name = "Ticket")
public class Ticket {

	public Ticket(){

	}
	@Id
	@Column
	public Long id;
	@Column
	public String title;
	@Column(name="createdBy")
	public String createdBy;
	@Column
	public String description;
}
