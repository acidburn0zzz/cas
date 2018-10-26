package org.apereo.cas;

import org.apereo.cas.gauth.credential.InMemoryGoogleAuthenticatorTokenCredentialRepositoryTests;
import org.apereo.cas.gauth.credential.RestGoogleAuthenticatorTokenCredentialRepositoryTests;

import org.junit.platform.suite.api.SelectClasses;

/**
 * This is {@link CredentialRepositoryTestsSuite}.
 *
 * @author Misagh Moayyed
 * @since 5.3.0
 */
@SelectClasses({
    InMemoryGoogleAuthenticatorTokenCredentialRepositoryTests.class,
    RestGoogleAuthenticatorTokenCredentialRepositoryTests.class
})
public class CredentialRepositoryTestsSuite {
}
