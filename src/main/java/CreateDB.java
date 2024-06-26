import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateDB {
    static final String DB_URL = "jdbc:mysql://localhost/";
    static final String DB_URL2 = "jdbc:mysql://localhost/PLAYERS";
    static final String USER = "root";
    static final String PASS = "guest123";

    public static void main(String[] args) {
        // Open a connection
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             Statement stmt = conn.createStatement();
        ) {
            String sql = "CREATE DATABASE IF NOT EXISTS PLAYERS";
            stmt.executeUpdate(sql);
            System.out.println("Database created successfully...");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try (Connection conn = DriverManager.getConnection(DB_URL2, USER, PASS);
             Statement stmt = conn.createStatement();
        ) {
        String sqlT1 = "CREATE TABLE IF NOT EXISTS playerlist (id VARCHAR(32) PRIMARY KEY, name VARCHAR(255), skill FLOAT, rating FLOAT, volatility FLOAT, confidence FLOAT, games_won INT, games_played INT, history TEXT)";

        stmt.executeUpdate(sqlT1);
        System.out.println("Created playerlist in MMSIM...");
        String sqlT2 = "CREATE TABLE IF NOT EXISTS games (game_id VARCHAR(32) PRIMARY KEY, winning_team TEXT, losing_team TEXT)";

        stmt.executeUpdate(sqlT2);
        System.out.println("Created games in MMSIM...");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try (Connection conn = DriverManager.getConnection(DB_URL2, USER, PASS);
             Statement stmt = conn.createStatement();
        ) {
            String sqlT1 = "CREATE TABLE IF NOT EXISTS playerlistPersonal (id VARCHAR(32) PRIMARY KEY, name VARCHAR(255), skill FLOAT, rating FLOAT, volatility FLOAT, confidence FLOAT, games_won INT, games_played INT, history TEXT)";

            stmt.executeUpdate(sqlT1);
            System.out.println("Created playerlist in MMSIM...");
            String sqlT2 = "CREATE TABLE IF NOT EXISTS gamesPersonal (game_id VARCHAR(32) PRIMARY KEY, winning_team TEXT, losing_team TEXT)";

            stmt.executeUpdate(sqlT2);
            System.out.println("Created games in MMSIM...");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
