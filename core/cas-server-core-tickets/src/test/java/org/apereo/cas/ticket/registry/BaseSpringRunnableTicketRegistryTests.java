package org.apereo.cas.ticket.registry;

import org.apereo.cas.util.junit.ConditionalIgnoreRule;

import org.junit.Rule;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;

/**
 * @author Scott Battaglia
 * @since 3.0.0
 */
@ExtendWith(SpringExtension.class)
public abstract class BaseSpringRunnableTicketRegistryTests extends BaseTicketRegistryTests {

    @Rule
    public final ConditionalIgnoreRule conditionalIgnoreRule = new ConditionalIgnoreRule();

    public BaseSpringRunnableTicketRegistryTests(final boolean useEncryption) {
        super(useEncryption);
    }
}
