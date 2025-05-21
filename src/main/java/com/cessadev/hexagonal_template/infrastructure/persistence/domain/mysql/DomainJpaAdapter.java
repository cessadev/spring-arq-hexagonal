package com.cessadev.hexagonal_template.infrastructure.persistence.domain.mysql;

import com.cessadev.hexagonal_template.domain.repository.DomainRepository;
import org.springframework.stereotype.Component;

@Component
public class DomainJpaAdapter implements DomainRepository {

  private final DomainJpaRepository domainJpaRepository;

  public DomainJpaAdapter(DomainJpaRepository domainJpaRepository) {
    this.domainJpaRepository = domainJpaRepository;
  }
}
