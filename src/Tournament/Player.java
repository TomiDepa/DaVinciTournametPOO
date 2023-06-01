package Tournament;

public class Player {
    private String name;
    private String position;
    private int shirtNumber;
    private int goals;
    private int assistens;
    private Team team;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getShirtNumber() {
        return shirtNumber;
    }

    public void setShirtNumber(int shirtNumber) {
        this.shirtNumber = shirtNumber;
    }

    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public int getAssistens() {
        return assistens;
    }

    public void setAssistens(int assistens) {
        this.assistens = assistens;
    }
    public String showTeam() {
        return this.getName() + " pertenece a " + this.getTeam().getName();
    }
    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public Player(){
        setName("");
        setPosition("");
    }
    public Player(String name){
        setName(name);
        setPosition("");
    }
    public Player(String name, String position){
        setName(name);
        setPosition(position);
    }


}
