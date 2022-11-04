package com.carrerit.iplstats.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity(name = "player")
public class Player {
  @Id
  @Column(name = "id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @Column(name = "name")
  private String name;
  @Column(name = "role")
  private String role;
  @Column(name = "amount")
  private double amount;
  @Column(name = "country")
  private String country;
  @Column(name = "team_label")
  private String teamLabel;
}
