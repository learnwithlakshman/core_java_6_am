package com.carrerit.iplstats.repo;

import com.carrerit.iplstats.domain.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepo extends JpaRepository<Player,Long> {
}
