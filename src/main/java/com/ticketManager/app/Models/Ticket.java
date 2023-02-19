package com.ticketManager.app.Models;

import jakarta.annotation.Generated;
import jakarta.persistence.*;
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
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Long id;
	@Column
	public String title;
	@Column(name="createdBy")
	public String createdBy;
	@Column
	public String description;
}
