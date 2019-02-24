import domain.Player;
import utils.DataCreator;
import utils.FileCreator;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        DataCreator dataCreator = new DataCreator();
        FileCreator fileCreator = new FileCreator();

        List<Player> players = dataCreator.getPlayersFromUser();

        Collections.sort(players);

        fileCreator.writeToFile("stats.csv", players);
    }

}