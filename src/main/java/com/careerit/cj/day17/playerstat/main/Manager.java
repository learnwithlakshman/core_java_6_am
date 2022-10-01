package com.careerit.cj.day17.playerstat.main;

import com.careerit.cj.day17.playerstat.dto.TeamAmountDTO;
import com.careerit.cj.day17.playerstat.dto.TeamStatsDTO;
import com.careerit.cj.day17.playerstat.service.PlayerService;
import com.careerit.cj.day17.playerstat.service.PlayerServiceImpl;

import java.util.List;

public class Manager {
    public static void main(String[] args) {

        PlayerService service = new PlayerServiceImpl();
        double totalAmount = service.getTotalAmount();

        List<String> teamName = service.getTeamNames();
        System.out.println(teamName);

        TeamStatsDTO obj = service.getTeamStats("MI");
        System.out.println(obj);

        List<TeamAmountDTO> list = service.getTeamsAmountDetails();
        System.out.println(list);

    }
}
