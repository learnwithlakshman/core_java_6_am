package com.careerit.cj.day21.assignment.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@ToString
public class Employee {
  private long id;
  private String name;
  private double salary;
  private LocalDate doj;
  private int deptno;
}
