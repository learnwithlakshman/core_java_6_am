package com.carrerit.iplstats.repo;

import com.carrerit.iplstats.domain.Player;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PlayerRepo extends JpaRepository<Player,Long> {
  Page<Player> findByTeamLabel(String teamLabel, Pageable pageable);

  Page<Player> findByNameContainingIgnoreCase(String name, Pageable pageable);

  @Query(
      value = "select * from player where team_label=?1",
      countQuery = "select count(*) from player where team_label=?1",
      nativeQuery = true
  )
  Page<Player> findByAllPlayerOfGivenTeam(String teamName,Pageable page);
}
