package com.cessadev.hexagonal_template.application.domain.ports.out;

/**
 * It's used when the domain or a use case needs to interact with something external.
 *
 * Example: send an email to a user who has just registered.
 *
 * Its implementation goes in `infrastructure.external`.
 */
public interface EmailServicePort {
}
