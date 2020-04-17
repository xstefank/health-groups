package io.xstefank;

import io.smallrye.health.HealthGroup;
import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.HealthCheckResponse;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
@HealthGroup("custom-group-1")
public class CustomGroup1Check implements HealthCheck {
    
    @Override
    public HealthCheckResponse call() {
        return HealthCheckResponse.up(CustomGroup1Check.class.getSimpleName());
    }
}
