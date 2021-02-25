package com.ugurtiguamicons.footballmanagertool.service;


import com.ugurtiguamicons.footballmanagertool.model.Player;
import com.ugurtiguamicons.footballmanagertool.repo.PlayerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class PlayerService {
    private final PlayerRepo playerRepo;

    @Autowired
    public PlayerService(PlayerRepo playerRepo){
        this.playerRepo = playerRepo;
    }

    public Player addPlayer(Player player){
        player.setPlayerCode(UUID.randomUUID().toString());
        return playerRepo.save(player);
    }

    public List<Player> findAllPlayers(){
        return playerRepo.findAll();
    }

    public Player updatePlayer(Player player){
        return playerRepo.save(player);
    }

    public Player findPlayerById(Long id){
        return playerRepo.findPlayerById(id);
    }


    public void deletePlayer(Long id){
        playerRepo.deletePlayerById(id);
    }
}
