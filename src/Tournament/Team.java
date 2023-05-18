package Tournament;

import java.util.ArrayList;

public class Team {
    private String name;
    private int winMatches;
    private int lostMatches;
    private int tiedMatches;
    private ArrayList<Player> players;
    private int points;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWinMatches() {
        return winMatches;
    }

    public void setWinMatches(int winMatches) {
        this.winMatches = winMatches;
    }

    public int getLostMatches() {
        return lostMatches;
    }

    public void setLostMatches(int lostMatches) {
        this.lostMatches = lostMatches;
    }

    public int getTiedMatches() {
        return tiedMatches;
    }

    public void setTiedMatches(int tiedMatches) {
        this.tiedMatches = tiedMatches;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}
