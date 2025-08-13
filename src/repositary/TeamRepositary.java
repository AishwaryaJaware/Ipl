package repositary;

import cricket.Team;

public class TeamRepositary {
	public static Team getMITeamDetails() {
        Team team = new Team();
        team.setId(101);
        team.setTeamName("Mumbai Indians");
        team.setCaptainName("Hardik Pandya");
        team.setCoachName("Jaywardhan");
        team.setQualified(false);
        team.setnRR(2.3f);
        return team;
    }
}
