package com.example.springdata.tennisplayer;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerSpringDataRepository extends JpaRepository<Player, Integer> {
    //no implementation required!
}
