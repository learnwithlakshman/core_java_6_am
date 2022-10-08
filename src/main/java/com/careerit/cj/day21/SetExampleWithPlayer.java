package com.careerit.cj.day21;

import com.careerit.cj.day17.playerstat.domain.Player;
import com.careerit.cj.day17.playerstat.util.CsvReaderUtil;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SetExampleWithPlayer {
  public static void main(String[] args) {
    List<Player> playerList = CsvReaderUtil.loadPlayersFromFile();
    // Team names
    // All roles
    // Country names
    Set<String> teamNames = playerList.stream().map(p -> p.getTeamLabel()).collect(Collectors.toSet());
    System.out.println(teamNames);
    Set<String> roleNames = playerList.stream().map(p->p.getRole()).collect(Collectors.toSet());
    System.out.println(roleNames);
    Set<String> countryNames = playerList.stream().map(p->p.getCountry()).collect(Collectors.toSet());
    System.out.println(countryNames);
  }
}
