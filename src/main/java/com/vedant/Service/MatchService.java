package com.vedant.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vedant.Doa.MatchDoa;
import com.vedant.Model.Match;

@Service
public class MatchService {

	@Autowired
	MatchDoa matchDoa;

	public String addMatch(Match match) {
		return matchDoa.addMatch(match);
	}

	public List<Match> getAllMatch() {
		return matchDoa.getAllMatch();
	}

	public Match getMatchById(int id) {
		return matchDoa.getMatchById(id);
	}

	public void updateMachById(int id, Match updateTeam) {
		matchDoa.updateMatchById(id, updateTeam);

	}

	public String deleteMatch(int id) {
		return matchDoa.deleteMatch(id);

	}

}
