package com.example.springdata.tennisplayer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Date;

@SpringBootApplication
public class TennisPlayerApplication implements CommandLineRunner {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    PlayerDao dao;

    /*@Autowired
    PlayerRepository repo;*/

    @Autowired
    PlayerSpringDataRepository repo;

    public static void main(String[] args) {
        SpringApplication.run(TennisPlayerApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // Getting all players
        //logger.info("All Players Data: {}", dao.getAllPlayers());

        // Getting player that matches an id
        //logger.info("Player with Id 3: {}", dao.getPlayerById(3));

        // Inserting a player recordÒ
        /*logger.info("Inserting Player 4: {}", dao.insertPlayer(
                new Player(4, "Thiem", "Austria",
                        new Date(System.currentTimeMillis()),
                        17)));
        logger.info("All Players Data: {}", dao.getAllPlayers());*/

        /*//Inserting a player
        logger.info("Inserting Player 4: {}", dao.insertPlayer(
                new Player(4, "Thiem", "Austria",
                        new Date(System.currentTimeMillis()), 17)));

        //Updating a player
        logger.info("Updating Player with Id 4: {}",  dao.updatePlayer(
                new Player(4, "Thiem", "Austria",
                        Date.valueOf("1993-09-03"), 17)));

        //View player by Id
        logger.info("Players with Id 4: {}", dao.getPlayerById(4));*/

        /*logger.info("Deleting Player with Id 2: {}", dao.deletePlayerById(2));
        logger.info("All Players Data: {}", dao.getAllPlayers());*/

        //dao.createTournamentTable();

        /*// Using custom mapper
        logger.info("French Players: {}", dao.getPlayerByNationality("France"));*/

        /*// JPA operations
        //insert players
        logger.info("\n\n>> Inserting Player: {}\n", repo.insertPlayer(
                new Player("Djokovic", "Serbia", Date.valueOf("1987-05-22"), 81)));
        logger.info("\n\n>> Inserting Player: {}\n", repo.insertPlayer(
                new Player("Monfils", "France", Date.valueOf("1986-09-01"), 10)));
        logger.info("\n\n>> Inserting Player: {}\n", repo.insertPlayer(
                new Player("Thiem", "Austria",
                        new Date(System.currentTimeMillis()), 17)));

        //update player
        logger.info("\n\n>> Updating Player with Id 3: {}\n", repo.updatePlayer(
                new Player(3, "Thiem", "Austria", Date.valueOf("1993-09-03"), 17)));

        //get player
        logger.info("\n\n>> Player with id 3: {}\n", repo.getPlayerById(3));

        //delete player
        repo.deletePlayerById(2);

        //get all players
        logger.info("All Players Data: {}", repo.getAllPlayers());*/

        // Spring JpaRepository
        //Inserting rows
        logger.info("Inserting Player: {}", repo.save(new Player("Djokovic", "Serbia",
                Date.valueOf("1987-05-22"), 81)));
        logger.info("Inserting Player: {}", repo.save(new Player("Monfils", "France",
                Date.valueOf("1986-09-01"), 10)));
        logger.info("Inserting Player: {}", repo.save(new Player("Thiem", "Austria",
                new Date(System.currentTimeMillis()), 17)));
        //Updating row
        logger.info("Updating Player with Id 3: {}", repo.save(new Player(3, "Thiem", "Austria",
                Date.valueOf("1993-09-03"), 17)));
        //Find by id
        logger.info("Player with Id 2: {}", repo.findById(2));
        //Find all
        logger.info("All Players Data: {}", repo.findAll());
        //Delete by id
        repo.deleteById(2);
    }
}
