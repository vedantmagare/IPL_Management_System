package com.vedant.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vedant.Doa.PlayerDoa;
import com.vedant.Model.Player;

@Service
public class PlayerService {

	@Autowired
	PlayerDoa playerDoa;

	public String addPlayer(Player player) {
		return playerDoa.addPlayer(player);
	}

	public List<Player> getAllPlayer() {
		return playerDoa.getAllPlayer();
	}

	public Player getPlayerById(int id) {
		return playerDoa.getPlayerById(id);
	}

	public void updatePlayerById(int id, Player updatePlayer) {
		playerDoa.updatePlayerById(id, updatePlayer);
	}

	public void deletePlayerById(int id) {
		playerDoa.deletePlayerById(id);
	}
}
