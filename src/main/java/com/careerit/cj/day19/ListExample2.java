package com.careerit.cj.day19;

import com.careerit.cj.day17.playerstat.domain.Player;
import com.careerit.cj.day17.playerstat.util.CsvReaderUtil;
import org.apache.commons.collections4.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

public class ListExample2 {
  public static void main(String[] args) {

    List<Player> list = CsvReaderUtil.loadPlayersFromFile();
    List<String> names = getPlayerNames(list);
    List<Player> players = getPlayers(list,List.of("CSK","RCB","MI"));

  }

  private static  List<Player> getPlayers(List<Player> list,List<String> teamNames) {
    List<Player> teamList = new ArrayList<>();
    if (!CollectionUtils.isEmpty(list)) {
      for (Player player : list) {
        if(teamNames.contains(player.getTeamLabel())){
          teamList.add(player);
        }
      }
      return teamList;
    }
    throw new IllegalArgumentException("The given list is either null or empty");

  }

  public static List<Player> getPlayers(List<Player> list, String teamLabel) {
    List<Player> teamList = new ArrayList<>();
    if (!CollectionUtils.isEmpty(list)) {
      for (Player player : list) {
          if(player.getTeamLabel().equalsIgnoreCase(teamLabel)){
              teamList.add(player);
          }
      }
      return teamList;
    }
    throw new IllegalArgumentException("The given list is either null or empty");
  }

  public static List<String> getPlayerNames(List<Player> list) {
    List<String> namesList = new ArrayList<>();
    if (!CollectionUtils.isEmpty(list)) {
      for (Player player : list) {
        namesList.add(player.getName());
      }
      return namesList;
    }
    throw new IllegalArgumentException("The given list is either null or empty");
  }
}
