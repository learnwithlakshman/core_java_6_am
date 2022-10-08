package com.careerit.cj.day20;

import com.careerit.cj.day17.playerstat.domain.Player;
import com.careerit.cj.day17.playerstat.util.CsvReaderUtil;
import org.apache.commons.collections4.CollectionUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ListExample2 {
  public static void main(String[] args) {

    List<Player> list = CsvReaderUtil.loadPlayersFromFile();
    List<String> names = getPlayerNames(list);
    List<Player> players = getPlayers(list, List.of("CSK", "RCB", "MI"));

  }

  private static List<Player> getPlayers(List<Player> list, List<String> teamNames) {
    if (!CollectionUtils.isEmpty(list)) {
      return list.stream()
          .filter(ele -> teamNames.contains(ele.getTeamLabel()))
          .collect(Collectors.toList());
    }
    throw new IllegalArgumentException("The given list is either null or empty");

  }

  public static List<Player> getPlayers(List<Player> list, String teamLabel) {

    if (!CollectionUtils.isEmpty(list)) {
      return list.stream()
          .filter(ele -> ele.getTeamLabel().equalsIgnoreCase(teamLabel))
          .collect(Collectors.toList());
    }
    throw new IllegalArgumentException("The given list is either null or empty");
  }

  public static List<String> getPlayerNames(List<Player> list) {
//    List<String> namesList = new ArrayList<>();
//    if (!CollectionUtils.isEmpty(list)) {
//      for (Player player : list) {
//        namesList.add(player.getName());
//      }
//      return namesList;
//    }
//    throw new IllegalArgumentException("The given list is either null or empty");
    if (!CollectionUtils.isEmpty(list)) {
      return list.stream()
          .map(player -> player.getName())
          .collect(Collectors.toList());
    }
    throw new IllegalArgumentException("The given list is either null or empty");
  }

  public static Set<String> getTeamNames(List<Player> list) {
    return list.stream().map(player -> player.getTeamLabel()).collect(Collectors.toSet());
  }

  public static List<PlayerDTO> getPlayerMinInformation(List<Player> list) {
//    List<PlayerDTO> playerList = new ArrayList<>();
//    for (Player player : list) {
//      PlayerDTO obj = getPlayerDTO(player);
//      playerList.add(obj);
//    }
//    return playerList;
    return list.stream().map(player -> getPlayerDTO(player)).collect(Collectors.toList());
  }

  private static PlayerDTO getPlayerDTO(Player player) {
    PlayerDTO obj = PlayerDTO.builder().name(player.getName())
        .role(player.getRole()).teamLabel(player.getTeamLabel()).build();
    return obj;
  }
}
