package org.apereo.cas.configuration;

import lombok.val;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.Assert.*;

/**
 * This is {@link CommaSeparatedStringToThrowablesConverterTests}.
 *
 * @author Misagh Moayyed
 * @since 5.3.0
 */
@ExtendWith(SpringExtension.class)
public class CommaSeparatedStringToThrowablesConverterTests {
    @Test
    public void verifyConverters() {
        val c = new CommaSeparatedStringToThrowablesConverter();
        val list = c.convert(Exception.class.getName() + ',' + RuntimeException.class.getName());
        assertEquals(2, list.size());
    }

    @Test
    public void verifyConverter() {
        val c = new CommaSeparatedStringToThrowablesConverter();
        val list = c.convert(Exception.class.getName());
        assertEquals(1, list.size());
    }
}
