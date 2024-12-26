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

import com.vedant.Model.Match;
import com.vedant.Model.Team;
import com.vedant.Service.MatchService;

@RestController
public class MatchController {

	@Autowired
	MatchService matchservice;

	@PostMapping("/api/matchs")
	public String addMatch(@RequestBody Match match) {
		return matchservice.addMatch(match);
	}

	@GetMapping("/api/matchs")
	public List<Match> getAllMatch() {
		return matchservice.getAllMatch();
	}

	@GetMapping("/api/matchs/{matchId}")
	public Object getMatchById(@PathVariable("matchID") int id) {

		Match match = matchservice.getMatchById(id);
		if (match != null) {
			return match;
		} else {
			return "Match ID Is Not Found";
		}

	}

	@PutMapping("api/matchs/{matchId}")
	public void updateTeam(@PathVariable("matchId") int id, @RequestBody Match updateTeam) {
		matchservice.updateMachById(id, updateTeam);
	}

	@DeleteMapping("/api/matchs/{matchId}")
	public String deleteMatch(@PathVariable("matchId") int id) {
		return matchservice.deleteMatch(id);

	}

}
