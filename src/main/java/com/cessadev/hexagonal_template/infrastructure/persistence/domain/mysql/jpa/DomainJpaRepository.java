package com.cessadev.hexagonal_template.infrastructure.persistence.domain.mysql.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

/**
 * <p>Repository that extends Java Persistence API (JPA) to inherit its methods and interact with the database.</p>
 *
 * <p>This repository must be injected into a persistence adapter.</p>
 */
@Repository
public interface DomainJpaRepository extends JpaRepository<DomainJpaEntity, UUID> {
}
