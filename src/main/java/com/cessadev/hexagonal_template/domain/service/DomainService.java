package com.cessadev.hexagonal_template.domain.service;

/**
 * <p>These are domain services, not application services (use cases).
 * A domain service is used when you have logic that does not belong to an entity or an aggregate, but is still a fundamental part of the business model.</p>
 *
 * <p>
 * Example: OrderService - Verify if an order is valid based on available inventory:
 * {@code
 * public boolean isOrderValid(Order order, Inventory inventory) {
 *    return inventory.hasEnoughStockFor(order.getItems());
 * }
 * }
 * </p>
 *
 * <p>A domain service is injected directly, it is not defined as an output port.</p>
 *
 * <p>This service can be used from a use case or from another domain service.</p>
 */
public class DomainService {
}
