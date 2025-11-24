package com.media.noesis.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.media.noesis.entities.Clan;

@Repository
public interface ClanRepository extends JpaRepository<Clan, Long> {

    Optional<Clan> findByJoinCode(String joinCode);

}
