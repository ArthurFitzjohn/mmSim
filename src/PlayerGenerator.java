import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
//Created by S1ft 2024

public class PlayerGenerator {
    private Set<String> names = new HashSet<>();

    public void rngNameGen(int numNames)
    {
        names.clear();
        for(int i = 0; i < numNames; i++)
        {
            names.add(Integer.toString(i));
        }
    }

    public Set<Player> GeneratePlayers(int count)
    {
        Set<Player> playerList = new HashSet<>();

        double startingSkill = 0.01;

        int defaultELO = 1000;
        double defaultVolatility = 0.05;
        double defaultConfidence = 35.0;

        rngNameGen(count);

        for(String name: names)
        {
            Player p = new Player(name, startingSkill, defaultELO, defaultVolatility, defaultConfidence);
            playerList.add(p);
            startingSkill+= 0.01;
        }

        return playerList;
    }
}
