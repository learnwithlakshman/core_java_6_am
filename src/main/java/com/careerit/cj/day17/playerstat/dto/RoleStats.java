package com.careerit.cj.day17.playerstat.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class RoleStats {
    private String roleName;
    private int playerCount;
    private double totalAmount;
    private double maxAmount;
    private double minAmount;
    private double avgAmount;
}
