package Tournament;

import java.util.ArrayList;
import java.util.Date;

public class Season {
    private String name;
    private Date startDate;
    private Date endDate;
    private ArrayList<Match> matches;
    private ArrayList<Team> teams;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public ArrayList<Match> getMatches() {
        return matches;
    }

    public void setMatches(ArrayList<Match> matches) {
        this.matches = matches;
    }

    public ArrayList<Team> getTeams() {
        return teams;
    }

    public void setTeams(ArrayList<Team> teams) {
        this.teams = teams;
    }

    public Season(){
        setName("");
        setMatches(new ArrayList<>());
        setTeams(new ArrayList<>());
    }
    public Season(String name){
        setName(name);
        setMatches(new ArrayList<>());
        setTeams(new ArrayList<>());
    }
    public Season(ArrayList<Match> matches){
        setName("");
        setMatches(matches);
        setTeams(new ArrayList<>());
    }
    public Season(ArrayList<Team> teams){
        setName("");
        setMatches(new ArrayList<>());
        setTeams(teams);
    }
    public Season(String name,ArrayList<Match> matches, ArrayList<Team> teams){
        setName(name);
        setMatches(matches);
        setTeams(teams);
    }
}
