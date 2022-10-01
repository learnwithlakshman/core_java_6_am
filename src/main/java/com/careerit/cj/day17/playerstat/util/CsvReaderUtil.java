package com.careerit.cj.day17.playerstat.util;

import com.careerit.cj.day17.playerstat.domain.Player;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public final class CsvReaderUtil {

    private static final String fileName = "/playerdata.csv";

    private CsvReaderUtil() {
    }

    public static List<Player> loadPlayersFromFile() {
        List<Player> playerList = new ArrayList<>();
        try {
            List<String> lines = Files.readAllLines(Path.of(CsvReaderUtil.class.getResource(fileName).toURI()));
            for (int i = 1; i < lines.size(); i++) {
                String data = lines.get(i);
                String[] arr = data.split(",");
                String name = arr[0];
                String role = arr[1];
                double amount = Double.parseDouble(arr[2]);
                String country = arr[3];
                String teamLabel = arr[4];
                Player player = new Player(name,role,amount,country,teamLabel);
                playerList.add(player);
            }
        } catch (Exception e) {
            System.out.println("While reading the file :" + e);
        }
        return playerList;
    }

}
