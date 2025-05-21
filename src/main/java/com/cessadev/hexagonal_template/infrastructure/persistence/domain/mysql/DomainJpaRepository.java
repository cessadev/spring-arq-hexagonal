package com.cessadev.hexagonal_template.infrastructure.persistence.domain.mysql;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface DomainJpaRepository extends JpaRepository<DomainJpaEntity, UUID> {
}
