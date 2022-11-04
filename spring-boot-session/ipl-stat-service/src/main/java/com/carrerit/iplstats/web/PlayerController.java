package com.carrerit.iplstats.web;

import com.carrerit.iplstats.dto.PlayerDto;
import com.carrerit.iplstats.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/player/")
public class PlayerController {
  @Autowired
  private PlayerService playerService;

  @PostMapping
  public ResponseEntity<PlayerDto> addPlayer(@RequestBody PlayerDto playerDto) {
        return ResponseEntity.ok(playerService.addPlayer(playerDto));
  }

}
