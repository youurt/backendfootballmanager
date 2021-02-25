package com.ugurtiguamicons.footballmanagertool.repo;

import com.ugurtiguamicons.footballmanagertool.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PlayerRepo extends JpaRepository<Player, Long> {
    void deletePlayerById(Long id);
    Player findPlayerById(Long id);
}
