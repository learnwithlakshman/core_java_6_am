package com.carrerit.iplstats.config;

import org.springframework.data.domain.AuditorAware;

import java.util.List;
import java.util.Optional;

public class AuditorAwareImpl implements AuditorAware<String> {

  private List<String> users = List.of("Krish","Manoj");
  private boolean flag = false;

  @Override
  public Optional<String> getCurrentAuditor() {
    flag = !flag;
    return Optional.of(flag?users.get(0):users.get(1));
  }
}
