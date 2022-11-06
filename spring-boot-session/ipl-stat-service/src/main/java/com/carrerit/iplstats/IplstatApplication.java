package com.carrerit.iplstats;

import com.carrerit.iplstats.domain.Player;
import com.carrerit.iplstats.dto.PlayerDto;
import com.carrerit.iplstats.repo.PlayerRepo;
import com.carrerit.iplstats.util.IplstatUtil;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class IplstatApplication implements CommandLineRunner {
  static{
    ObjectMapper objectMapper = new ObjectMapper();
    objectMapper.registerModule( new JavaTimeModule());
  }
  @Autowired
  private PlayerRepo playerRepo;
  public static void main(String[] args) {
    SpringApplication.run(IplstatApplication.class,args);
  }

  @Override
  public void run(String... args) {

  }
}
