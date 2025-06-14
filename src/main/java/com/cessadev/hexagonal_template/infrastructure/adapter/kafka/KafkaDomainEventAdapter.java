package com.cessadev.hexagonal_template.infrastructure.adapter.kafka;

import com.cessadev.hexagonal_template.application.domain.ports.out.DomainEventPublisherPort;
import org.springframework.stereotype.Component;

/**
 * <p>Implementation class (adapter) of the internal technical integration with Apache Kafka.</p>
 */
@Component
public class KafkaDomainEventAdapter implements DomainEventPublisherPort {
}
