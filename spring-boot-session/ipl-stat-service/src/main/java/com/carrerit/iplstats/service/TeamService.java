package com.carrerit.iplstats.service;

import com.carrerit.iplstats.dto.TeamDto;

public interface TeamService {

        public TeamDto addTeam(TeamDto teamDto);
        public TeamDto getTeam(String teamLabel);
}
