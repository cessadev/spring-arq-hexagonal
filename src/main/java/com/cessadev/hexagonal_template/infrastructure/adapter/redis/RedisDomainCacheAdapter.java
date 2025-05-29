package com.cessadev.hexagonal_template.infrastructure.adapter.redis;

import com.cessadev.hexagonal_template.application.domain.ports.out.DomainCachingPort;
import org.springframework.stereotype.Component;

/**
 * <p>Implementation class (adapter) of the internal technical integration with Redis for caching.</p>
 */
@Component
public class RedisDomainCacheAdapter implements DomainCachingPort {
}
