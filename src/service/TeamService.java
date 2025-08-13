package service;

import cricket.Team;
import repositary.TeamRepositary;


public class TeamService {
	public void printTeamDetails() {
		Team team = TeamRepositary.getMITeamDetails();
		System.out.println(team.getId());
		System.out.println(team.TeamName());
		System.out.println(team.getCaptainName());
		System.out.println(team.getCoachName());
		System.out.println(team.getnRR());
		System.out.println(team.isQualified());
	}
}
	

