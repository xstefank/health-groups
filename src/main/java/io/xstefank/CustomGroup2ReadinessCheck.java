package io.xstefank;

import io.smallrye.health.HealthGroup;
import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.HealthCheckResponse;
import org.eclipse.microprofile.health.Readiness;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
@HealthGroup("custom-group-1")
@HealthGroup("custom-group-2")
@Readiness
public class CustomGroup2ReadinessCheck implements HealthCheck {

    @Override
    public HealthCheckResponse call() {
        return HealthCheckResponse.up(CustomGroup2ReadinessCheck.class.getSimpleName());
    }
}

