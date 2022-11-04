package com.carrerit.iplstats.service;

import com.carrerit.iplstats.domain.Player;
import com.carrerit.iplstats.dto.PlayerDto;
import com.carrerit.iplstats.repo.PlayerRepo;
import com.carrerit.iplstats.util.IplstatUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;

@Service
@Slf4j
public class PlayerServiceImpl implements  PlayerService {

  private final PlayerRepo playerRepo;

  @Autowired
  public PlayerServiceImpl(PlayerRepo playerRepo) {
    this.playerRepo = playerRepo;
  }

  @Override
  public PlayerDto addPlayer(PlayerDto playerDto) {
    Assert.notNull(playerDto,"Player object can't be null");
    Player player = IplstatUtil.toDomain(playerDto,Player.class);
    player=playerRepo.save(player);
    playerDto = IplstatUtil.toDto(player, PlayerDto.class);
    log.info("Player is added with id :{}",playerDto.getId());
    return playerDto;
  }

  @Override
  public Page<PlayerDto> getPlayers() {
    List<Player> list = playerRepo.findAll();
    return null;
  }

  @Override
  public Page<PlayerDto> search(String str) {
    return null;
  }

  @Override
  public boolean deletePlayer(long id) {
    return false;
  }

  @Override
  public PlayerDto getPlayerById(long id) {
    return null;
  }

  @Override
  public PlayerDto updatePlayer(PlayerDto playerDto) {
    return null;
  }

  @Override
  public Page<PlayerDto> getPlayerByTeamLabel(String teamLabel) {
    return null;
  }

  @Override
  public List<PlayerDto> addPlayers(List<PlayerDto> list) {
    return null;
  }
}
