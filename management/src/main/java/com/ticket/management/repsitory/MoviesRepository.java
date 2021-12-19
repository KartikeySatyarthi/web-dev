package com.ticket.management.repsitory;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.ticket.management.entity.Hall;
import com.ticket.management.entity.Movies;

@Component
public interface MoviesRepository extends JpaRepository<Movies,Integer> {

	Movies findByMovieId(int movieId);
	
	
}
