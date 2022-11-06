package com.carrerit.iplstats.service;

import com.carrerit.iplstats.domain.Team;
import com.carrerit.iplstats.dto.TeamDto;
import com.carrerit.iplstats.repo.TeamRepo;
import com.carrerit.iplstats.util.IplstatUtil;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class TeamServiceImpl implements  TeamService {

  private final TeamRepo teamRepo;

  @Override
  public TeamDto addTeam(TeamDto teamDto) {
    Team team = IplstatUtil.toDomain(teamDto,Team.class);
    team = teamRepo.save(team);
    teamDto = IplstatUtil.toDto(team,TeamDto.class);
    log.info("Team saved with label :{}",team.getTeamLabel());
    return teamDto;
  }

  @Override
  public TeamDto getTeam(String teamLabel) {
    Optional<Team> optTeam = teamRepo.findById(teamLabel);
    if(optTeam.isPresent()){
          Team team = optTeam.get();
          TeamDto teamDto = IplstatUtil.toDto(team,TeamDto.class);
          return teamDto;
    }
    throw new IllegalArgumentException("Invalid team label is provided");
  }
}
