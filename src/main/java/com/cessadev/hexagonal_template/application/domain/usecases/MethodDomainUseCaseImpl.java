package com.cessadev.hexagonal_template.application.domain.usecases;

import com.cessadev.hexagonal_template.application.domain.ports.in.MethodDomainUseCase;
import com.cessadev.hexagonal_template.application.domain.ports.out.EmailServicePort;
import com.cessadev.hexagonal_template.domain.repository.DomainRepository;
import org.springframework.stereotype.Service;

/**
 * Class that implements an input port.
 * Injects the outgoing ports corresponding to the services or repositories needed to access
 * implementations or the database, respectively.
 *
 * Nomenclature: [Method][Domain]UseCaseImpl
 * Example:
 * - GetCustomerUseCaseImpl
 * - CreateCustomerUseCaseImpl
 *
 * The input ports are defined in `application.domain.ports.in`.
 * The outgoing ports are defined in `application.domain.ports.out` and `domain.repository`
 */
@Service
public class MethodDomainUseCaseImpl implements MethodDomainUseCase {

  private final DomainRepository domainRepository;
  private final EmailServicePort emailServicePort;

  public MethodDomainUseCaseImpl(DomainRepository domainRepository, EmailServicePort emailServicePort) {
    this.domainRepository = domainRepository;
    this.emailServicePort = emailServicePort;
  }
}
