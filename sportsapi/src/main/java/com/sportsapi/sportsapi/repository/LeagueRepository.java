package com.sportsapi.sportsapi.repository;

import com.sportsapi.sportsapi.entity.League;
import org.springframework.data.repository.CrudRepository;

public interface LeagueRepository extends CrudRepository<League, Integer> {
}
