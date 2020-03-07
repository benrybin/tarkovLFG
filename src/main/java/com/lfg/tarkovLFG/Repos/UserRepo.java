package com.lfg.tarkovLFG.Repos;

import com.lfg.tarkovLFG.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User,Long> {
}
