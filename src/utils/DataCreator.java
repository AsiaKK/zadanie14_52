package utils;

import domain.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DataCreator {

    public List<Player> getPlayersFromUser() {
        List<Player> players = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        String input = null;
        while (!"stop".equals(input)) {
            System.out.println("Podaj gracza i jego wynik (lub stop) ");
            input = scan.nextLine();
            if (!input.equals("stop")) {
                String[] playerValues = input.split(" ");
                Player newPlayer = new Player(playerValues[0], playerValues[1], Integer.valueOf(playerValues[2]));
                players.add(newPlayer);
            }
        }
        scan.close();
        return players;
    }
}