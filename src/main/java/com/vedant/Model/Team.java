package com.vedant.Model;

public class Team {
	private int teamId;
	private String teamName;
	private String teamCity;
	private String teamCoach;

	public Team() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Team(int teamId, String teamName, String teamCity, String teamCoach) {
		super();
		this.teamId = teamId;
		this.teamName = teamName;
		this.teamCity = teamCity;
		this.teamCoach = teamCoach;
	}

	public int getTeamId() {
		return teamId;
	}

	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getTeamCity() {
		return teamCity;
	}

	public void setTeamCity(String teamCity) {
		this.teamCity = teamCity;
	}

	public String getTeamCoach() {
		return teamCoach;
	}

	public void setTeamCoach(String teamCoach) {
		this.teamCoach = teamCoach;
	}

	@Override
	public String toString() {
		return "Team [teamId=" + teamId + ", teamName=" + teamName + ", teamCity=" + teamCity + ", teamCoach="
				+ teamCoach + "]";
	}

}
