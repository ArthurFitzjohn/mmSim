import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Team {
    private Player player1;
    private Player player2;
    private Player player3;
    private Player player4;
    private Player player5;
    private int player1ELO;
    private int player2ELO;
    private int player3ELO;
    private int player4ELO;
    private int player5ELO;
    private Player[] team = new Player[5];
    private ArrayList<Double> skills = new ArrayList<>();
    private double avgSkill;
    private double avgRating;
//Created by S1ft 2024

    public Team(Player player1, Player player2, Player player3, Player player4, Player player5) {
        this.player1 = player1;
        this.player2 = player2;
        this.player3 = player3;
        this.player4 = player4;
        this.player5 = player5;
        this.player1ELO = player1.getRating();
        this.player2ELO = player2.getRating();
        this.player3ELO = player3.getRating();
        this.player4ELO = player4.getRating();
        this.player5ELO = player5.getRating();
        this.skills.add(player1.getSkill());
        this.skills.add(player2.getSkill());
        this.skills.add(player3.getSkill());
        this.skills.add(player4.getSkill());
        this.skills.add(player5.getSkill());
        Collections.sort(skills);
        this.avgSkill = (player1.getSkill()+player2.getSkill()+player3.getSkill()+player4.getSkill()+player5.getSkill())/5;
        this.avgRating = (player1.getRating() + player2.getRating() + player3.getRating() + player4.getRating() + player5.getRating()) / 5.0;
        this.team = new Player[]{player1, player2, player3, player4, player5};
    }

    public double getAvgSkill() {
        return avgSkill;
    }

    public double getAvgRating() {
        return avgRating;
    }

    public Player[] getTeam()
    {
        return team;
    }

    public double getMedianSkillPlayer()
    {
        return skills.get(2);
    }

    public int getPlayer1ELO() {
        return player1ELO;
    }

    public int getPlayer2ELO() {
        return player2ELO;
    }

    public int getPlayer3ELO() {
        return player3ELO;
    }

    public int getPlayer4ELO() {
        return player4ELO;
    }

    public int getPlayer5ELO() {
        return player5ELO;
    }

    public String getNames()
    {
        return String.format("%s,%s,%s,%s,%s",player1.getName(),player2.getName(),player3.getName(),player4.getName(),player5.getName());
    }
}
