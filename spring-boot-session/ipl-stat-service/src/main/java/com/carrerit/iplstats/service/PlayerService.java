package com.carrerit.iplstats.service;

import com.carrerit.iplstats.dto.PlayerDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface PlayerService {

        PlayerDto addPlayer(PlayerDto playerDto);
        Page<PlayerDto> getPlayers(Pageable pageable);
        Page<PlayerDto> search(String str,Pageable pageable);
        boolean deletePlayer(long id);
        PlayerDto getPlayerById(long id);
        PlayerDto updatePlayer(PlayerDto playerDto);
        Page<PlayerDto> getPlayerByTeamLabel(String teamLabel,Pageable pageable);
        List<PlayerDto> addPlayers(List<PlayerDto> list);
        void sendPlayerDataAsEmail(String toEmail);
}
