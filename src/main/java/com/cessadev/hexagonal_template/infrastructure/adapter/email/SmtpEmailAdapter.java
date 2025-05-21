package com.cessadev.hexagonal_template.infrastructure.adapter.email;

import com.cessadev.hexagonal_template.application.domain.ports.out.EmailServicePort;
import org.springframework.stereotype.Component;

/**
 * Implementation class (adapter) corresponding to the `EmailServicePort` outgoing port.
 */
@Component
public class SmtpEmailAdapter implements EmailServicePort {
}
