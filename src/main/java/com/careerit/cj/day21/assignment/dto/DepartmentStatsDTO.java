package com.careerit.cj.day21.assignment.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class DepartmentStatsDTO {
  private String dname;
  private long count;
  private double maxSalary;
  private double minSalary;
  private double avgSalary;
  private double totalSalary;
}
