package com.ticket.management.repsitory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ticket.management.entity.Movies;

public interface UserRepository extends JpaRepository<Movies,Integer> {

}

