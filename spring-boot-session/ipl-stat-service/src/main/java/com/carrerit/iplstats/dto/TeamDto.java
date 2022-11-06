package com.carrerit.iplstats.dto;

import lombok.Data;

import java.util.List;

@Data
public class TeamDto extends  AuditorLogDto {

  private String teamLabel;
  private String teamName;
  private String homeGround;
  private String city;
  private String coach;
  private String captain;
  private int debut;
  private List<PlayerDto> players;
}
