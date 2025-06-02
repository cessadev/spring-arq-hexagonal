package com.cessadev.hexagonal_template.infrastructure.persistence.domain.mysql.jpa;

import com.cessadev.hexagonal_template.domain.repository.DomainRepository;
import org.springframework.stereotype.Component;

/**
 *<p>Implementation class (adapter) of the output port corresponding to a domain repository.
 * This adapter acts as a bridge between the domain and the database.</p>
 *
 * <p>This adapter must inject the repository associated with the persistence methods, JPA or other definition.</p>
 */
@Component
public class DomainJpaAdapter implements DomainRepository {

  private final DomainJpaRepository domainJpaRepository;

  public DomainJpaAdapter(DomainJpaRepository domainJpaRepository) {
    this.domainJpaRepository = domainJpaRepository;
  }
}
