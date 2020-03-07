package com.lfg.tarkovLFG.Repos;

import com.lfg.tarkovLFG.Models.JoinGroupRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JoinGroupRequestRepo extends JpaRepository<JoinGroupRequest,Long> {
}
