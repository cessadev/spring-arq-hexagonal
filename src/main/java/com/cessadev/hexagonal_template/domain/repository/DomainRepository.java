package com.cessadev.hexagonal_template.domain.repository;

/**
 * Output port (methods) injected by the domain services or a use case to interact with the database.
 *
 * Their implementation goes in `infrastructure.persistence.domain`.
 *
 * Example: CustomerRepository
 * - void save(Customer customer);
 * - Optional<Customer> findById(String id);
 */
public interface DomainRepository {
}
