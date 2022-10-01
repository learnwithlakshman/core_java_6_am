package com.careerit.cj.day17.playerstat.domain;

import lombok.*;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Player {
    private String name;
    private String role;
    private double amount;
    private String country;
    private String teamLabel;
}
