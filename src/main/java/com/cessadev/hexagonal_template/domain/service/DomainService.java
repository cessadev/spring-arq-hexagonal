package com.cessadev.hexagonal_template.domain.service;

/**
 *These are domain services, not application services.
 * They are used when there is logic that involves multiple
 * entities or aggregates, and does not belong to any of them directly.
 *
 * Example: OrderService
 *
 * public boolean isOrderValid(Order order, Inventory inventory) {
 *    return inventory.hasEnoughStockFor(order.getItems());
 * }
 *
 * public BigDecimal calculateTotalPrice(Order order, PricingRules rules) {
 *    return rules.applyDiscounts(order.getItems());
 * }
 *
 * This service can be used from a use case or from another domain service.
 */
public class DomainService {
}
