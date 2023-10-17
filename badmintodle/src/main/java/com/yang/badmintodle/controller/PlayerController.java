package com.yang.badmintodle.controller;
import com.yang.badmintodle.model.Player;
import com.yang.badmintodle.model.dto.PlayerDto;
import com.yang.badmintodle.service.PlayerService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.expression.AccessException;
import org.springframework.web.bind.annotation.*;

import java.nio.file.AccessDeniedException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/v1/api/players")
public class PlayerController {
    private PlayerService playerService;

    @Value("${security.apiKey}")
    private String securityApiKey;

    @Autowired
    public PlayerController(PlayerService playerService){
        this.playerService = playerService;
    }

    @GetMapping
    public List<PlayerDto> getAllPlayers(){
        return playerService.getAllPlayers();
    }

    @GetMapping(path = "/{name}")
    public Optional<Player> getPlayer(@PathVariable("name") String name){
        return playerService.getPlayerByName(name);
    }

    @PostMapping
    public Player createPlayer(@RequestBody Player player, @RequestHeader(name = "apiKey") String apiKey){
        securityCheck(apiKey);
        return playerService.createPlayer(player);
    }

    @DeleteMapping
    public void deletePlayer(@RequestBody Player player, @RequestHeader(name = "apiKey") String apiKey) {
        securityCheck(apiKey);
        playerService.deletePlayer(player);
    }

    private void securityCheck(String apiKey) {
        if (!StringUtils.equals(apiKey, securityApiKey)) {
            throw new IllegalArgumentException("You don't have access to this API.");
        }
    }
}
