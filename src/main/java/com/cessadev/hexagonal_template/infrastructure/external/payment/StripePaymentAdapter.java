package com.cessadev.hexagonal_template.infrastructure.external.payment;

import com.cessadev.hexagonal_template.application.domain.ports.out.PaymentGatewayPort;
import org.springframework.stereotype.Component;

/**
 * <p>Implementation class (adapter) corresponding to the `PaymentGatewayPort` outgoing port.</p>
 *
 * <p>Stripe is an online payment platform that allows businesses to accept payments from customers around the world.</p>
 */
@Component
public class StripePaymentAdapter implements PaymentGatewayPort {
}
