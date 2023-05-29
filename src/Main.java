import Tournament.Player;
import Tournament.Team;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Player> playersTumi = new ArrayList<>();
        Player player1 = new Player("Tomas De Paulo","Lateral");
        Player player2 = new Player("Francisco Gargaglione","Arquero");
        Team TumiTeam = new Team("TumiTeam", playersTumi);

        System.out.println(TumiTeam);
    }
}