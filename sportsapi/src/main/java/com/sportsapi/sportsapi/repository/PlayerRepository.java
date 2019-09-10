package com.sportsapi.sportsapi.repository;

import com.sportsapi.sportsapi.entity.Player;
import org.springframework.data.repository.CrudRepository;

public interface PlayerRepository extends CrudRepository<Player, Integer>{
}
