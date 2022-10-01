package com.careerit.cj.day17.playerstat.service;

import com.careerit.cj.day17.playerstat.domain.Player;
import com.careerit.cj.day17.playerstat.dto.RoleStatsDTO;
import com.careerit.cj.day17.playerstat.dto.TeamAmountDTO;
import com.careerit.cj.day17.playerstat.dto.TeamStatsDTO;

import java.util.List;

public interface PlayerService {

        public double getTotalAmount();
        public List<String> getTeamNames();
        public TeamStatsDTO getTeamStats(String teamLabel);
        public List<Player> getMinPaidPlayers();
        public List<Player> getMaxPaidPlayers();

        public List<String> getRoles();
        public RoleStatsDTO getRoleStats(String role);
        public List<TeamAmountDTO> getTeamsAmountDetails();
        public List<RoleStatsDTO> getAllRoleStats();
}
