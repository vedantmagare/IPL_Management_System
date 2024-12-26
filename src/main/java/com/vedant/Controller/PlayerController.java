package com.vedant.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vedant.Model.Player;
import com.vedant.Service.PlayerService;

@RestController
public class PlayerController {

	@Autowired
	PlayerService playerService;

	@PostMapping("/api/players")
	public String addPlayer(@RequestBody Player player) {
		return playerService.addPlayer(player);
	}

	@GetMapping("/api/players")
	public List<Player> getAllPlayer() {
		return playerService.getAllPlayer();
	}

	@GetMapping("/api/players/{playerId}")
	public Object getPlayerById(@PathVariable("playerId") int id) {
		
		Player Players = playerService.getPlayerById(id);
		if (Players != null) {
			return Players;
		} else {
			return "Player ID Is Not Found";
		}
	}

	@PutMapping("/api/players/{playerId}")
	public void updatePlayerById(@PathVariable("playerId") int id, @RequestBody Player updatePlayer) {
		playerService.updatePlayerById(id, updatePlayer);

	}

	@DeleteMapping("/api/players/{playerId}")
	public void deletePlayerById(@PathVariable("playerId") int id) {
		playerService.deletePlayerById(id);

	}
}
