package com.careerit.cj.day20;

import lombok.*;

import java.util.StringJoiner;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
class Player {

  private String name;
  private String country;
  private String teamLabel;
  private String role;


  @Override
  public String toString() {
    return new StringJoiner(", ", Player.class.getSimpleName() + "[", "]")
        .add("name='" + name + "'")
        .add("country='" + country + "'")
        .add("teamLabel='" + teamLabel + "'")
        .add("role='" + role + "'")
        .toString();
  }
}

public class Manager {
  public static void main(String[] args) {
    Player player = Player.builder()
        .name("Rahul")
        .role("Batsman")
        .teamLabel("RCB")
        .country("India").build();
    System.out.println(player);
  }
}
