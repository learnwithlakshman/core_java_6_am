package com.carrerit.iplstats;

import com.carrerit.iplstats.domain.Player;
import com.carrerit.iplstats.dto.PlayerDto;
import com.carrerit.iplstats.repo.PlayerRepo;
import com.carrerit.iplstats.util.IplstatUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

@SpringBootApplication
@Slf4j
public class IplstatApplication implements CommandLineRunner {
  @Autowired
  private PlayerRepo playerRepo;
  public static void main(String[] args) {
    SpringApplication.run(IplstatApplication.class,args);
  }

  @Override
  public void run(String... args) {
    Page<Player> page = playerRepo.findByAllPlayerOfGivenTeam("CSK", PageRequest.of(1, 10));
    page.stream().map(e-> IplstatUtil.toDto(e, PlayerDto.class)).forEach(p-> log.info("{}",p));
  }
}
