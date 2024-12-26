package com.vedant.Model;

public class Player {
	private int playerId;
	private String playerName;
	private int age;
	private String teamName;
	private String role;

	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Player(int playerId, String playerName, int age, String teamName, String role) {
		super();
		this.playerId = playerId;
		this.playerName = playerName;
		this.age = age;
		this.teamName = teamName;
		this.role = role;
	}

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "Player [playerId=" + playerId + ", playerName=" + playerName + ", age=" + age + ", teamName=" + teamName
				+ ", role=" + role + "]";
	}

}
