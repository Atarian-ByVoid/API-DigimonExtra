package com.planotatico.digimonextra.digimon.digimon_repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.planotatico.digimonextra.digimon.domain.Digimon;

public interface DigimonRepository extends JpaRepository<Digimon, Long> {

}
