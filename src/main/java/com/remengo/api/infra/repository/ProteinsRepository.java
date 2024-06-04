package com.remengo.api.infra.repository;

import com.remengo.api.infra.entities.ProteinsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProteinsRepository extends JpaRepository<ProteinsEntity, Long> {
}
