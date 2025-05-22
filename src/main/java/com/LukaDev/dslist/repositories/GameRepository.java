package com.LukaDev.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.LukaDev.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
	
	

}
