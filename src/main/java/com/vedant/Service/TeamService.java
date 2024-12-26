package com.vedant.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vedant.Doa.TeamDoa;
import com.vedant.Model.Team;

@Service
public class TeamService {

	@Autowired
	private TeamDoa teamDoa;

	public String addTeam(Team team) {
		return teamDoa.addTeam(team);
	}

	public List<Team> getAllTeams() {
		return teamDoa.getAllTeams();
	}

	public Team getTeamById(int id) {
		return teamDoa.getTeamById(id);
	}

	public void updateTeamById(int id, Team updateTeam) {
		teamDoa.updateTeamById(id, updateTeam);
	}

	public void deleteTeamById(int id) {
		teamDoa.deleteTeamById(id);

	}

}
