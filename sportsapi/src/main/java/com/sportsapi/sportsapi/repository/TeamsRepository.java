package com.sportsapi.sportsapi.repository;

import com.sportsapi.sportsapi.entity.Team;
import org.springframework.data.repository.CrudRepository;

public interface TeamsRepository extends CrudRepository<Team, Integer>{
}
