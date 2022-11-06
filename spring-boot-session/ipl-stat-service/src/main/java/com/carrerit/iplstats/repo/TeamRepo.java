package com.carrerit.iplstats.repo;

import com.carrerit.iplstats.domain.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepo extends JpaRepository<Team,String> {
}
