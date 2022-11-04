package com.carrerit.iplstats.service;

import com.carrerit.iplstats.domain.Player;
import com.carrerit.iplstats.dto.PlayerDto;
import org.springframework.data.domain.Page;

import java.util.List;

public interface PlayerService {

        PlayerDto addPlayer(PlayerDto playerDto);
        Page<PlayerDto> getPlayers();
        Page<PlayerDto> search(String str);
        boolean deletePlayer(long id);
        PlayerDto getPlayerById(long id);
        PlayerDto updatePlayer(PlayerDto playerDto);
        Page<PlayerDto> getPlayerByTeamLabel(String teamLabel);
        List<PlayerDto> addPlayers(List<PlayerDto> list);
}
