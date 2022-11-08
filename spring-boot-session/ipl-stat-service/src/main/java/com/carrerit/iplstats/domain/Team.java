package com.carrerit.iplstats.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
public class Team extends Auditable{
  @Id
  @Column(name="team_label")
  private String teamLabel;
  @Column(name="team_name")
  private String teamName;
  @Column(name="home_ground")
  private String homeGround;
  @Column(name="city")
  private String city;
  @Column(name="coach")
  private String coach;
  @Column(name="captain")
  private String captain;
  @Column(name="debut")
  private int debut;
  @OneToMany(cascade = CascadeType.ALL)
  @JoinColumn(name = "team_label",referencedColumnName = "team_label")
  private List<Player> players=new ArrayList<>();

}
