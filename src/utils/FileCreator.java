package utils;

import domain.Player;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileCreator {

    public void writeToFile(String fileName, List<Player> players) throws IOException {
        FileWriter fileWriter = new FileWriter(fileName);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        for (Player player : players) {
            bufferedWriter.write(player.getCsvFormat());
            bufferedWriter.newLine();
        }
        bufferedWriter.close();

    }
}