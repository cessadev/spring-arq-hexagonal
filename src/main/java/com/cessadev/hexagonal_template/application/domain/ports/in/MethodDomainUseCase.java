package com.cessadev.hexagonal_template.application.domain.ports.in;

/**
 * <p>Input ports (methods) are defined to interact with the services or database.
 * This port must be implemented in a use case.</p>
 *
 * <p>
 * Nomenclature: [Method][Domain]UseCase -
 * Example:
 * {@code
 *   GetCustomerUseCase
 * }
 * </p>
 *
 * <p>Their implementation goes in `application.domain.usecases`.</p>
 */
public interface MethodDomainUseCase {
}
