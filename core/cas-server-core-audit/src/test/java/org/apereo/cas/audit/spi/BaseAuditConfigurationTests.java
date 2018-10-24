package org.apereo.cas.audit.spi;

import lombok.val;
import org.apereo.inspektr.audit.AuditActionContext;
import org.apereo.inspektr.audit.AuditTrailManager;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.time.LocalDate;
import java.util.Date;

import static org.junit.Assert.*;

/**
 * This is {@link BaseAuditConfigurationTests}.
 *
 * @author Timur Duehr
 * @since 6.0.0
 */
@ExtendWith(SpringExtension.class)
public abstract class BaseAuditConfigurationTests {
    public abstract AuditTrailManager getAuditTrailManager();

    @Test
    public void verifyAuditManager() {
        val time = LocalDate.now().minusDays(2);
        val ctx = new AuditActionContext("casuser", "TEST", "TEST",
            "CAS", new Date(), "1.2.3.4",
            "1.2.3.4");
        getAuditTrailManager().record(ctx);
        val results = getAuditTrailManager().getAuditRecordsSince(time);
        assertFalse(results.isEmpty());
    }
}
