package com.vedant.Doa;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.vedant.Model.Team;

@Repository
public class TeamDoa {

	List<Team> teamList = new ArrayList<Team>();

	public String addTeam(Team team) {
		teamList.add(team);
		return "Added SUccefully";
	}

	public List<Team> getAllTeams() {
		return teamList;
	}

	public Team getTeamById(int id) {
		Team t = null;
		for (Team team : teamList)
			if (team.getTeamId() == id) {
				t = team;
			}
		return t;

	}

	public void updateTeamById(int id, Team updateTeam) {
		for (int i = 0; i < teamList.size(); i++) {
			Team team = teamList.get(i);
			if (team.getTeamId() == id) {
				teamList.set(i, updateTeam);
			}
		}
	}

	public void deleteTeamById(int id) {
		for (int i = 0; i < teamList.size(); i++) {
			Team teams = teamList.get(i);
			if (teams.getTeamId() == id) {
				teamList.remove(id);
			}
		}
	}

}
