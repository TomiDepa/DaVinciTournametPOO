import Tournament.Team;

public class Main {
    public static void main(String[] args) {
       Team TumiTeam = new Team();
       TumiTeam.getPlayers().forEach(player -> {
           System.out.println(player.getName());
       });
    }
}