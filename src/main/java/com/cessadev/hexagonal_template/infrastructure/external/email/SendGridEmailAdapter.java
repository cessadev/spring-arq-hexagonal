package com.cessadev.hexagonal_template.infrastructure.external.email;

import com.cessadev.hexagonal_template.application.domain.ports.out.EmailServicePort;
import org.springframework.stereotype.Component;

/**
 * <p>Implementation class (adapter) corresponding to the `EmailServicePort` outgoing port.</p>
 *
 * <p>Integration with a mailing service such as SendGrid.</p>
 */
@Component
public class SendGridEmailAdapter implements EmailServicePort {
}
