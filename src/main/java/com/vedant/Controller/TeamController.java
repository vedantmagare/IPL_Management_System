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

import com.vedant.Model.Team;
import com.vedant.Service.TeamService;

@RestController
public class TeamController {

	@Autowired
	private TeamService teamService;

	@PostMapping("api/teams")
	public String addTeam(@RequestBody Team team) {
		return teamService.addTeam(team);
	}

	@GetMapping("api/teams")
	public List<Team> getAllTeams() {
		return teamService.getAllTeams();
	}

	@GetMapping("api/teams/{teamId}")
	public Object getTeamById(@PathVariable("teamId") int teamId) {
		Team teams = teamService.getTeamById(teamId);

		if (teams != null) {
			return teams;
		} else {
			return "Team ID Is Not Found";
		}

	}

	@PutMapping("api/teams/{teamId}")
	public void updateTeam(@PathVariable("teamId") int id, @RequestBody Team updateTeam) {
		teamService.updateTeamById(id, updateTeam);
	}

	@DeleteMapping("api/teams/{id}")
	public void deleteTeam(@PathVariable int id) {
		teamService.deleteTeamById(id);
	}
}
