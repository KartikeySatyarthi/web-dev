package com.ticket.management.repsitory;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ticket.management.entity.Hall;
import com.ticket.management.entity.Movies;

public interface HallRepository extends JpaRepository<Hall,Integer>  {

	public List<Hall> findByHallLocation( String hallLocation);
}
