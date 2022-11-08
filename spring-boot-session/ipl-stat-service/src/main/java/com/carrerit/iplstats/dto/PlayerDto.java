package com.carrerit.iplstats.dto;

import lombok.Data;

@Data
public class PlayerDto extends AuditorDto {
  private Long id;
  private String name;
  private String role;
  private double amount;
  private String country;
  private String teamLabel;

}
