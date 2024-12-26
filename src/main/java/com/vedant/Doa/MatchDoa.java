package com.vedant.Doa;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.vedant.Model.Match;

@Repository
public class MatchDoa {

	List<Match> matchsList = new ArrayList<Match>();

	public String addMatch(Match match) {
		matchsList.add(match);
		return "Added Match Is Successfully";
	}

	public List<Match> getAllMatch() {
		return matchsList;
	}

	public Match getMatchById(int id) {
		for (Match match : matchsList) {
			if (match.getMatchId() == id) {
				return matchsList.get(id);
			}
		}
		return null;
	}

	public void updateMatchById(int id, Match updateTeam) {
		for (int i = 0; i < matchsList.size(); i++) {
			Match match = matchsList.get(i);
			if (match.getMatchId() == id) {
				matchsList.set(i, updateTeam);
			}
		}

	}

	public String deleteMatch(int id) {
		for (Match match : matchsList) {
			if (match.getMatchId() == id) {
				matchsList.remove(match);
				return "Remove Successfully";
			}
		}
		return "try again...";

	}

}
