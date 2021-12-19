package com.ticket.management.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ticket.management.entity.Hall;
import com.ticket.management.entity.Movies;
import com.ticket.management.repsitory.HallRepository;
import com.ticket.management.repsitory.MoviesRepository;
import com.ticket.management.repsitory.UserRepository;

@RestController

public class TestRestController {	
	@Autowired
	private HallRepository hallRepository;
	
	@Autowired
	private MoviesRepository moviesRepository;
			
	@RequestMapping("/")
	public List<Movies> homePage()
	{		
		return moviesRepository.findAll();
	}
	
	@GetMapping("/movies/halls/{movieId}")
	public List<Hall>hallList(@PathVariable int movieId)
	{
		List<Hall> halls = moviesRepository.findByMovieId(movieId).getHalls();
			
		return halls;
	}
	
	@GetMapping("/movies/halls/{movieId}/{hallLocation}")
	public List<Hall>hallAt(@PathVariable  String hallLocation)
	{
		List<Hall>halls = hallRepository.findByHallLocation(hallLocation);
		
		return halls;
	}
	 
	

}
