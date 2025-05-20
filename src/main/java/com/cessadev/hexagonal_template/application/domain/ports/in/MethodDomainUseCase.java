package com.cessadev.hexagonal_template.application.domain.ports.in;

/**
 * Input ports (methods) are defined to interact with the services or database.
 * This port must be implemented in a use case.
 *
 * Nomenclature: [Method][Domain]UseCase
 * - GetCustomerUseCase
 * - CreateCustomerUseCase
 *
 * Their implementation goes in `application.domain.usecases`.
 */
public interface MethodDomainUseCase {
}
