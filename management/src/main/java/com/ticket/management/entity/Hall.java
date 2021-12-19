package com.ticket.management.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="hall")
public class Hall {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="hall_id")
	private int hallId;
	
	@Column(name="hall_name")
	private String hallName;
	
	@Column(name="hall_location")
	private String hallLocation;

	public Hall() {}
	
	@ManyToMany()
	@JoinTable(
			name="movie_hall",
			joinColumns=@JoinColumn(name="hall_id"),
			inverseJoinColumns=@JoinColumn(name="movie_id")
			)
	private List<Movies> movies;
	

	public int getHallId() {
		return hallId;
	}

	public void setHallId(int hallId) {
		this.hallId = hallId;
	}

	public String getHallName() {
		return hallName;
	}

	public void setHallName(String hallName) {
		this.hallName = hallName;
	}

	public String getHallLocation() {
		return hallLocation;
	}

	public void setHallLocation(String hallLocation) {
		this.hallLocation = hallLocation;
	}

	public Hall(String hallName, String hallLocation) {
		this.hallName = hallName;
		this.hallLocation = hallLocation;
		
	}
	
	
}