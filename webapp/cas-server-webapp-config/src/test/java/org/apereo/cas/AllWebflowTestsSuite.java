package org.apereo.cas;

import org.junit.platform.suite.api.SelectClasses;

/**
 * This is {@link AllWebflowTestsSuite}.
 *
 * @author Misagh Moayyed
 * @since 5.3.0
 */
@SelectClasses({
    WiringConfigurationTests.class,
    CasWebflowServerSessionContextConfigurationTests.class,
    CasWebflowClientSessionContextConfigurationTests.class
})
public class AllWebflowTestsSuite {
}
