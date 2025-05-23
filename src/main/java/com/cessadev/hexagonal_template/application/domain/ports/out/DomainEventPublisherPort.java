package com.cessadev.hexagonal_template.application.domain.ports.out;

/**
 * Output ports representing an internal technical integration, such as a
 * data streaming technology like Apache Kafka.
 *
 * Its implementation goes in `infrastructure.adapter`.
 */
public interface DomainEventPublisherPort {
}
