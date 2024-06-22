import java.util.UUID;
//Created by S1ft 2024

public class Game {
    private UUID gameID;
    private Team winningTeam;
    private Team losingTeam;

    //TODO: change to store elo of each player at game time
    public Game(Team winningTeam, Team losingTeam) {
        this.winningTeam = winningTeam;
        this.losingTeam = losingTeam;
        this.gameID = UUID.randomUUID();
    }

    public Team getWinningTeam() {
        return winningTeam;
    }

    public Team getLosingTeam() {
        return losingTeam;
    }

    public UUID getGameID() {
        return gameID;
    }
}
