package com.vedant.Doa;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.vedant.Model.Player;

@Repository
public class PlayerDoa {

	List<Player> playersList = new ArrayList<Player>();

	public String addPlayer(Player player) {
		playersList.add(player);
		return "Added Player Successfuully....";
	}

	public List<Player> getAllPlayer() {
		return playersList;
	}

	public Player getPlayerById(int id) {
		for (Player player : playersList) {
			if (player.getPlayerId() == id) {
				return playersList.get(id);
			}
		}
		return null;
	}

	public void updatePlayerById(int id, Player updatePlayer) {
		for (int i = 0; i < playersList.size(); i++) {
			Player player = playersList.get(i);

			if (player.getPlayerId() == id) {
				playersList.set(i, updatePlayer);
			}
		}
	}

	public void deletePlayerById(int id ) {
		for (int i = 0; i < playersList.size(); i++) {
			Player player = playersList.get(i);
			if(player.getPlayerId() == id) {
				playersList.remove(player);
			}
		}
		
		

	}

}
