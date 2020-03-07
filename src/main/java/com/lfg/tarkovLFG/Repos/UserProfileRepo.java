package com.lfg.tarkovLFG.Repos;

import com.lfg.tarkovLFG.Models.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserProfileRepo extends JpaRepository<UserProfile,Long> {
}
