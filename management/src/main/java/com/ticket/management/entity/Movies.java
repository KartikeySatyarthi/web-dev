package com.ticket.management.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="movies")
public class Movies {
	
	@Id
	@Column(name="movie_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int movieId;
	
	@Column(name="movie_name")
	private String movieName;
	
	@Column(name="movie_actor")
	private String movieActor;
	
	@Column(name="movie_rating")
	private int movieRating;
	
	public Movies()
	{}

	@ManyToMany()
	@JoinTable(
			name="movie_hall",
			joinColumns=@JoinColumn(name="movie_id"),
			inverseJoinColumns=@JoinColumn(name="hall_id")
			)
	private List<Hall> halls;
	
	public  List<Hall> getHalls() {
		return halls;
	}
	
	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getMovieActor() {
		return movieActor;
	}

	public void setMovieActor(String movieActor) {
		this.movieActor = movieActor;
	}

	public int getMovieRating() {
		return movieRating;
	}

	public void setMovieRating(int movieRating) {
		this.movieRating = movieRating;
	}

	public Movies(String movieName, String movieActor, int movieRating) {
		this.movieName = movieName;
		this.movieActor = movieActor;
		this.movieRating = movieRating;
		
	}
	
	
	
}
