package com.yang.badmintodle.service;

import com.yang.badmintodle.model.dto.PlayerDto;
import com.yang.badmintodle.repository.PlayerRepository;
import com.yang.badmintodle.model.Player;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class PlayerService {
    private final PlayerRepository playerRepository;

    @Autowired
    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public Optional<Player> getPlayerByName(String name) {
        return playerRepository.findAllByName(name)
                .stream()
                .findFirst();
    }

    public List<PlayerDto> getAllPlayers(){
        return playerRepository.findAll()
                .stream()
                .map(this::convert)
                .collect(Collectors.toList());
    }

    private PlayerDto convert(Player player) {
        PlayerDto playerDto = new PlayerDto();
        BeanUtils.copyProperties(player, playerDto);
        return playerDto;
    }

    public Player createPlayer(Player player) {
        String uuid = UUID.randomUUID().toString();
        player.setId(uuid);
        playerRepository.save(player);
        return player;
    }

    public void deletePlayer(Player player){
        playerRepository.delete(player);
    }
}
