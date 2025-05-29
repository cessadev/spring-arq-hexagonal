package com.cessadev.hexagonal_template.application.domain.usecases;

import com.cessadev.hexagonal_template.application.domain.ports.in.MethodDomainUseCase;
import com.cessadev.hexagonal_template.application.domain.ports.out.EmailServicePort;
import com.cessadev.hexagonal_template.domain.repository.DomainRepository;
import org.springframework.stereotype.Service;

/**
 * <p>Use case that implements an input port.</p>
 *
 * <p>Injects the outgoing ports corresponding to the services or repositories needed to access adapters or the database, respectively.
 * You can also use domain services according to the logic.</p>
 *
 * <p>
 * Nomenclature: [Method][Domain]UseCaseImpl -
 * Example:
 * {@code
 *   GetCustomerUseCaseImpl
 * }
 * </p>
 *
 * <p>The input ports are defined in `application.domain.ports.in`.</p>
 *
 * <p>The outgoing ports are defined in `application.domain.ports.out` and `domain.repository`.</p>
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
