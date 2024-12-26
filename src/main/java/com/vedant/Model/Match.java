package com.vedant.Model;

public class Match {
	private int matchId;
	private String teamOneName;
	private String teamTwoName;
	private String matchDate;
	private String matchVenue;
	private String matchresult;

	public Match() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Match(int matchId, String teamOneName, String teamTwoName, String matchDate, String matchVenue,
			String matchresult) {
		super();
		this.matchId = matchId;
		this.teamOneName = teamOneName;
		this.teamTwoName = teamTwoName;
		this.matchDate = matchDate;
		this.matchVenue = matchVenue;
		this.matchresult = matchresult;
	}

	public int getMatchId() {
		return matchId;
	}

	public void setMatchId(int matchId) {
		this.matchId = matchId;
	}

	public String getTeamOneName() {
		return teamOneName;
	}

	public void setTeamOneName(String teamOneName) {
		this.teamOneName = teamOneName;
	}

	public String getTeamTwoName() {
		return teamTwoName;
	}

	public void setTeamTwoName(String teamTwoName) {
		this.teamTwoName = teamTwoName;
	}

	public String getMatchDate() {
		return matchDate;
	}

	public void setMatchDate(String matchDate) {
		this.matchDate = matchDate;
	}

	public String getMatchVenue() {
		return matchVenue;
	}

	public void setMatchVenue(String matchVenue) {
		this.matchVenue = matchVenue;
	}

	public String getMatchresult() {
		return matchresult;
	}

	public void setMatchresult(String matchresult) {
		this.matchresult = matchresult;
	}

	@Override
	public String toString() {
		return "Match [matchId=" + matchId + ", teamOneName=" + teamOneName + ", teamTwoName=" + teamTwoName
				+ ", matchDate=" + matchDate + ", matchVenue=" + matchVenue + ", matchresult=" + matchresult + "]";
	}

}
