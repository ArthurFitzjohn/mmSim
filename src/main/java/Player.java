import java.util.*;
//Created by S1ft 2024

public class Player implements Comparable<Player> {
    private String name;
    private double skill;
    private int rating;
    private double volatility;
    private double confidence;
    private int gamesWon;
    private int gamesPlayed;
    private UUID uuid;
    //private Set<Game> gameHistory = new HashSet<Game>();
    private Deque<Integer> eloHistory = new ArrayDeque<>();

    public Player(String name, double skill, int rating, double volatility, double confidence) {
        this.name = name;
        this.skill = skill;
        this.rating = rating;
        this.volatility = volatility;
        this.confidence = confidence;
        this.gamesWon = 0;
        this.gamesPlayed = 0;
        this.uuid = UUID.randomUUID();
    }

    public UUID getUuid() {
        return uuid;
    }

    public String getName() {
        return name;
    }

    public double getSkill() {
        return skill;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public double getVolatility() {
        return volatility;
    }

    public void setVolatility(double volatility) {
        this.volatility = volatility;
    }

    public double getConfidence() {
        return confidence;
    }

    public void setConfidence(double confidence) {
        this.confidence = confidence;
    }

    public void addGameWon() {
        this.gamesWon++;
        this.gamesPlayed++;
        //this.gameHistory.add(game);
        this.eloHistory.addLast(this.rating);
    }

    public void addGameLost()
    {
        this.gamesPlayed++;
        //this.gameHistory.add(game);
        this.eloHistory.addLast(this.rating);
    }

    public int getGamesWon() {
        return gamesWon;
    }

    public int getGamesPlayed() {
        return gamesPlayed;
    }

    public Deque<Integer> getEloHistory() {
        return eloHistory;
    }

    @Override
    public int compareTo(Player p2)
    {
        return this.rating - p2.getRating();
    }
}
