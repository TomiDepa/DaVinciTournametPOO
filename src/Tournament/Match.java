package Tournament;

import java.util.ArrayList;
import java.util.Date;

public class Match {
    private String place;
    private Date matchDate;
    private ArrayList<Team> team1;
    private ArrayList<Team> team2;
    private int scoreTeam1;
    private int scoreTeam2;

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public Date getMatchDate() {
        return matchDate;
    }

    public void setMatchDate(Date matchDate) {
        this.matchDate = matchDate;
    }

    public ArrayList<Team> getTeam1() {
        return team1;
    }

    public void setTeam1(ArrayList<Team> team1) {
        this.team1 = team1;
    }

    public ArrayList<Team> getTeam2() {
        return team2;
    }

    public void setTeam2(ArrayList<Team> team2) {
        this.team2 = team2;
    }

    public int getScoreTeam1() {
        return scoreTeam1;
    }

    public void setScoreTeam1(int scoreTeam1) {
        this.scoreTeam1 = scoreTeam1;
    }

    public int getScoreTeam2() {
        return scoreTeam2;
    }

    public void setScoreTeam2(int scoreTeam2) {
        this.scoreTeam2 = scoreTeam2;
    }
    public Match(){
        setPlace("");
        setTeam1(new ArrayList<>());
        setTeam2(new ArrayList<>());
    }
    public Match(String place){
        setPlace(place);
        setTeam1(new ArrayList<>());
        setTeam2(new ArrayList<>());
    }
    public Match(ArrayList<Team> team1){
        setPlace("");
        setTeam1(team2);
        setTeam2(new ArrayList<>());
    }
    public Match(ArrayList<Team> team2){
        setPlace("");
        setTeam1(new ArrayList<>());
        setTeam2(team2);
    }
    public Match(String place,ArrayList<Team>team1,ArrayList<Team>team2){
        setPlace(place);
        setTeam1(team1);
        setTeam2(team2);
    }
}
