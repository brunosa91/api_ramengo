package com.ramengo.api.infra.repository;

import com.ramengo.api.infra.entities.ProteinsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProteinsRepository extends JpaRepository<ProteinsEntity, Long> {
}
