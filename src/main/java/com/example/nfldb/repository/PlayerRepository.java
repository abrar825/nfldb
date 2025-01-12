package com.example.nfldb.repository;

import com.example.nfldb.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface PlayerRepository extends JpaRepository<Player, String> {
    Optional<Player> findByName(String name);
}
