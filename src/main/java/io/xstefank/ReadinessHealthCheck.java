package io.xstefank;

import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.HealthCheckResponse;
import org.eclipse.microprofile.health.Readiness;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped // 1. CDI scope
@Readiness         // 2. Qualifier (Readiness, Liveness, Health)
public class ReadinessHealthCheck implements HealthCheck {   // 3. implements HealthCheck interface
    
    @Override
    public HealthCheckResponse call() {
        return HealthCheckResponse.up(ReadinessHealthCheck.class.getSimpleName());
    }
}
