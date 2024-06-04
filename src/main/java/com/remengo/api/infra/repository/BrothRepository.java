package com.remengo.api.infra.repository;

import com.remengo.api.infra.entities.BrothEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrothRepository extends JpaRepository<BrothEntity,Long> {
}
