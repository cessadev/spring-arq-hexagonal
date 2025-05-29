package com.cessadev.hexagonal_template.domain.repository;

/**
 * <p>Output port (methods) injected by the domain services or a use case to interact with the database.</p>
 *
 * <p>Their implementation goes in `infrastructure.persistence.domain`.</p>
 *
 * <p>
 * Example: CustomerRepository -
 * {@code
 * Optional<Customer> findById(Long id);
 * }
 * </p>
 */
public interface DomainRepository {
}
