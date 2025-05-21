package com.cessadev.hexagonal_template.infrastructure.rest.v1.domain;

import com.cessadev.hexagonal_template.application.domain.ports.in.MethodDomainUseCase;
import com.cessadev.hexagonal_template.infrastructure.config.mapper.DomainMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/domains")
public class DomainController {

  private final MethodDomainUseCase methodDomainUseCase;
  private final DomainMapper domainMapper;

  public DomainController(MethodDomainUseCase methodDomainUseCase, DomainMapper domainMapper) {
    this.methodDomainUseCase = methodDomainUseCase;
    this.domainMapper = domainMapper;
  }
}
