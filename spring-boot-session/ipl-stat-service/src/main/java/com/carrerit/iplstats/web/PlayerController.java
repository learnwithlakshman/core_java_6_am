package com.carrerit.iplstats.web;
import com.carrerit.iplstats.dto.PlayerDto;
import com.carrerit.iplstats.service.PlayerService;
import com.carrerit.iplstats.util.AppResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/player")
public class PlayerController {
  @Autowired
  private PlayerService playerService;

  @PostMapping
  public ResponseEntity<PlayerDto> addPlayer(@RequestBody PlayerDto playerDto) {
        return ResponseEntity.ok(playerService.addPlayer(playerDto));
  }

  @PostMapping("/addall")
  public ResponseEntity<List<PlayerDto>> addPlayer(@RequestBody List<PlayerDto> playerDtoList) {
    return ResponseEntity.ok(playerService.addPlayers(playerDtoList));
  }

  @GetMapping("/list")
  public ResponseEntity<Page<PlayerDto>> getPlayers(Pageable pageable){
      return ResponseEntity.ok(playerService.getPlayers(pageable));
  }
  @GetMapping("/team/{teamLabel}")
  public ResponseEntity<Page<PlayerDto>> getPlayersByTeamLabel(@PathVariable("teamLabel") String teamLabel, Pageable pageable){
      return ResponseEntity.ok(playerService.getPlayerByTeamLabel(teamLabel,pageable));
  }

  @GetMapping("/search/{str}")
  public ResponseEntity<Page<PlayerDto>> search(@PathVariable("str") String str, Pageable pageable){
    return ResponseEntity.ok(playerService.search(str,pageable));
  }

  @GetMapping("/{id}")
  public ResponseEntity<PlayerDto> getPlayer(@PathVariable("id")Long id) {
    return ResponseEntity.ok(playerService.getPlayerById(id));
  }
  @PutMapping
  public ResponseEntity<PlayerDto> updatePlayer(@RequestBody PlayerDto playerDto) {
    return ResponseEntity.ok(playerService.updatePlayer(playerDto));
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<AppResponse> deletePlayer(@PathVariable("id")Long id) {
    boolean isDeleted=playerService.deletePlayer(id);
    AppResponse app = new AppResponse();
    if(isDeleted){
        app.setMessage("Player is deleted successfully");
    }else{
      app.setMessage("Player couldn't deleted");
    }
    return ResponseEntity.ok(app);
  }


}
