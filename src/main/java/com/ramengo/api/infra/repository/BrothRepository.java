package com.ramengo.api.infra.repository;

import com.ramengo.api.infra.entities.BrothEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrothRepository extends JpaRepository<BrothEntity,Long> {
}
