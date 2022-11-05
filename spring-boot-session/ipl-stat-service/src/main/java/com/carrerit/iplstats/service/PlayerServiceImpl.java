package com.carrerit.iplstats.service;

import com.carrerit.iplstats.domain.Player;
import com.carrerit.iplstats.dto.PlayerDto;
import com.carrerit.iplstats.exception.PlayerNotFoundException;
import com.carrerit.iplstats.repo.PlayerRepo;
import com.carrerit.iplstats.util.IplstatUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Slf4j
public class PlayerServiceImpl implements PlayerService {

  public static final String PLAYER_WITH_ID_S_IS_NOT_FOUND = "Player with id %s is not found";
  private final PlayerRepo playerRepo;

  @Autowired
  public PlayerServiceImpl(PlayerRepo playerRepo) {
    this.playerRepo = playerRepo;
  }

  @Override
  public List<PlayerDto> addPlayers(List<PlayerDto> playerDtoList) {
    Assert.notEmpty(playerDtoList, "Players object can't be null");
    List<Player> list = playerDtoList.stream().map(ele -> IplstatUtil.toDomain(ele, Player.class)).collect(Collectors.toList());
    list = playerRepo.saveAll(list);
    playerDtoList = list.stream().map(ele -> IplstatUtil.toDomain(ele, PlayerDto.class)).collect(Collectors.toList());
    log.info("Total {} players are added", playerDtoList.size());
    return playerDtoList;
  }

  @Override
  public PlayerDto addPlayer(PlayerDto playerDto) {
    Assert.notNull(playerDto, "Player object can't be null");
    Player player = IplstatUtil.toDomain(playerDto, Player.class);
    player = playerRepo.save(player);
    playerDto = IplstatUtil.toDto(player, PlayerDto.class);
    log.info("Player is added with id :{}", playerDto.getId());
    return playerDto;
  }

  @Override
  public Page<PlayerDto> getPlayers(Pageable pageable) {
    Page<PlayerDto> result = playerRepo.findAll(pageable).map(ele -> IplstatUtil.toDto(ele, PlayerDto.class));
    log.info("Count {}  Page {} and Pagesize {}", result.getTotalElements(), result.getNumber(), result.getSize());
    return result;
  }

  @Override
  public Page<PlayerDto> search(String str, Pageable pageable) {
    Page<Player> page = playerRepo.findByNameContainingIgnoreCase(str, pageable);
    return page.map(ele -> IplstatUtil.toDto(ele, PlayerDto.class));
  }

  @Override
  public boolean deletePlayer(long id) {
    Optional<Player> opt = playerRepo.findById(id);
    if (opt.isPresent()) {
      playerRepo.deleteById(id);
      return true;
    }
    throw new PlayerNotFoundException(String.format(PLAYER_WITH_ID_S_IS_NOT_FOUND,id));

  }

  @Override
  public PlayerDto getPlayerById(long id) {
    Optional<Player> opt = playerRepo.findById(id);
    return opt.map(ele -> IplstatUtil.toDto(ele, PlayerDto.class))
        .orElseThrow(() -> new PlayerNotFoundException(String.format(PLAYER_WITH_ID_S_IS_NOT_FOUND,id)));
  }

  @Override
  public PlayerDto updatePlayer(PlayerDto playerDto) {
    Assert.notNull(playerDto, "Player details can't null");
    Assert.notNull(playerDto.getId(), "Player id can't null");
    Long id = playerDto.getId();
    Optional<Player> opt = playerRepo.findById(id);
    if (opt.isPresent()) {
      Player player = playerRepo.save(IplstatUtil.toDomain(opt.get(), Player.class));
      return IplstatUtil.toDto(player, PlayerDto.class);
    }
    throw new PlayerNotFoundException(String.format(PLAYER_WITH_ID_S_IS_NOT_FOUND,id));

  }

  @Override
  public Page<PlayerDto> getPlayerByTeamLabel(String teamLabel, Pageable pageable) {
    Assert.notNull(teamLabel, "Team label can't be null or empty");
    Page<PlayerDto> players = playerRepo.findByTeamLabel(teamLabel, pageable).map(ele -> IplstatUtil.toDto(ele, PlayerDto.class));
    log.info("Team {} has {}", teamLabel, players.getTotalElements());
    return players;
  }

}
