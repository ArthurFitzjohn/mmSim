import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Set;

//Created by S1ft 2024
public class Main {
    public static void main(String[] args) throws SQLException {
        PlayerGenerator playerGenerator = new PlayerGenerator();
        Set<Player> players = playerGenerator.GeneratePlayers(15000);


        ArrayList<Player> playerList = new ArrayList<Player>(players);
        ArrayList<Player> playerList2 = new ArrayList<Player>(players);

        int ratingDiff = 100;
        GameCalculator gc = new GameCalculator(ratingDiff, playerList, 1500000);
        GameCalculator gc2 = new GameCalculator(ratingDiff, playerList2, 1500000);
        gc.calculateGamesElo();
        gc2.calculateGamesPersonalSkill();
        //System.out.println("do you want to calculate games with normal elo (1) or personal skill (2)?");
        //Scanner scanner = new Scanner(System.in);
        /*int choice = scanner.nextInt();
        if (choice == 1) {
            gc.calculateGamesElo();
        }
        else if (choice == 2) {
            gc.calculateGamesPersonalSkill();
        }*/
    }
}