package com.careerit.cj.day17.playerstat.service;
import com.careerit.cj.day17.playerstat.domain.Player;
import com.careerit.cj.day17.playerstat.dto.RoleStatsDTO;
import com.careerit.cj.day17.playerstat.dto.TeamAmountDTO;
import com.careerit.cj.day17.playerstat.dto.TeamStatsDTO;
import com.careerit.cj.day17.playerstat.util.CsvReaderUtil;

import java.util.ArrayList;
import java.util.List;

public class PlayerServiceImpl implements PlayerService {

    private List<Player> playerList = CsvReaderUtil.loadPlayersFromFile();

    @Override
    public double getTotalAmount() {
        double totalAmount = 0;
        for (Player player : playerList) {
            totalAmount += player.getAmount();
        }
        return totalAmount;
    }

    @Override
    public List<String> getTeamNames() {
        List<String> teamNamesList = new ArrayList<>();
        for (Player player : playerList) {
            String teamLabel = player.getTeamLabel();
            if (!teamNamesList.contains(teamLabel)) {
                teamNamesList.add(teamLabel);
            }
        }
        return teamNamesList;
    }

    @Override
    public TeamStatsDTO getTeamStats(String teamLabel) {
        TeamStatsDTO teamStatsDTO = null;
        List<Player> teamPlayersList = getPlayerList(teamLabel);
        if (!teamPlayersList.isEmpty()) {
            teamStatsDTO = getTeamStatsDTO(teamLabel, teamPlayersList);
        } else {
            System.out.println("For the given team " + teamLabel + " there is no players, please check team name");
        }
        return teamStatsDTO;
    }

    @Override
    public List<Player> getMinPaidPlayers() {
        double minAmount = minAmount(playerList);
        List<Player> minPaidPlayerList = new ArrayList<>();
        for(Player player:playerList){
            if(player.getAmount()==minAmount){
                minPaidPlayerList.add(player);
            }
        }
        return minPaidPlayerList;
    }

    @Override
    public List<Player> getMaxPaidPlayers() {
         double maxAmount = maxAmount(playerList);
         List<Player> maxPaidPlayers = new ArrayList<>();
         for(Player player:playerList){
             if(player.getAmount() == maxAmount){
                 maxPaidPlayers.add(player);
             }
         }
         return maxPaidPlayers;
    }

    @Override
    public List<String> getRoles() {
        List<String> rolesList = new ArrayList<>();
        for(Player player:playerList){
            if(!rolesList.contains(player.getRole())){
                rolesList.add(player.getRole());
            }
        }
        return rolesList;
    }
    @Override
    public List<TeamAmountDTO> getTeamsAmountDetails() {
        List<TeamAmountDTO> teamAmountList = new ArrayList<>();
        List<String> teamNames = getTeamNames();
        for(String name:teamNames){
            List<Player> list = getPlayerList(name);
            double totalAmount = totalAmount(list);
            TeamAmountDTO obj = TeamAmountDTO.builder().teamName(name).totalAmount(totalAmount).build();
            teamAmountList.add(obj);
        }
        return teamAmountList;
    }

    @Override
    public List<RoleStatsDTO> getAllRoleStats() {
        return null;
    }

    @Override
    public RoleStatsDTO getRoleStats(String role) {
        return null;
    }

    private double maxAmount(List<Player> list){
        double max = list.get(0).getAmount();
        for(Player player:list){
            if(player.getAmount()>max){
                max = player.getAmount();
            }
        }
        return max;
    }
    private double minAmount(List<Player> list){
        double min = list.get(0).getAmount();
        for(Player player:list){
            if(player.getAmount()<min){
                min = player.getAmount();
            }
        }
        return min;
    }
    private double totalAmount(List<Player> list){
        double total = 0;
        for(Player player:list){
            total +=player.getAmount();
        }
        return total;
    }

    private TeamStatsDTO getTeamStatsDTO(String teamLabel, List<Player> teamPlayersList) {
        TeamStatsDTO teamStatsDTO;
        int count = teamPlayersList.size();
        double totalAmount = totalAmount(teamPlayersList);
        double maxAmount = maxAmount(teamPlayersList);
        double minAmount = minAmount(teamPlayersList);
        double avgAmount = totalAmount / count;
        teamStatsDTO = TeamStatsDTO.builder()
                .avgAmount(avgAmount)
                .maxAmount(maxAmount)
                .minAmount(minAmount)
                .teamLabel(teamLabel)
                .playerCount(count)
                .totalAmount(totalAmount)
                .build();
        return teamStatsDTO;
    }

    private List<Player> getPlayerList(String teamLabel) {
        List<Player> teamPlayersList = new ArrayList<>();
        for (Player player : playerList) {
            if (player.getTeamLabel().equalsIgnoreCase(teamLabel)) {
                teamPlayersList.add(player);
            }
        }
        return teamPlayersList;
    }
}
